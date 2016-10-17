package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SolServiceDefineCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SolServiceDefineCriteria() {
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

        public Criteria andSrvApiNameIsNull() {
            addCriterion("SRV_API_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameIsNotNull() {
            addCriterion("SRV_API_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameEqualTo(String value) {
            addCriterion("SRV_API_NAME =", value, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameNotEqualTo(String value) {
            addCriterion("SRV_API_NAME <>", value, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameGreaterThan(String value) {
            addCriterion("SRV_API_NAME >", value, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_API_NAME >=", value, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameLessThan(String value) {
            addCriterion("SRV_API_NAME <", value, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameLessThanOrEqualTo(String value) {
            addCriterion("SRV_API_NAME <=", value, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameLike(String value) {
            addCriterion("SRV_API_NAME like", value, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameNotLike(String value) {
            addCriterion("SRV_API_NAME not like", value, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameIn(List<String> values) {
            addCriterion("SRV_API_NAME in", values, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameNotIn(List<String> values) {
            addCriterion("SRV_API_NAME not in", values, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameBetween(String value1, String value2) {
            addCriterion("SRV_API_NAME between", value1, value2, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvApiNameNotBetween(String value1, String value2) {
            addCriterion("SRV_API_NAME not between", value1, value2, "srvApiName");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkIsNull() {
            addCriterion("SRV_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkIsNotNull() {
            addCriterion("SRV_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkEqualTo(String value) {
            addCriterion("SRV_REMARK =", value, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkNotEqualTo(String value) {
            addCriterion("SRV_REMARK <>", value, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkGreaterThan(String value) {
            addCriterion("SRV_REMARK >", value, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_REMARK >=", value, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkLessThan(String value) {
            addCriterion("SRV_REMARK <", value, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkLessThanOrEqualTo(String value) {
            addCriterion("SRV_REMARK <=", value, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkLike(String value) {
            addCriterion("SRV_REMARK like", value, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkNotLike(String value) {
            addCriterion("SRV_REMARK not like", value, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkIn(List<String> values) {
            addCriterion("SRV_REMARK in", values, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkNotIn(List<String> values) {
            addCriterion("SRV_REMARK not in", values, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkBetween(String value1, String value2) {
            addCriterion("SRV_REMARK between", value1, value2, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvRemarkNotBetween(String value1, String value2) {
            addCriterion("SRV_REMARK not between", value1, value2, "srvRemark");
            return (Criteria) this;
        }

        public Criteria andSrvCenterIsNull() {
            addCriterion("SRV_CENTER is null");
            return (Criteria) this;
        }

        public Criteria andSrvCenterIsNotNull() {
            addCriterion("SRV_CENTER is not null");
            return (Criteria) this;
        }

        public Criteria andSrvCenterEqualTo(String value) {
            addCriterion("SRV_CENTER =", value, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterNotEqualTo(String value) {
            addCriterion("SRV_CENTER <>", value, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterGreaterThan(String value) {
            addCriterion("SRV_CENTER >", value, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_CENTER >=", value, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterLessThan(String value) {
            addCriterion("SRV_CENTER <", value, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterLessThanOrEqualTo(String value) {
            addCriterion("SRV_CENTER <=", value, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterLike(String value) {
            addCriterion("SRV_CENTER like", value, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterNotLike(String value) {
            addCriterion("SRV_CENTER not like", value, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterIn(List<String> values) {
            addCriterion("SRV_CENTER in", values, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterNotIn(List<String> values) {
            addCriterion("SRV_CENTER not in", values, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterBetween(String value1, String value2) {
            addCriterion("SRV_CENTER between", value1, value2, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCenterNotBetween(String value1, String value2) {
            addCriterion("SRV_CENTER not between", value1, value2, "srvCenter");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdIsNull() {
            addCriterion("SRV_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdIsNotNull() {
            addCriterion("SRV_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdEqualTo(String value) {
            addCriterion("SRV_CATEGORY_ID =", value, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdNotEqualTo(String value) {
            addCriterion("SRV_CATEGORY_ID <>", value, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdGreaterThan(String value) {
            addCriterion("SRV_CATEGORY_ID >", value, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_CATEGORY_ID >=", value, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdLessThan(String value) {
            addCriterion("SRV_CATEGORY_ID <", value, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("SRV_CATEGORY_ID <=", value, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdLike(String value) {
            addCriterion("SRV_CATEGORY_ID like", value, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdNotLike(String value) {
            addCriterion("SRV_CATEGORY_ID not like", value, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdIn(List<String> values) {
            addCriterion("SRV_CATEGORY_ID in", values, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdNotIn(List<String> values) {
            addCriterion("SRV_CATEGORY_ID not in", values, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdBetween(String value1, String value2) {
            addCriterion("SRV_CATEGORY_ID between", value1, value2, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvCategoryIdNotBetween(String value1, String value2) {
            addCriterion("SRV_CATEGORY_ID not between", value1, value2, "srvCategoryId");
            return (Criteria) this;
        }

        public Criteria andSrvClassIsNull() {
            addCriterion("SRV_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andSrvClassIsNotNull() {
            addCriterion("SRV_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andSrvClassEqualTo(String value) {
            addCriterion("SRV_CLASS =", value, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassNotEqualTo(String value) {
            addCriterion("SRV_CLASS <>", value, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassGreaterThan(String value) {
            addCriterion("SRV_CLASS >", value, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_CLASS >=", value, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassLessThan(String value) {
            addCriterion("SRV_CLASS <", value, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassLessThanOrEqualTo(String value) {
            addCriterion("SRV_CLASS <=", value, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassLike(String value) {
            addCriterion("SRV_CLASS like", value, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassNotLike(String value) {
            addCriterion("SRV_CLASS not like", value, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassIn(List<String> values) {
            addCriterion("SRV_CLASS in", values, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassNotIn(List<String> values) {
            addCriterion("SRV_CLASS not in", values, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassBetween(String value1, String value2) {
            addCriterion("SRV_CLASS between", value1, value2, "srvClass");
            return (Criteria) this;
        }

        public Criteria andSrvClassNotBetween(String value1, String value2) {
            addCriterion("SRV_CLASS not between", value1, value2, "srvClass");
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