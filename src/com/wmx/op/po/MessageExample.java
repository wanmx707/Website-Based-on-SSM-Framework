package com.wmx.op.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("MessageID is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("MessageID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(Integer value) {
            addCriterion("MessageID =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(Integer value) {
            addCriterion("MessageID <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(Integer value) {
            addCriterion("MessageID >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MessageID >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(Integer value) {
            addCriterion("MessageID <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(Integer value) {
            addCriterion("MessageID <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<Integer> values) {
            addCriterion("MessageID in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<Integer> values) {
            addCriterion("MessageID not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(Integer value1, Integer value2) {
            addCriterion("MessageID between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("MessageID not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridIsNull() {
            addCriterion("MessageuserId is null");
            return (Criteria) this;
        }

        public Criteria andMessageuseridIsNotNull() {
            addCriterion("MessageuserId is not null");
            return (Criteria) this;
        }

        public Criteria andMessageuseridEqualTo(Integer value) {
            addCriterion("MessageuserId =", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridNotEqualTo(Integer value) {
            addCriterion("MessageuserId <>", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridGreaterThan(Integer value) {
            addCriterion("MessageuserId >", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("MessageuserId >=", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridLessThan(Integer value) {
            addCriterion("MessageuserId <", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridLessThanOrEqualTo(Integer value) {
            addCriterion("MessageuserId <=", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridIn(List<Integer> values) {
            addCriterion("MessageuserId in", values, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridNotIn(List<Integer> values) {
            addCriterion("MessageuserId not in", values, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridBetween(Integer value1, Integer value2) {
            addCriterion("MessageuserId between", value1, value2, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("MessageuserId not between", value1, value2, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeIsNull() {
            addCriterion("AnimeAddtime is null");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeIsNotNull() {
            addCriterion("AnimeAddtime is not null");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeEqualTo(Date value) {
            addCriterion("AnimeAddtime =", value, "animeaddtime");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeNotEqualTo(Date value) {
            addCriterion("AnimeAddtime <>", value, "animeaddtime");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeGreaterThan(Date value) {
            addCriterion("AnimeAddtime >", value, "animeaddtime");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AnimeAddtime >=", value, "animeaddtime");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeLessThan(Date value) {
            addCriterion("AnimeAddtime <", value, "animeaddtime");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("AnimeAddtime <=", value, "animeaddtime");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeIn(List<Date> values) {
            addCriterion("AnimeAddtime in", values, "animeaddtime");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeNotIn(List<Date> values) {
            addCriterion("AnimeAddtime not in", values, "animeaddtime");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeBetween(Date value1, Date value2) {
            addCriterion("AnimeAddtime between", value1, value2, "animeaddtime");
            return (Criteria) this;
        }

        public Criteria andAnimeaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("AnimeAddtime not between", value1, value2, "animeaddtime");
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