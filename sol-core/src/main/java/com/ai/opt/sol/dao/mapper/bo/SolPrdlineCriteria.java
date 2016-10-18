package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SolPrdlineCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SolPrdlineCriteria() {
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

        public Criteria andPrdlineNameIsNull() {
            addCriterion("PRDLINE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameIsNotNull() {
            addCriterion("PRDLINE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameEqualTo(String value) {
            addCriterion("PRDLINE_NAME =", value, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameNotEqualTo(String value) {
            addCriterion("PRDLINE_NAME <>", value, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameGreaterThan(String value) {
            addCriterion("PRDLINE_NAME >", value, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRDLINE_NAME >=", value, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameLessThan(String value) {
            addCriterion("PRDLINE_NAME <", value, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameLessThanOrEqualTo(String value) {
            addCriterion("PRDLINE_NAME <=", value, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameLike(String value) {
            addCriterion("PRDLINE_NAME like", value, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameNotLike(String value) {
            addCriterion("PRDLINE_NAME not like", value, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameIn(List<String> values) {
            addCriterion("PRDLINE_NAME in", values, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameNotIn(List<String> values) {
            addCriterion("PRDLINE_NAME not in", values, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameBetween(String value1, String value2) {
            addCriterion("PRDLINE_NAME between", value1, value2, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineNameNotBetween(String value1, String value2) {
            addCriterion("PRDLINE_NAME not between", value1, value2, "prdlineName");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeIsNull() {
            addCriterion("PRDLINE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeIsNotNull() {
            addCriterion("PRDLINE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeEqualTo(String value) {
            addCriterion("PRDLINE_CODE =", value, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeNotEqualTo(String value) {
            addCriterion("PRDLINE_CODE <>", value, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeGreaterThan(String value) {
            addCriterion("PRDLINE_CODE >", value, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRDLINE_CODE >=", value, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeLessThan(String value) {
            addCriterion("PRDLINE_CODE <", value, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeLessThanOrEqualTo(String value) {
            addCriterion("PRDLINE_CODE <=", value, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeLike(String value) {
            addCriterion("PRDLINE_CODE like", value, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeNotLike(String value) {
            addCriterion("PRDLINE_CODE not like", value, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeIn(List<String> values) {
            addCriterion("PRDLINE_CODE in", values, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeNotIn(List<String> values) {
            addCriterion("PRDLINE_CODE not in", values, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeBetween(String value1, String value2) {
            addCriterion("PRDLINE_CODE between", value1, value2, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineCodeNotBetween(String value1, String value2) {
            addCriterion("PRDLINE_CODE not between", value1, value2, "prdlineCode");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkIsNull() {
            addCriterion("PRDLINE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkIsNotNull() {
            addCriterion("PRDLINE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkEqualTo(String value) {
            addCriterion("PRDLINE_REMARK =", value, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkNotEqualTo(String value) {
            addCriterion("PRDLINE_REMARK <>", value, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkGreaterThan(String value) {
            addCriterion("PRDLINE_REMARK >", value, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PRDLINE_REMARK >=", value, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkLessThan(String value) {
            addCriterion("PRDLINE_REMARK <", value, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkLessThanOrEqualTo(String value) {
            addCriterion("PRDLINE_REMARK <=", value, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkLike(String value) {
            addCriterion("PRDLINE_REMARK like", value, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkNotLike(String value) {
            addCriterion("PRDLINE_REMARK not like", value, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkIn(List<String> values) {
            addCriterion("PRDLINE_REMARK in", values, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkNotIn(List<String> values) {
            addCriterion("PRDLINE_REMARK not in", values, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkBetween(String value1, String value2) {
            addCriterion("PRDLINE_REMARK between", value1, value2, "prdlineRemark");
            return (Criteria) this;
        }

        public Criteria andPrdlineRemarkNotBetween(String value1, String value2) {
            addCriterion("PRDLINE_REMARK not between", value1, value2, "prdlineRemark");
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

        public Criteria andPrdlineManagerIsNull() {
            addCriterion("PRDLINE_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerIsNotNull() {
            addCriterion("PRDLINE_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerEqualTo(String value) {
            addCriterion("PRDLINE_MANAGER =", value, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerNotEqualTo(String value) {
            addCriterion("PRDLINE_MANAGER <>", value, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerGreaterThan(String value) {
            addCriterion("PRDLINE_MANAGER >", value, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerGreaterThanOrEqualTo(String value) {
            addCriterion("PRDLINE_MANAGER >=", value, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerLessThan(String value) {
            addCriterion("PRDLINE_MANAGER <", value, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerLessThanOrEqualTo(String value) {
            addCriterion("PRDLINE_MANAGER <=", value, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerLike(String value) {
            addCriterion("PRDLINE_MANAGER like", value, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerNotLike(String value) {
            addCriterion("PRDLINE_MANAGER not like", value, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerIn(List<String> values) {
            addCriterion("PRDLINE_MANAGER in", values, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerNotIn(List<String> values) {
            addCriterion("PRDLINE_MANAGER not in", values, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerBetween(String value1, String value2) {
            addCriterion("PRDLINE_MANAGER between", value1, value2, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andPrdlineManagerNotBetween(String value1, String value2) {
            addCriterion("PRDLINE_MANAGER not between", value1, value2, "prdlineManager");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNull() {
            addCriterion("INDUSTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNotNull() {
            addCriterion("INDUSTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeEqualTo(String value) {
            addCriterion("INDUSTRY_CODE =", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotEqualTo(String value) {
            addCriterion("INDUSTRY_CODE <>", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThan(String value) {
            addCriterion("INDUSTRY_CODE >", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CODE >=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThan(String value) {
            addCriterion("INDUSTRY_CODE <", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CODE <=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLike(String value) {
            addCriterion("INDUSTRY_CODE like", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotLike(String value) {
            addCriterion("INDUSTRY_CODE not like", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIn(List<String> values) {
            addCriterion("INDUSTRY_CODE in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotIn(List<String> values) {
            addCriterion("INDUSTRY_CODE not in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CODE between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CODE not between", value1, value2, "industryCode");
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