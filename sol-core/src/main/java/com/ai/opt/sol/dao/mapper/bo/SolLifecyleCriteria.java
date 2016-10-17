package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SolLifecyleCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SolLifecyleCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andServiceGlobalIdIsNull() {
            addCriterion("SERVICE_GLOBAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdIsNotNull() {
            addCriterion("SERVICE_GLOBAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdEqualTo(String value) {
            addCriterion("SERVICE_GLOBAL_ID =", value, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdNotEqualTo(String value) {
            addCriterion("SERVICE_GLOBAL_ID <>", value, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdGreaterThan(String value) {
            addCriterion("SERVICE_GLOBAL_ID >", value, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_GLOBAL_ID >=", value, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdLessThan(String value) {
            addCriterion("SERVICE_GLOBAL_ID <", value, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_GLOBAL_ID <=", value, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdLike(String value) {
            addCriterion("SERVICE_GLOBAL_ID like", value, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdNotLike(String value) {
            addCriterion("SERVICE_GLOBAL_ID not like", value, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdIn(List<String> values) {
            addCriterion("SERVICE_GLOBAL_ID in", values, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdNotIn(List<String> values) {
            addCriterion("SERVICE_GLOBAL_ID not in", values, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdBetween(String value1, String value2) {
            addCriterion("SERVICE_GLOBAL_ID between", value1, value2, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andServiceGlobalIdNotBetween(String value1, String value2) {
            addCriterion("SERVICE_GLOBAL_ID not between", value1, value2, "serviceGlobalId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdIsNull() {
            addCriterion("PRODUCTLINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductlineIdIsNotNull() {
            addCriterion("PRODUCTLINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductlineIdEqualTo(String value) {
            addCriterion("PRODUCTLINE_ID =", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdNotEqualTo(String value) {
            addCriterion("PRODUCTLINE_ID <>", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdGreaterThan(String value) {
            addCriterion("PRODUCTLINE_ID >", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTLINE_ID >=", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdLessThan(String value) {
            addCriterion("PRODUCTLINE_ID <", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTLINE_ID <=", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdLike(String value) {
            addCriterion("PRODUCTLINE_ID like", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdNotLike(String value) {
            addCriterion("PRODUCTLINE_ID not like", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdIn(List<String> values) {
            addCriterion("PRODUCTLINE_ID in", values, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdNotIn(List<String> values) {
            addCriterion("PRODUCTLINE_ID not in", values, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdBetween(String value1, String value2) {
            addCriterion("PRODUCTLINE_ID between", value1, value2, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCTLINE_ID not between", value1, value2, "productlineId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("CATEGORY_ID =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("CATEGORY_ID <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("CATEGORY_ID >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_ID >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("CATEGORY_ID <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_ID <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("CATEGORY_ID like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("CATEGORY_ID not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("CATEGORY_ID in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("CATEGORY_ID not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("CATEGORY_ID between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_ID not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeIsNull() {
            addCriterion("SERVICE_API_CODE is null");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeIsNotNull() {
            addCriterion("SERVICE_API_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeEqualTo(String value) {
            addCriterion("SERVICE_API_CODE =", value, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeNotEqualTo(String value) {
            addCriterion("SERVICE_API_CODE <>", value, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeGreaterThan(String value) {
            addCriterion("SERVICE_API_CODE >", value, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_API_CODE >=", value, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeLessThan(String value) {
            addCriterion("SERVICE_API_CODE <", value, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_API_CODE <=", value, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeLike(String value) {
            addCriterion("SERVICE_API_CODE like", value, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeNotLike(String value) {
            addCriterion("SERVICE_API_CODE not like", value, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeIn(List<String> values) {
            addCriterion("SERVICE_API_CODE in", values, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeNotIn(List<String> values) {
            addCriterion("SERVICE_API_CODE not in", values, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeBetween(String value1, String value2) {
            addCriterion("SERVICE_API_CODE between", value1, value2, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiCodeNotBetween(String value1, String value2) {
            addCriterion("SERVICE_API_CODE not between", value1, value2, "serviceApiCode");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameIsNull() {
            addCriterion("SERVICE_API_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameIsNotNull() {
            addCriterion("SERVICE_API_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameEqualTo(String value) {
            addCriterion("SERVICE_API_NAME =", value, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameNotEqualTo(String value) {
            addCriterion("SERVICE_API_NAME <>", value, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameGreaterThan(String value) {
            addCriterion("SERVICE_API_NAME >", value, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_API_NAME >=", value, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameLessThan(String value) {
            addCriterion("SERVICE_API_NAME <", value, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_API_NAME <=", value, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameLike(String value) {
            addCriterion("SERVICE_API_NAME like", value, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameNotLike(String value) {
            addCriterion("SERVICE_API_NAME not like", value, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameIn(List<String> values) {
            addCriterion("SERVICE_API_NAME in", values, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameNotIn(List<String> values) {
            addCriterion("SERVICE_API_NAME not in", values, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameBetween(String value1, String value2) {
            addCriterion("SERVICE_API_NAME between", value1, value2, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceApiNameNotBetween(String value1, String value2) {
            addCriterion("SERVICE_API_NAME not between", value1, value2, "serviceApiName");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkIsNull() {
            addCriterion("SERVICE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkIsNotNull() {
            addCriterion("SERVICE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkEqualTo(String value) {
            addCriterion("SERVICE_REMARK =", value, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkNotEqualTo(String value) {
            addCriterion("SERVICE_REMARK <>", value, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkGreaterThan(String value) {
            addCriterion("SERVICE_REMARK >", value, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_REMARK >=", value, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkLessThan(String value) {
            addCriterion("SERVICE_REMARK <", value, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_REMARK <=", value, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkLike(String value) {
            addCriterion("SERVICE_REMARK like", value, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkNotLike(String value) {
            addCriterion("SERVICE_REMARK not like", value, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkIn(List<String> values) {
            addCriterion("SERVICE_REMARK in", values, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkNotIn(List<String> values) {
            addCriterion("SERVICE_REMARK not in", values, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkBetween(String value1, String value2) {
            addCriterion("SERVICE_REMARK between", value1, value2, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceRemarkNotBetween(String value1, String value2) {
            addCriterion("SERVICE_REMARK not between", value1, value2, "serviceRemark");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlIsNull() {
            addCriterion("SERVICE_REQ_DOC_URL is null");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlIsNotNull() {
            addCriterion("SERVICE_REQ_DOC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlEqualTo(String value) {
            addCriterion("SERVICE_REQ_DOC_URL =", value, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlNotEqualTo(String value) {
            addCriterion("SERVICE_REQ_DOC_URL <>", value, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlGreaterThan(String value) {
            addCriterion("SERVICE_REQ_DOC_URL >", value, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_REQ_DOC_URL >=", value, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlLessThan(String value) {
            addCriterion("SERVICE_REQ_DOC_URL <", value, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_REQ_DOC_URL <=", value, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlLike(String value) {
            addCriterion("SERVICE_REQ_DOC_URL like", value, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlNotLike(String value) {
            addCriterion("SERVICE_REQ_DOC_URL not like", value, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlIn(List<String> values) {
            addCriterion("SERVICE_REQ_DOC_URL in", values, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlNotIn(List<String> values) {
            addCriterion("SERVICE_REQ_DOC_URL not in", values, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlBetween(String value1, String value2) {
            addCriterion("SERVICE_REQ_DOC_URL between", value1, value2, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceReqDocUrlNotBetween(String value1, String value2) {
            addCriterion("SERVICE_REQ_DOC_URL not between", value1, value2, "serviceReqDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlIsNull() {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL is null");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlIsNotNull() {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlEqualTo(String value) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL =", value, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlNotEqualTo(String value) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL <>", value, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlGreaterThan(String value) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL >", value, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL >=", value, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlLessThan(String value) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL <", value, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL <=", value, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlLike(String value) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL like", value, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlNotLike(String value) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL not like", value, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlIn(List<String> values) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL in", values, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlNotIn(List<String> values) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL not in", values, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlBetween(String value1, String value2) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL between", value1, value2, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServicePrototypeDocUrlNotBetween(String value1, String value2) {
            addCriterion("SERVICE_PROTOTYPE_DOC_URL not between", value1, value2, "servicePrototypeDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlIsNull() {
            addCriterion("SERVICE_DESIGN_DOC_URL is null");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlIsNotNull() {
            addCriterion("SERVICE_DESIGN_DOC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlEqualTo(String value) {
            addCriterion("SERVICE_DESIGN_DOC_URL =", value, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlNotEqualTo(String value) {
            addCriterion("SERVICE_DESIGN_DOC_URL <>", value, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlGreaterThan(String value) {
            addCriterion("SERVICE_DESIGN_DOC_URL >", value, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_DESIGN_DOC_URL >=", value, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlLessThan(String value) {
            addCriterion("SERVICE_DESIGN_DOC_URL <", value, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_DESIGN_DOC_URL <=", value, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlLike(String value) {
            addCriterion("SERVICE_DESIGN_DOC_URL like", value, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlNotLike(String value) {
            addCriterion("SERVICE_DESIGN_DOC_URL not like", value, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlIn(List<String> values) {
            addCriterion("SERVICE_DESIGN_DOC_URL in", values, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlNotIn(List<String> values) {
            addCriterion("SERVICE_DESIGN_DOC_URL not in", values, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlBetween(String value1, String value2) {
            addCriterion("SERVICE_DESIGN_DOC_URL between", value1, value2, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceDesignDocUrlNotBetween(String value1, String value2) {
            addCriterion("SERVICE_DESIGN_DOC_URL not between", value1, value2, "serviceDesignDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlIsNull() {
            addCriterion("SERVICE_OL_TEST_URL is null");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlIsNotNull() {
            addCriterion("SERVICE_OL_TEST_URL is not null");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlEqualTo(String value) {
            addCriterion("SERVICE_OL_TEST_URL =", value, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlNotEqualTo(String value) {
            addCriterion("SERVICE_OL_TEST_URL <>", value, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlGreaterThan(String value) {
            addCriterion("SERVICE_OL_TEST_URL >", value, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_OL_TEST_URL >=", value, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlLessThan(String value) {
            addCriterion("SERVICE_OL_TEST_URL <", value, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_OL_TEST_URL <=", value, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlLike(String value) {
            addCriterion("SERVICE_OL_TEST_URL like", value, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlNotLike(String value) {
            addCriterion("SERVICE_OL_TEST_URL not like", value, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlIn(List<String> values) {
            addCriterion("SERVICE_OL_TEST_URL in", values, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlNotIn(List<String> values) {
            addCriterion("SERVICE_OL_TEST_URL not in", values, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlBetween(String value1, String value2) {
            addCriterion("SERVICE_OL_TEST_URL between", value1, value2, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceOlTestUrlNotBetween(String value1, String value2) {
            addCriterion("SERVICE_OL_TEST_URL not between", value1, value2, "serviceOlTestUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlIsNull() {
            addCriterion("SERVICE_TEST_DOC_URL is null");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlIsNotNull() {
            addCriterion("SERVICE_TEST_DOC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlEqualTo(String value) {
            addCriterion("SERVICE_TEST_DOC_URL =", value, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlNotEqualTo(String value) {
            addCriterion("SERVICE_TEST_DOC_URL <>", value, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlGreaterThan(String value) {
            addCriterion("SERVICE_TEST_DOC_URL >", value, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TEST_DOC_URL >=", value, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlLessThan(String value) {
            addCriterion("SERVICE_TEST_DOC_URL <", value, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TEST_DOC_URL <=", value, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlLike(String value) {
            addCriterion("SERVICE_TEST_DOC_URL like", value, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlNotLike(String value) {
            addCriterion("SERVICE_TEST_DOC_URL not like", value, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlIn(List<String> values) {
            addCriterion("SERVICE_TEST_DOC_URL in", values, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlNotIn(List<String> values) {
            addCriterion("SERVICE_TEST_DOC_URL not in", values, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlBetween(String value1, String value2) {
            addCriterion("SERVICE_TEST_DOC_URL between", value1, value2, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTestDocUrlNotBetween(String value1, String value2) {
            addCriterion("SERVICE_TEST_DOC_URL not between", value1, value2, "serviceTestDocUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andServiceStateIsNull() {
            addCriterion("SERVICE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andServiceStateIsNotNull() {
            addCriterion("SERVICE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStateEqualTo(String value) {
            addCriterion("SERVICE_STATE =", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotEqualTo(String value) {
            addCriterion("SERVICE_STATE <>", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateGreaterThan(String value) {
            addCriterion("SERVICE_STATE >", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_STATE >=", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLessThan(String value) {
            addCriterion("SERVICE_STATE <", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_STATE <=", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLike(String value) {
            addCriterion("SERVICE_STATE like", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotLike(String value) {
            addCriterion("SERVICE_STATE not like", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateIn(List<String> values) {
            addCriterion("SERVICE_STATE in", values, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotIn(List<String> values) {
            addCriterion("SERVICE_STATE not in", values, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateBetween(String value1, String value2) {
            addCriterion("SERVICE_STATE between", value1, value2, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotBetween(String value1, String value2) {
            addCriterion("SERVICE_STATE not between", value1, value2, "serviceState");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}