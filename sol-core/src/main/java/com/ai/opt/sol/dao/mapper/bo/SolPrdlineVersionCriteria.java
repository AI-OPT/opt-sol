package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SolPrdlineVersionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SolPrdlineVersionCriteria() {
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

        public Criteria andPrdlineVersionIdIsNull() {
            addCriterion("PRDLINE_VERSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdIsNotNull() {
            addCriterion("PRDLINE_VERSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdEqualTo(String value) {
            addCriterion("PRDLINE_VERSION_ID =", value, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdNotEqualTo(String value) {
            addCriterion("PRDLINE_VERSION_ID <>", value, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdGreaterThan(String value) {
            addCriterion("PRDLINE_VERSION_ID >", value, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRDLINE_VERSION_ID >=", value, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdLessThan(String value) {
            addCriterion("PRDLINE_VERSION_ID <", value, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdLessThanOrEqualTo(String value) {
            addCriterion("PRDLINE_VERSION_ID <=", value, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdLike(String value) {
            addCriterion("PRDLINE_VERSION_ID like", value, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdNotLike(String value) {
            addCriterion("PRDLINE_VERSION_ID not like", value, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdIn(List<String> values) {
            addCriterion("PRDLINE_VERSION_ID in", values, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdNotIn(List<String> values) {
            addCriterion("PRDLINE_VERSION_ID not in", values, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdBetween(String value1, String value2) {
            addCriterion("PRDLINE_VERSION_ID between", value1, value2, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIdNotBetween(String value1, String value2) {
            addCriterion("PRDLINE_VERSION_ID not between", value1, value2, "prdlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdIsNull() {
            addCriterion("PRDLINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdIsNotNull() {
            addCriterion("PRDLINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdEqualTo(String value) {
            addCriterion("PRDLINE_ID =", value, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdNotEqualTo(String value) {
            addCriterion("PRDLINE_ID <>", value, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdGreaterThan(String value) {
            addCriterion("PRDLINE_ID >", value, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRDLINE_ID >=", value, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdLessThan(String value) {
            addCriterion("PRDLINE_ID <", value, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdLessThanOrEqualTo(String value) {
            addCriterion("PRDLINE_ID <=", value, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdLike(String value) {
            addCriterion("PRDLINE_ID like", value, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdNotLike(String value) {
            addCriterion("PRDLINE_ID not like", value, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdIn(List<String> values) {
            addCriterion("PRDLINE_ID in", values, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdNotIn(List<String> values) {
            addCriterion("PRDLINE_ID not in", values, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdBetween(String value1, String value2) {
            addCriterion("PRDLINE_ID between", value1, value2, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineIdNotBetween(String value1, String value2) {
            addCriterion("PRDLINE_ID not between", value1, value2, "prdlineId");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIsNull() {
            addCriterion("PRDLINE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIsNotNull() {
            addCriterion("PRDLINE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionEqualTo(String value) {
            addCriterion("PRDLINE_VERSION =", value, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionNotEqualTo(String value) {
            addCriterion("PRDLINE_VERSION <>", value, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionGreaterThan(String value) {
            addCriterion("PRDLINE_VERSION >", value, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionGreaterThanOrEqualTo(String value) {
            addCriterion("PRDLINE_VERSION >=", value, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionLessThan(String value) {
            addCriterion("PRDLINE_VERSION <", value, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionLessThanOrEqualTo(String value) {
            addCriterion("PRDLINE_VERSION <=", value, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionLike(String value) {
            addCriterion("PRDLINE_VERSION like", value, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionNotLike(String value) {
            addCriterion("PRDLINE_VERSION not like", value, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionIn(List<String> values) {
            addCriterion("PRDLINE_VERSION in", values, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionNotIn(List<String> values) {
            addCriterion("PRDLINE_VERSION not in", values, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionBetween(String value1, String value2) {
            addCriterion("PRDLINE_VERSION between", value1, value2, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andPrdlineVersionNotBetween(String value1, String value2) {
            addCriterion("PRDLINE_VERSION not between", value1, value2, "prdlineVersion");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkIsNull() {
            addCriterion("VERSION_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkIsNotNull() {
            addCriterion("VERSION_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkEqualTo(String value) {
            addCriterion("VERSION_REMARK =", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkNotEqualTo(String value) {
            addCriterion("VERSION_REMARK <>", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkGreaterThan(String value) {
            addCriterion("VERSION_REMARK >", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION_REMARK >=", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkLessThan(String value) {
            addCriterion("VERSION_REMARK <", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkLessThanOrEqualTo(String value) {
            addCriterion("VERSION_REMARK <=", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkLike(String value) {
            addCriterion("VERSION_REMARK like", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkNotLike(String value) {
            addCriterion("VERSION_REMARK not like", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkIn(List<String> values) {
            addCriterion("VERSION_REMARK in", values, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkNotIn(List<String> values) {
            addCriterion("VERSION_REMARK not in", values, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkBetween(String value1, String value2) {
            addCriterion("VERSION_REMARK between", value1, value2, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkNotBetween(String value1, String value2) {
            addCriterion("VERSION_REMARK not between", value1, value2, "versionRemark");
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