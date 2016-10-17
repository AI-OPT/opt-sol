package com.ai.opt.sol.api;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.util.APIESProcessor;
import com.ai.runner.apicollector.vo.ElasticIndex;
import com.ai.runner.apicollector.vo.ElasticType;
import com.alibaba.dubbo.common.utils.StringUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class APITest {

    @Test
    public void deleteVersionHistoryForOwner() {
        String owner = "slp-product";
        if (StringUtil.isBlank(owner)) {
            return;
        }
        Client client = APIESProcessor.getElasticSearchHandler().getClient();
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        if (!StringUtils.isBlank(owner)) {
            builder.must(QueryBuilders.termQuery("owner", owner.toLowerCase()));
        }
        SearchResponse response = client.prepareSearch(ElasticIndex.API.name().toLowerCase())
                .setTypes(ElasticType.API_VERSION_HISTORY.name().toLowerCase()).setQuery(builder)
                .setFrom(0).setSize(10000).execute().actionGet();
        SearchHits hits = response.getHits();
        SearchHit[] s = hits.getHits();
        for (SearchHit b : s) {
            System.out.println("删除[" + b.getId() + "]");
            client.prepareDelete(ElasticIndex.API.name().toLowerCase(),
                    ElasticType.API_VERSION_HISTORY.name().toLowerCase(), b.getId()).execute()
                    .actionGet();
        }
    }

    @Test
    public void deleteVersionNewForOwner() {
        String owner = "slp-product";
        if (StringUtil.isBlank(owner)) {
            return;
        }
        Client client = APIESProcessor.getElasticSearchHandler().getClient();
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        if (!StringUtils.isBlank(owner)) {
            builder.must(QueryBuilders.termQuery("owner", owner.toLowerCase()));
        }
        SearchResponse response = client.prepareSearch(ElasticIndex.API.name().toLowerCase())
                .setTypes(ElasticType.API_VERSION_NEW.name().toLowerCase()).setQuery(builder)
                .setFrom(0).setSize(10000).execute().actionGet();
        SearchHits hits = response.getHits();
        SearchHit[] s = hits.getHits();
        for (SearchHit b : s) {
            System.out.println("删除[" + b.getId() + "]");
            client.prepareDelete(ElasticIndex.API.name().toLowerCase(),
                    ElasticType.API_VERSION_NEW.name().toLowerCase(), b.getId()).execute()
                    .actionGet();
        }
    }

    @Test
    public void deleteOwner() {
        String owner = "slp-product";
        Client client = APIESProcessor.getElasticSearchHandler().getClient();
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        if (!StringUtils.isBlank(owner)) {
            builder.must(QueryBuilders.termQuery("owner", owner.toLowerCase()));
        }
        SearchResponse response = client.prepareSearch(ElasticIndex.API.name().toLowerCase())
                .setTypes(ElasticType.API_OWNER.name().toLowerCase()).setQuery(builder).setFrom(0)
                .setSize(25).execute().actionGet();
        SearchHits hits = response.getHits();
        SearchHit[] s = hits.getHits();
        for (SearchHit b : s) {
            System.out.println("删除[" + b.getId() + "]");
            client.prepareDelete(ElasticIndex.API.name().toLowerCase(),
                    ElasticType.API_OWNER.name().toLowerCase(), b.getId()).execute().actionGet();
        }
    }

}
