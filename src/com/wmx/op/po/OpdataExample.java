package com.wmx.op.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OpdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpdataExample() {
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

        public Criteria andOpdataidIsNull() {
            addCriterion("opDataID is null");
            return (Criteria) this;
        }

        public Criteria andOpdataidIsNotNull() {
            addCriterion("opDataID is not null");
            return (Criteria) this;
        }

        public Criteria andOpdataidEqualTo(Integer value) {
            addCriterion("opDataID =", value, "opdataid");
            return (Criteria) this;
        }

        public Criteria andOpdataidNotEqualTo(Integer value) {
            addCriterion("opDataID <>", value, "opdataid");
            return (Criteria) this;
        }

        public Criteria andOpdataidGreaterThan(Integer value) {
            addCriterion("opDataID >", value, "opdataid");
            return (Criteria) this;
        }

        public Criteria andOpdataidGreaterThanOrEqualTo(Integer value) {
            addCriterion("opDataID >=", value, "opdataid");
            return (Criteria) this;
        }

        public Criteria andOpdataidLessThan(Integer value) {
            addCriterion("opDataID <", value, "opdataid");
            return (Criteria) this;
        }

        public Criteria andOpdataidLessThanOrEqualTo(Integer value) {
            addCriterion("opDataID <=", value, "opdataid");
            return (Criteria) this;
        }

        public Criteria andOpdataidIn(List<Integer> values) {
            addCriterion("opDataID in", values, "opdataid");
            return (Criteria) this;
        }

        public Criteria andOpdataidNotIn(List<Integer> values) {
            addCriterion("opDataID not in", values, "opdataid");
            return (Criteria) this;
        }

        public Criteria andOpdataidBetween(Integer value1, Integer value2) {
            addCriterion("opDataID between", value1, value2, "opdataid");
            return (Criteria) this;
        }

        public Criteria andOpdataidNotBetween(Integer value1, Integer value2) {
            addCriterion("opDataID not between", value1, value2, "opdataid");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidIsNull() {
            addCriterion("opDataTypeID is null");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidIsNotNull() {
            addCriterion("opDataTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidEqualTo(Integer value) {
            addCriterion("opDataTypeID =", value, "opdatatypeid");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidNotEqualTo(Integer value) {
            addCriterion("opDataTypeID <>", value, "opdatatypeid");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidGreaterThan(Integer value) {
            addCriterion("opDataTypeID >", value, "opdatatypeid");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("opDataTypeID >=", value, "opdatatypeid");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidLessThan(Integer value) {
            addCriterion("opDataTypeID <", value, "opdatatypeid");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidLessThanOrEqualTo(Integer value) {
            addCriterion("opDataTypeID <=", value, "opdatatypeid");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidIn(List<Integer> values) {
            addCriterion("opDataTypeID in", values, "opdatatypeid");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidNotIn(List<Integer> values) {
            addCriterion("opDataTypeID not in", values, "opdatatypeid");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidBetween(Integer value1, Integer value2) {
            addCriterion("opDataTypeID between", value1, value2, "opdatatypeid");
            return (Criteria) this;
        }

        public Criteria andOpdatatypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("opDataTypeID not between", value1, value2, "opdatatypeid");
            return (Criteria) this;
        }

        public Criteria andTitleopdataIsNull() {
            addCriterion("titleopData is null");
            return (Criteria) this;
        }

        public Criteria andTitleopdataIsNotNull() {
            addCriterion("titleopData is not null");
            return (Criteria) this;
        }

        public Criteria andTitleopdataEqualTo(String value) {
            addCriterion("titleopData =", value, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataNotEqualTo(String value) {
            addCriterion("titleopData <>", value, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataGreaterThan(String value) {
            addCriterion("titleopData >", value, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataGreaterThanOrEqualTo(String value) {
            addCriterion("titleopData >=", value, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataLessThan(String value) {
            addCriterion("titleopData <", value, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataLessThanOrEqualTo(String value) {
            addCriterion("titleopData <=", value, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataLike(String value) {
            addCriterion("titleopData like", value, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataNotLike(String value) {
            addCriterion("titleopData not like", value, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataIn(List<String> values) {
            addCriterion("titleopData in", values, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataNotIn(List<String> values) {
            addCriterion("titleopData not in", values, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataBetween(String value1, String value2) {
            addCriterion("titleopData between", value1, value2, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andTitleopdataNotBetween(String value1, String value2) {
            addCriterion("titleopData not between", value1, value2, "titleopdata");
            return (Criteria) this;
        }

        public Criteria andOpdatapicIsNull() {
            addCriterion("opDatapic is null");
            return (Criteria) this;
        }

        public Criteria andOpdatapicIsNotNull() {
            addCriterion("opDatapic is not null");
            return (Criteria) this;
        }

        public Criteria andOpdatapicEqualTo(String value) {
            addCriterion("opDatapic =", value, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicNotEqualTo(String value) {
            addCriterion("opDatapic <>", value, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicGreaterThan(String value) {
            addCriterion("opDatapic >", value, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicGreaterThanOrEqualTo(String value) {
            addCriterion("opDatapic >=", value, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicLessThan(String value) {
            addCriterion("opDatapic <", value, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicLessThanOrEqualTo(String value) {
            addCriterion("opDatapic <=", value, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicLike(String value) {
            addCriterion("opDatapic like", value, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicNotLike(String value) {
            addCriterion("opDatapic not like", value, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicIn(List<String> values) {
            addCriterion("opDatapic in", values, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicNotIn(List<String> values) {
            addCriterion("opDatapic not in", values, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicBetween(String value1, String value2) {
            addCriterion("opDatapic between", value1, value2, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andOpdatapicNotBetween(String value1, String value2) {
            addCriterion("opDatapic not between", value1, value2, "opdatapic");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
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