package com.ai.opt.sol.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SolServiceDesignOutputCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SolServiceDesignOutputCriteria() {
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

        public Criteria andOutputIdIsNull() {
            addCriterion("OUTPUT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOutputIdIsNotNull() {
            addCriterion("OUTPUT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOutputIdEqualTo(String value) {
            addCriterion("OUTPUT_ID =", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdNotEqualTo(String value) {
            addCriterion("OUTPUT_ID <>", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdGreaterThan(String value) {
            addCriterion("OUTPUT_ID >", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdGreaterThanOrEqualTo(String value) {
            addCriterion("OUTPUT_ID >=", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdLessThan(String value) {
            addCriterion("OUTPUT_ID <", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdLessThanOrEqualTo(String value) {
            addCriterion("OUTPUT_ID <=", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdLike(String value) {
            addCriterion("OUTPUT_ID like", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdNotLike(String value) {
            addCriterion("OUTPUT_ID not like", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdIn(List<String> values) {
            addCriterion("OUTPUT_ID in", values, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdNotIn(List<String> values) {
            addCriterion("OUTPUT_ID not in", values, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdBetween(String value1, String value2) {
            addCriterion("OUTPUT_ID between", value1, value2, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdNotBetween(String value1, String value2) {
            addCriterion("OUTPUT_ID not between", value1, value2, "outputId");
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

        public Criteria andOutputNameIsNull() {
            addCriterion("OUTPUT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOutputNameIsNotNull() {
            addCriterion("OUTPUT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOutputNameEqualTo(String value) {
            addCriterion("OUTPUT_NAME =", value, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameNotEqualTo(String value) {
            addCriterion("OUTPUT_NAME <>", value, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameGreaterThan(String value) {
            addCriterion("OUTPUT_NAME >", value, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameGreaterThanOrEqualTo(String value) {
            addCriterion("OUTPUT_NAME >=", value, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameLessThan(String value) {
            addCriterion("OUTPUT_NAME <", value, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameLessThanOrEqualTo(String value) {
            addCriterion("OUTPUT_NAME <=", value, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameLike(String value) {
            addCriterion("OUTPUT_NAME like", value, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameNotLike(String value) {
            addCriterion("OUTPUT_NAME not like", value, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameIn(List<String> values) {
            addCriterion("OUTPUT_NAME in", values, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameNotIn(List<String> values) {
            addCriterion("OUTPUT_NAME not in", values, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameBetween(String value1, String value2) {
            addCriterion("OUTPUT_NAME between", value1, value2, "outputName");
            return (Criteria) this;
        }

        public Criteria andOutputNameNotBetween(String value1, String value2) {
            addCriterion("OUTPUT_NAME not between", value1, value2, "outputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameIsNull() {
            addCriterion("PARENT_OUTPUT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameIsNotNull() {
            addCriterion("PARENT_OUTPUT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameEqualTo(String value) {
            addCriterion("PARENT_OUTPUT_NAME =", value, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameNotEqualTo(String value) {
            addCriterion("PARENT_OUTPUT_NAME <>", value, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameGreaterThan(String value) {
            addCriterion("PARENT_OUTPUT_NAME >", value, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_OUTPUT_NAME >=", value, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameLessThan(String value) {
            addCriterion("PARENT_OUTPUT_NAME <", value, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameLessThanOrEqualTo(String value) {
            addCriterion("PARENT_OUTPUT_NAME <=", value, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameLike(String value) {
            addCriterion("PARENT_OUTPUT_NAME like", value, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameNotLike(String value) {
            addCriterion("PARENT_OUTPUT_NAME not like", value, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameIn(List<String> values) {
            addCriterion("PARENT_OUTPUT_NAME in", values, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameNotIn(List<String> values) {
            addCriterion("PARENT_OUTPUT_NAME not in", values, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameBetween(String value1, String value2) {
            addCriterion("PARENT_OUTPUT_NAME between", value1, value2, "parentOutputName");
            return (Criteria) this;
        }

        public Criteria andParentOutputNameNotBetween(String value1, String value2) {
            addCriterion("PARENT_OUTPUT_NAME not between", value1, value2, "parentOutputName");
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