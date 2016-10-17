package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SolServicePrdlineRelCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SolServicePrdlineRelCriteria() {
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

        public Criteria andSrvPrdlineIdIsNull() {
            addCriterion("SRV_PRDLINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdIsNotNull() {
            addCriterion("SRV_PRDLINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdEqualTo(String value) {
            addCriterion("SRV_PRDLINE_ID =", value, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdNotEqualTo(String value) {
            addCriterion("SRV_PRDLINE_ID <>", value, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdGreaterThan(String value) {
            addCriterion("SRV_PRDLINE_ID >", value, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_PRDLINE_ID >=", value, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdLessThan(String value) {
            addCriterion("SRV_PRDLINE_ID <", value, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdLessThanOrEqualTo(String value) {
            addCriterion("SRV_PRDLINE_ID <=", value, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdLike(String value) {
            addCriterion("SRV_PRDLINE_ID like", value, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdNotLike(String value) {
            addCriterion("SRV_PRDLINE_ID not like", value, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdIn(List<String> values) {
            addCriterion("SRV_PRDLINE_ID in", values, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdNotIn(List<String> values) {
            addCriterion("SRV_PRDLINE_ID not in", values, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdBetween(String value1, String value2) {
            addCriterion("SRV_PRDLINE_ID between", value1, value2, "srvPrdlineId");
            return (Criteria) this;
        }

        public Criteria andSrvPrdlineIdNotBetween(String value1, String value2) {
            addCriterion("SRV_PRDLINE_ID not between", value1, value2, "srvPrdlineId");
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

        public Criteria andPrdVersionIsNull() {
            addCriterion("PRD_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andPrdVersionIsNotNull() {
            addCriterion("PRD_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andPrdVersionEqualTo(String value) {
            addCriterion("PRD_VERSION =", value, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionNotEqualTo(String value) {
            addCriterion("PRD_VERSION <>", value, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionGreaterThan(String value) {
            addCriterion("PRD_VERSION >", value, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_VERSION >=", value, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionLessThan(String value) {
            addCriterion("PRD_VERSION <", value, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionLessThanOrEqualTo(String value) {
            addCriterion("PRD_VERSION <=", value, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionLike(String value) {
            addCriterion("PRD_VERSION like", value, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionNotLike(String value) {
            addCriterion("PRD_VERSION not like", value, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionIn(List<String> values) {
            addCriterion("PRD_VERSION in", values, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionNotIn(List<String> values) {
            addCriterion("PRD_VERSION not in", values, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionBetween(String value1, String value2) {
            addCriterion("PRD_VERSION between", value1, value2, "prdVersion");
            return (Criteria) this;
        }

        public Criteria andPrdVersionNotBetween(String value1, String value2) {
            addCriterion("PRD_VERSION not between", value1, value2, "prdVersion");
            return (Criteria) this;
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