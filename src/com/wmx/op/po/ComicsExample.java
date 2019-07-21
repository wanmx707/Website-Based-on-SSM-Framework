package com.wmx.op.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComicsExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComicsExample() {
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

        public Criteria andComicsidIsNull() {
            addCriterion("ComicsId is null");
            return (Criteria) this;
        }

        public Criteria andComicsidIsNotNull() {
            addCriterion("ComicsId is not null");
            return (Criteria) this;
        }

        public Criteria andComicsidEqualTo(Integer value) {
            addCriterion("ComicsId =", value, "comicsid");
            return (Criteria) this;
        }

        public Criteria andComicsidNotEqualTo(Integer value) {
            addCriterion("ComicsId <>", value, "comicsid");
            return (Criteria) this;
        }

        public Criteria andComicsidGreaterThan(Integer value) {
            addCriterion("ComicsId >", value, "comicsid");
            return (Criteria) this;
        }

        public Criteria andComicsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ComicsId >=", value, "comicsid");
            return (Criteria) this;
        }

        public Criteria andComicsidLessThan(Integer value) {
            addCriterion("ComicsId <", value, "comicsid");
            return (Criteria) this;
        }

        public Criteria andComicsidLessThanOrEqualTo(Integer value) {
            addCriterion("ComicsId <=", value, "comicsid");
            return (Criteria) this;
        }

        public Criteria andComicsidIn(List<Integer> values) {
            addCriterion("ComicsId in", values, "comicsid");
            return (Criteria) this;
        }

        public Criteria andComicsidNotIn(List<Integer> values) {
            addCriterion("ComicsId not in", values, "comicsid");
            return (Criteria) this;
        }

        public Criteria andComicsidBetween(Integer value1, Integer value2) {
            addCriterion("ComicsId between", value1, value2, "comicsid");
            return (Criteria) this;
        }

        public Criteria andComicsidNotBetween(Integer value1, Integer value2) {
            addCriterion("ComicsId not between", value1, value2, "comicsid");
            return (Criteria) this;
        }

        public Criteria andComicsnameIsNull() {
            addCriterion("ComicsName is null");
            return (Criteria) this;
        }

        public Criteria andComicsnameIsNotNull() {
            addCriterion("ComicsName is not null");
            return (Criteria) this;
        }

        public Criteria andComicsnameEqualTo(String value) {
            addCriterion("ComicsName =", value, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameNotEqualTo(String value) {
            addCriterion("ComicsName <>", value, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameGreaterThan(String value) {
            addCriterion("ComicsName >", value, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameGreaterThanOrEqualTo(String value) {
            addCriterion("ComicsName >=", value, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameLessThan(String value) {
            addCriterion("ComicsName <", value, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameLessThanOrEqualTo(String value) {
            addCriterion("ComicsName <=", value, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameLike(String value) {
            addCriterion("ComicsName like", value, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameNotLike(String value) {
            addCriterion("ComicsName not like", value, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameIn(List<String> values) {
            addCriterion("ComicsName in", values, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameNotIn(List<String> values) {
            addCriterion("ComicsName not in", values, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameBetween(String value1, String value2) {
            addCriterion("ComicsName between", value1, value2, "comicsname");
            return (Criteria) this;
        }

        public Criteria andComicsnameNotBetween(String value1, String value2) {
            addCriterion("ComicsName not between", value1, value2, "comicsname");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("Addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("Addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("Addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("Addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("Addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("Addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("Addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("Addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("Addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("Addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("Addtime not between", value1, value2, "addtime");
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