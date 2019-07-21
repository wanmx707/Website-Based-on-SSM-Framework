package com.wmx.op.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsernewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsernewsExample() {
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

        public Criteria andUsernewsidIsNull() {
            addCriterion("UserNewsID is null");
            return (Criteria) this;
        }

        public Criteria andUsernewsidIsNotNull() {
            addCriterion("UserNewsID is not null");
            return (Criteria) this;
        }

        public Criteria andUsernewsidEqualTo(Integer value) {
            addCriterion("UserNewsID =", value, "usernewsid");
            return (Criteria) this;
        }

        public Criteria andUsernewsidNotEqualTo(Integer value) {
            addCriterion("UserNewsID <>", value, "usernewsid");
            return (Criteria) this;
        }

        public Criteria andUsernewsidGreaterThan(Integer value) {
            addCriterion("UserNewsID >", value, "usernewsid");
            return (Criteria) this;
        }

        public Criteria andUsernewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserNewsID >=", value, "usernewsid");
            return (Criteria) this;
        }

        public Criteria andUsernewsidLessThan(Integer value) {
            addCriterion("UserNewsID <", value, "usernewsid");
            return (Criteria) this;
        }

        public Criteria andUsernewsidLessThanOrEqualTo(Integer value) {
            addCriterion("UserNewsID <=", value, "usernewsid");
            return (Criteria) this;
        }

        public Criteria andUsernewsidIn(List<Integer> values) {
            addCriterion("UserNewsID in", values, "usernewsid");
            return (Criteria) this;
        }

        public Criteria andUsernewsidNotIn(List<Integer> values) {
            addCriterion("UserNewsID not in", values, "usernewsid");
            return (Criteria) this;
        }

        public Criteria andUsernewsidBetween(Integer value1, Integer value2) {
            addCriterion("UserNewsID between", value1, value2, "usernewsid");
            return (Criteria) this;
        }

        public Criteria andUsernewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("UserNewsID not between", value1, value2, "usernewsid");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleIsNull() {
            addCriterion("UserNewstitle is null");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleIsNotNull() {
            addCriterion("UserNewstitle is not null");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleEqualTo(String value) {
            addCriterion("UserNewstitle =", value, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleNotEqualTo(String value) {
            addCriterion("UserNewstitle <>", value, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleGreaterThan(String value) {
            addCriterion("UserNewstitle >", value, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleGreaterThanOrEqualTo(String value) {
            addCriterion("UserNewstitle >=", value, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleLessThan(String value) {
            addCriterion("UserNewstitle <", value, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleLessThanOrEqualTo(String value) {
            addCriterion("UserNewstitle <=", value, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleLike(String value) {
            addCriterion("UserNewstitle like", value, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleNotLike(String value) {
            addCriterion("UserNewstitle not like", value, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleIn(List<String> values) {
            addCriterion("UserNewstitle in", values, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleNotIn(List<String> values) {
            addCriterion("UserNewstitle not in", values, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleBetween(String value1, String value2) {
            addCriterion("UserNewstitle between", value1, value2, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUsernewstitleNotBetween(String value1, String value2) {
            addCriterion("UserNewstitle not between", value1, value2, "usernewstitle");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeIsNull() {
            addCriterion("UserNewsAddtime is null");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeIsNotNull() {
            addCriterion("UserNewsAddtime is not null");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeEqualTo(Date value) {
            addCriterion("UserNewsAddtime =", value, "usernewsaddtime");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeNotEqualTo(Date value) {
            addCriterion("UserNewsAddtime <>", value, "usernewsaddtime");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeGreaterThan(Date value) {
            addCriterion("UserNewsAddtime >", value, "usernewsaddtime");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UserNewsAddtime >=", value, "usernewsaddtime");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeLessThan(Date value) {
            addCriterion("UserNewsAddtime <", value, "usernewsaddtime");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("UserNewsAddtime <=", value, "usernewsaddtime");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeIn(List<Date> values) {
            addCriterion("UserNewsAddtime in", values, "usernewsaddtime");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeNotIn(List<Date> values) {
            addCriterion("UserNewsAddtime not in", values, "usernewsaddtime");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeBetween(Date value1, Date value2) {
            addCriterion("UserNewsAddtime between", value1, value2, "usernewsaddtime");
            return (Criteria) this;
        }

        public Criteria andUsernewsaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("UserNewsAddtime not between", value1, value2, "usernewsaddtime");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
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