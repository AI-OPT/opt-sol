package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SolCategoryCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SolCategoryCriteria() {
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

        public Criteria andCategoryCodeIsNull() {
            addCriterion("CATEGORY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("CATEGORY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("CATEGORY_CODE =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("CATEGORY_CODE <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("CATEGORY_CODE >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_CODE >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("CATEGORY_CODE <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_CODE <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("CATEGORY_CODE like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("CATEGORY_CODE not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("CATEGORY_CODE in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("CATEGORY_CODE not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("CATEGORY_CODE between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_CODE not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("CATEGORY_NAME =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("CATEGORY_NAME <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("CATEGORY_NAME >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("CATEGORY_NAME <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("CATEGORY_NAME like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("CATEGORY_NAME not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("CATEGORY_NAME in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("CATEGORY_NAME not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNull() {
            addCriterion("PARENT_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNotNull() {
            addCriterion("PARENT_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdEqualTo(String value) {
            addCriterion("PARENT_CATEGORY_ID =", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotEqualTo(String value) {
            addCriterion("PARENT_CATEGORY_ID <>", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThan(String value) {
            addCriterion("PARENT_CATEGORY_ID >", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CATEGORY_ID >=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThan(String value) {
            addCriterion("PARENT_CATEGORY_ID <", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_CATEGORY_ID <=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLike(String value) {
            addCriterion("PARENT_CATEGORY_ID like", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotLike(String value) {
            addCriterion("PARENT_CATEGORY_ID not like", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIn(List<String> values) {
            addCriterion("PARENT_CATEGORY_ID in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotIn(List<String> values) {
            addCriterion("PARENT_CATEGORY_ID not in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdBetween(String value1, String value2) {
            addCriterion("PARENT_CATEGORY_ID between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_CATEGORY_ID not between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsIsNull() {
            addCriterion("PARENT_CATEGORY_IDS is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsIsNotNull() {
            addCriterion("PARENT_CATEGORY_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsEqualTo(String value) {
            addCriterion("PARENT_CATEGORY_IDS =", value, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsNotEqualTo(String value) {
            addCriterion("PARENT_CATEGORY_IDS <>", value, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsGreaterThan(String value) {
            addCriterion("PARENT_CATEGORY_IDS >", value, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CATEGORY_IDS >=", value, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsLessThan(String value) {
            addCriterion("PARENT_CATEGORY_IDS <", value, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsLessThanOrEqualTo(String value) {
            addCriterion("PARENT_CATEGORY_IDS <=", value, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsLike(String value) {
            addCriterion("PARENT_CATEGORY_IDS like", value, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsNotLike(String value) {
            addCriterion("PARENT_CATEGORY_IDS not like", value, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsIn(List<String> values) {
            addCriterion("PARENT_CATEGORY_IDS in", values, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsNotIn(List<String> values) {
            addCriterion("PARENT_CATEGORY_IDS not in", values, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsBetween(String value1, String value2) {
            addCriterion("PARENT_CATEGORY_IDS between", value1, value2, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdsNotBetween(String value1, String value2) {
            addCriterion("PARENT_CATEGORY_IDS not between", value1, value2, "parentCategoryIds");
            return (Criteria) this;
        }

        public Criteria andCategorySortIsNull() {
            addCriterion("CATEGORY_SORT is null");
            return (Criteria) this;
        }

        public Criteria andCategorySortIsNotNull() {
            addCriterion("CATEGORY_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andCategorySortEqualTo(Long value) {
            addCriterion("CATEGORY_SORT =", value, "categorySort");
            return (Criteria) this;
        }

        public Criteria andCategorySortNotEqualTo(Long value) {
            addCriterion("CATEGORY_SORT <>", value, "categorySort");
            return (Criteria) this;
        }

        public Criteria andCategorySortGreaterThan(Long value) {
            addCriterion("CATEGORY_SORT >", value, "categorySort");
            return (Criteria) this;
        }

        public Criteria andCategorySortGreaterThanOrEqualTo(Long value) {
            addCriterion("CATEGORY_SORT >=", value, "categorySort");
            return (Criteria) this;
        }

        public Criteria andCategorySortLessThan(Long value) {
            addCriterion("CATEGORY_SORT <", value, "categorySort");
            return (Criteria) this;
        }

        public Criteria andCategorySortLessThanOrEqualTo(Long value) {
            addCriterion("CATEGORY_SORT <=", value, "categorySort");
            return (Criteria) this;
        }

        public Criteria andCategorySortIn(List<Long> values) {
            addCriterion("CATEGORY_SORT in", values, "categorySort");
            return (Criteria) this;
        }

        public Criteria andCategorySortNotIn(List<Long> values) {
            addCriterion("CATEGORY_SORT not in", values, "categorySort");
            return (Criteria) this;
        }

        public Criteria andCategorySortBetween(Long value1, Long value2) {
            addCriterion("CATEGORY_SORT between", value1, value2, "categorySort");
            return (Criteria) this;
        }

        public Criteria andCategorySortNotBetween(Long value1, Long value2) {
            addCriterion("CATEGORY_SORT not between", value1, value2, "categorySort");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkIsNull() {
            addCriterion("CATETORY_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkIsNotNull() {
            addCriterion("CATETORY_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkEqualTo(String value) {
            addCriterion("CATETORY_REMARK =", value, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkNotEqualTo(String value) {
            addCriterion("CATETORY_REMARK <>", value, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkGreaterThan(String value) {
            addCriterion("CATETORY_REMARK >", value, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CATETORY_REMARK >=", value, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkLessThan(String value) {
            addCriterion("CATETORY_REMARK <", value, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkLessThanOrEqualTo(String value) {
            addCriterion("CATETORY_REMARK <=", value, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkLike(String value) {
            addCriterion("CATETORY_REMARK like", value, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkNotLike(String value) {
            addCriterion("CATETORY_REMARK not like", value, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkIn(List<String> values) {
            addCriterion("CATETORY_REMARK in", values, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkNotIn(List<String> values) {
            addCriterion("CATETORY_REMARK not in", values, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkBetween(String value1, String value2) {
            addCriterion("CATETORY_REMARK between", value1, value2, "catetoryRemark");
            return (Criteria) this;
        }

        public Criteria andCatetoryRemarkNotBetween(String value1, String value2) {
            addCriterion("CATETORY_REMARK not between", value1, value2, "catetoryRemark");
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