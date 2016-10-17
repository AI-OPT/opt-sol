package com.ai.opt.sol.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SolServiceVersionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SolServiceVersionCriteria() {
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

        public Criteria andSrvVersionIdIsNull() {
            addCriterion("SRV_VERSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdIsNotNull() {
            addCriterion("SRV_VERSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdEqualTo(String value) {
            addCriterion("SRV_VERSION_ID =", value, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdNotEqualTo(String value) {
            addCriterion("SRV_VERSION_ID <>", value, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdGreaterThan(String value) {
            addCriterion("SRV_VERSION_ID >", value, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_VERSION_ID >=", value, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdLessThan(String value) {
            addCriterion("SRV_VERSION_ID <", value, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdLessThanOrEqualTo(String value) {
            addCriterion("SRV_VERSION_ID <=", value, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdLike(String value) {
            addCriterion("SRV_VERSION_ID like", value, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdNotLike(String value) {
            addCriterion("SRV_VERSION_ID not like", value, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdIn(List<String> values) {
            addCriterion("SRV_VERSION_ID in", values, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdNotIn(List<String> values) {
            addCriterion("SRV_VERSION_ID not in", values, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdBetween(String value1, String value2) {
            addCriterion("SRV_VERSION_ID between", value1, value2, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIdNotBetween(String value1, String value2) {
            addCriterion("SRV_VERSION_ID not between", value1, value2, "srvVersionId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdIsNull() {
            addCriterion("SRV_API_ID is null");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdIsNotNull() {
            addCriterion("SRV_API_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdEqualTo(String value) {
            addCriterion("SRV_API_ID =", value, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdNotEqualTo(String value) {
            addCriterion("SRV_API_ID <>", value, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdGreaterThan(String value) {
            addCriterion("SRV_API_ID >", value, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_API_ID >=", value, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdLessThan(String value) {
            addCriterion("SRV_API_ID <", value, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdLessThanOrEqualTo(String value) {
            addCriterion("SRV_API_ID <=", value, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdLike(String value) {
            addCriterion("SRV_API_ID like", value, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdNotLike(String value) {
            addCriterion("SRV_API_ID not like", value, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdIn(List<String> values) {
            addCriterion("SRV_API_ID in", values, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdNotIn(List<String> values) {
            addCriterion("SRV_API_ID not in", values, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdBetween(String value1, String value2) {
            addCriterion("SRV_API_ID between", value1, value2, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvApiIdNotBetween(String value1, String value2) {
            addCriterion("SRV_API_ID not between", value1, value2, "srvApiId");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIsNull() {
            addCriterion("SRV_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIsNotNull() {
            addCriterion("SRV_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andSrvVersionEqualTo(String value) {
            addCriterion("SRV_VERSION =", value, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionNotEqualTo(String value) {
            addCriterion("SRV_VERSION <>", value, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionGreaterThan(String value) {
            addCriterion("SRV_VERSION >", value, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_VERSION >=", value, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionLessThan(String value) {
            addCriterion("SRV_VERSION <", value, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionLessThanOrEqualTo(String value) {
            addCriterion("SRV_VERSION <=", value, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionLike(String value) {
            addCriterion("SRV_VERSION like", value, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionNotLike(String value) {
            addCriterion("SRV_VERSION not like", value, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionIn(List<String> values) {
            addCriterion("SRV_VERSION in", values, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionNotIn(List<String> values) {
            addCriterion("SRV_VERSION not in", values, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionBetween(String value1, String value2) {
            addCriterion("SRV_VERSION between", value1, value2, "srvVersion");
            return (Criteria) this;
        }

        public Criteria andSrvVersionNotBetween(String value1, String value2) {
            addCriterion("SRV_VERSION not between", value1, value2, "srvVersion");
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