package com.ai.opt.sol.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SolServiceDesignInputCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SolServiceDesignInputCriteria() {
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

        public Criteria andInputIdIsNull() {
            addCriterion("INPUT_ID is null");
            return (Criteria) this;
        }

        public Criteria andInputIdIsNotNull() {
            addCriterion("INPUT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInputIdEqualTo(String value) {
            addCriterion("INPUT_ID =", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdNotEqualTo(String value) {
            addCriterion("INPUT_ID <>", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdGreaterThan(String value) {
            addCriterion("INPUT_ID >", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_ID >=", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdLessThan(String value) {
            addCriterion("INPUT_ID <", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdLessThanOrEqualTo(String value) {
            addCriterion("INPUT_ID <=", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdLike(String value) {
            addCriterion("INPUT_ID like", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdNotLike(String value) {
            addCriterion("INPUT_ID not like", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdIn(List<String> values) {
            addCriterion("INPUT_ID in", values, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdNotIn(List<String> values) {
            addCriterion("INPUT_ID not in", values, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdBetween(String value1, String value2) {
            addCriterion("INPUT_ID between", value1, value2, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdNotBetween(String value1, String value2) {
            addCriterion("INPUT_ID not between", value1, value2, "inputId");
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

        public Criteria andInputNameIsNull() {
            addCriterion("INPUT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInputNameIsNotNull() {
            addCriterion("INPUT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInputNameEqualTo(String value) {
            addCriterion("INPUT_NAME =", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotEqualTo(String value) {
            addCriterion("INPUT_NAME <>", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameGreaterThan(String value) {
            addCriterion("INPUT_NAME >", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_NAME >=", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameLessThan(String value) {
            addCriterion("INPUT_NAME <", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameLessThanOrEqualTo(String value) {
            addCriterion("INPUT_NAME <=", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameLike(String value) {
            addCriterion("INPUT_NAME like", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotLike(String value) {
            addCriterion("INPUT_NAME not like", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameIn(List<String> values) {
            addCriterion("INPUT_NAME in", values, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotIn(List<String> values) {
            addCriterion("INPUT_NAME not in", values, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameBetween(String value1, String value2) {
            addCriterion("INPUT_NAME between", value1, value2, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotBetween(String value1, String value2) {
            addCriterion("INPUT_NAME not between", value1, value2, "inputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameIsNull() {
            addCriterion("PARENT_INPUT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParentInputNameIsNotNull() {
            addCriterion("PARENT_INPUT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParentInputNameEqualTo(String value) {
            addCriterion("PARENT_INPUT_NAME =", value, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameNotEqualTo(String value) {
            addCriterion("PARENT_INPUT_NAME <>", value, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameGreaterThan(String value) {
            addCriterion("PARENT_INPUT_NAME >", value, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_INPUT_NAME >=", value, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameLessThan(String value) {
            addCriterion("PARENT_INPUT_NAME <", value, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameLessThanOrEqualTo(String value) {
            addCriterion("PARENT_INPUT_NAME <=", value, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameLike(String value) {
            addCriterion("PARENT_INPUT_NAME like", value, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameNotLike(String value) {
            addCriterion("PARENT_INPUT_NAME not like", value, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameIn(List<String> values) {
            addCriterion("PARENT_INPUT_NAME in", values, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameNotIn(List<String> values) {
            addCriterion("PARENT_INPUT_NAME not in", values, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameBetween(String value1, String value2) {
            addCriterion("PARENT_INPUT_NAME between", value1, value2, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andParentInputNameNotBetween(String value1, String value2) {
            addCriterion("PARENT_INPUT_NAME not between", value1, value2, "parentInputName");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIsNull() {
            addCriterion("ISREQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIsNotNull() {
            addCriterion("ISREQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andIsrequiredEqualTo(String value) {
            addCriterion("ISREQUIRED =", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotEqualTo(String value) {
            addCriterion("ISREQUIRED <>", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredGreaterThan(String value) {
            addCriterion("ISREQUIRED >", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredGreaterThanOrEqualTo(String value) {
            addCriterion("ISREQUIRED >=", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLessThan(String value) {
            addCriterion("ISREQUIRED <", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLessThanOrEqualTo(String value) {
            addCriterion("ISREQUIRED <=", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLike(String value) {
            addCriterion("ISREQUIRED like", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotLike(String value) {
            addCriterion("ISREQUIRED not like", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIn(List<String> values) {
            addCriterion("ISREQUIRED in", values, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotIn(List<String> values) {
            addCriterion("ISREQUIRED not in", values, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredBetween(String value1, String value2) {
            addCriterion("ISREQUIRED between", value1, value2, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotBetween(String value1, String value2) {
            addCriterion("ISREQUIRED not between", value1, value2, "isrequired");
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