package com.wmx.op.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureExample() {
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

        public Criteria andPicidIsNull() {
            addCriterion("picID is null");
            return (Criteria) this;
        }

        public Criteria andPicidIsNotNull() {
            addCriterion("picID is not null");
            return (Criteria) this;
        }

        public Criteria andPicidEqualTo(Integer value) {
            addCriterion("picID =", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotEqualTo(Integer value) {
            addCriterion("picID <>", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidGreaterThan(Integer value) {
            addCriterion("picID >", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("picID >=", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidLessThan(Integer value) {
            addCriterion("picID <", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidLessThanOrEqualTo(Integer value) {
            addCriterion("picID <=", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidIn(List<Integer> values) {
            addCriterion("picID in", values, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotIn(List<Integer> values) {
            addCriterion("picID not in", values, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidBetween(Integer value1, Integer value2) {
            addCriterion("picID between", value1, value2, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotBetween(Integer value1, Integer value2) {
            addCriterion("picID not between", value1, value2, "picid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPicnameIsNull() {
            addCriterion("picname is null");
            return (Criteria) this;
        }

        public Criteria andPicnameIsNotNull() {
            addCriterion("picname is not null");
            return (Criteria) this;
        }

        public Criteria andPicnameEqualTo(String value) {
            addCriterion("picname =", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameNotEqualTo(String value) {
            addCriterion("picname <>", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameGreaterThan(String value) {
            addCriterion("picname >", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameGreaterThanOrEqualTo(String value) {
            addCriterion("picname >=", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameLessThan(String value) {
            addCriterion("picname <", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameLessThanOrEqualTo(String value) {
            addCriterion("picname <=", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameLike(String value) {
            addCriterion("picname like", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameNotLike(String value) {
            addCriterion("picname not like", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameIn(List<String> values) {
            addCriterion("picname in", values, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameNotIn(List<String> values) {
            addCriterion("picname not in", values, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameBetween(String value1, String value2) {
            addCriterion("picname between", value1, value2, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameNotBetween(String value1, String value2) {
            addCriterion("picname not between", value1, value2, "picname");
            return (Criteria) this;
        }

        public Criteria andPicfengmianIsNull() {
            addCriterion("picfengmian is null");
            return (Criteria) this;
        }

        public Criteria andPicfengmianIsNotNull() {
            addCriterion("picfengmian is not null");
            return (Criteria) this;
        }

        public Criteria andPicfengmianEqualTo(String value) {
            addCriterion("picfengmian =", value, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianNotEqualTo(String value) {
            addCriterion("picfengmian <>", value, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianGreaterThan(String value) {
            addCriterion("picfengmian >", value, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianGreaterThanOrEqualTo(String value) {
            addCriterion("picfengmian >=", value, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianLessThan(String value) {
            addCriterion("picfengmian <", value, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianLessThanOrEqualTo(String value) {
            addCriterion("picfengmian <=", value, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianLike(String value) {
            addCriterion("picfengmian like", value, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianNotLike(String value) {
            addCriterion("picfengmian not like", value, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianIn(List<String> values) {
            addCriterion("picfengmian in", values, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianNotIn(List<String> values) {
            addCriterion("picfengmian not in", values, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianBetween(String value1, String value2) {
            addCriterion("picfengmian between", value1, value2, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicfengmianNotBetween(String value1, String value2) {
            addCriterion("picfengmian not between", value1, value2, "picfengmian");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeIsNull() {
            addCriterion("picAddtime is null");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeIsNotNull() {
            addCriterion("picAddtime is not null");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeEqualTo(Date value) {
            addCriterion("picAddtime =", value, "picaddtime");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeNotEqualTo(Date value) {
            addCriterion("picAddtime <>", value, "picaddtime");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeGreaterThan(Date value) {
            addCriterion("picAddtime >", value, "picaddtime");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("picAddtime >=", value, "picaddtime");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeLessThan(Date value) {
            addCriterion("picAddtime <", value, "picaddtime");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("picAddtime <=", value, "picaddtime");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeIn(List<Date> values) {
            addCriterion("picAddtime in", values, "picaddtime");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeNotIn(List<Date> values) {
            addCriterion("picAddtime not in", values, "picaddtime");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeBetween(Date value1, Date value2) {
            addCriterion("picAddtime between", value1, value2, "picaddtime");
            return (Criteria) this;
        }

        public Criteria andPicaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("picAddtime not between", value1, value2, "picaddtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
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