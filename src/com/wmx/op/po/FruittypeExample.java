package com.wmx.op.po;

import java.util.ArrayList;
import java.util.List;

public class FruittypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FruittypeExample() {
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

        public Criteria andFruittypeidIsNull() {
            addCriterion("fruitTypeID is null");
            return (Criteria) this;
        }

        public Criteria andFruittypeidIsNotNull() {
            addCriterion("fruitTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andFruittypeidEqualTo(Integer value) {
            addCriterion("fruitTypeID =", value, "fruittypeid");
            return (Criteria) this;
        }

        public Criteria andFruittypeidNotEqualTo(Integer value) {
            addCriterion("fruitTypeID <>", value, "fruittypeid");
            return (Criteria) this;
        }

        public Criteria andFruittypeidGreaterThan(Integer value) {
            addCriterion("fruitTypeID >", value, "fruittypeid");
            return (Criteria) this;
        }

        public Criteria andFruittypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fruitTypeID >=", value, "fruittypeid");
            return (Criteria) this;
        }

        public Criteria andFruittypeidLessThan(Integer value) {
            addCriterion("fruitTypeID <", value, "fruittypeid");
            return (Criteria) this;
        }

        public Criteria andFruittypeidLessThanOrEqualTo(Integer value) {
            addCriterion("fruitTypeID <=", value, "fruittypeid");
            return (Criteria) this;
        }

        public Criteria andFruittypeidIn(List<Integer> values) {
            addCriterion("fruitTypeID in", values, "fruittypeid");
            return (Criteria) this;
        }

        public Criteria andFruittypeidNotIn(List<Integer> values) {
            addCriterion("fruitTypeID not in", values, "fruittypeid");
            return (Criteria) this;
        }

        public Criteria andFruittypeidBetween(Integer value1, Integer value2) {
            addCriterion("fruitTypeID between", value1, value2, "fruittypeid");
            return (Criteria) this;
        }

        public Criteria andFruittypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("fruitTypeID not between", value1, value2, "fruittypeid");
            return (Criteria) this;
        }

        public Criteria andFruittypeIsNull() {
            addCriterion("fruitType is null");
            return (Criteria) this;
        }

        public Criteria andFruittypeIsNotNull() {
            addCriterion("fruitType is not null");
            return (Criteria) this;
        }

        public Criteria andFruittypeEqualTo(String value) {
            addCriterion("fruitType =", value, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeNotEqualTo(String value) {
            addCriterion("fruitType <>", value, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeGreaterThan(String value) {
            addCriterion("fruitType >", value, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeGreaterThanOrEqualTo(String value) {
            addCriterion("fruitType >=", value, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeLessThan(String value) {
            addCriterion("fruitType <", value, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeLessThanOrEqualTo(String value) {
            addCriterion("fruitType <=", value, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeLike(String value) {
            addCriterion("fruitType like", value, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeNotLike(String value) {
            addCriterion("fruitType not like", value, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeIn(List<String> values) {
            addCriterion("fruitType in", values, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeNotIn(List<String> values) {
            addCriterion("fruitType not in", values, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeBetween(String value1, String value2) {
            addCriterion("fruitType between", value1, value2, "fruittype");
            return (Criteria) this;
        }

        public Criteria andFruittypeNotBetween(String value1, String value2) {
            addCriterion("fruitType not between", value1, value2, "fruittype");
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