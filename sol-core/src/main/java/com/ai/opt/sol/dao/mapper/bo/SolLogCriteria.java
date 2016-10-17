package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SolLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SolLogCriteria() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(String value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(String value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(String value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(String value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(String value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLike(String value) {
            addCriterion("LOG_ID like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotLike(String value) {
            addCriterion("LOG_ID not like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<String> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<String> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(String value1, String value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(String value1, String value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("LOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("LOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("LOG_TYPE =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("LOG_TYPE <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("LOG_TYPE >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("LOG_TYPE <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("LOG_TYPE like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("LOG_TYPE not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("LOG_TYPE in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("LOG_TYPE not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("LOG_TYPE between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("LOG_TYPE not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogModelIsNull() {
            addCriterion("LOG_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andLogModelIsNotNull() {
            addCriterion("LOG_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andLogModelEqualTo(String value) {
            addCriterion("LOG_MODEL =", value, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelNotEqualTo(String value) {
            addCriterion("LOG_MODEL <>", value, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelGreaterThan(String value) {
            addCriterion("LOG_MODEL >", value, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_MODEL >=", value, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelLessThan(String value) {
            addCriterion("LOG_MODEL <", value, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelLessThanOrEqualTo(String value) {
            addCriterion("LOG_MODEL <=", value, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelLike(String value) {
            addCriterion("LOG_MODEL like", value, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelNotLike(String value) {
            addCriterion("LOG_MODEL not like", value, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelIn(List<String> values) {
            addCriterion("LOG_MODEL in", values, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelNotIn(List<String> values) {
            addCriterion("LOG_MODEL not in", values, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelBetween(String value1, String value2) {
            addCriterion("LOG_MODEL between", value1, value2, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogModelNotBetween(String value1, String value2) {
            addCriterion("LOG_MODEL not between", value1, value2, "logModel");
            return (Criteria) this;
        }

        public Criteria andLogRemarkIsNull() {
            addCriterion("LOG_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andLogRemarkIsNotNull() {
            addCriterion("LOG_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andLogRemarkEqualTo(String value) {
            addCriterion("LOG_REMARK =", value, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkNotEqualTo(String value) {
            addCriterion("LOG_REMARK <>", value, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkGreaterThan(String value) {
            addCriterion("LOG_REMARK >", value, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_REMARK >=", value, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkLessThan(String value) {
            addCriterion("LOG_REMARK <", value, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkLessThanOrEqualTo(String value) {
            addCriterion("LOG_REMARK <=", value, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkLike(String value) {
            addCriterion("LOG_REMARK like", value, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkNotLike(String value) {
            addCriterion("LOG_REMARK not like", value, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkIn(List<String> values) {
            addCriterion("LOG_REMARK in", values, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkNotIn(List<String> values) {
            addCriterion("LOG_REMARK not in", values, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkBetween(String value1, String value2) {
            addCriterion("LOG_REMARK between", value1, value2, "logRemark");
            return (Criteria) this;
        }

        public Criteria andLogRemarkNotBetween(String value1, String value2) {
            addCriterion("LOG_REMARK not between", value1, value2, "logRemark");
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