package com.wmx.op.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationExample() {
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

        public Criteria andInforidIsNull() {
            addCriterion("InforID is null");
            return (Criteria) this;
        }

        public Criteria andInforidIsNotNull() {
            addCriterion("InforID is not null");
            return (Criteria) this;
        }

        public Criteria andInforidEqualTo(Integer value) {
            addCriterion("InforID =", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidNotEqualTo(Integer value) {
            addCriterion("InforID <>", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidGreaterThan(Integer value) {
            addCriterion("InforID >", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidGreaterThanOrEqualTo(Integer value) {
            addCriterion("InforID >=", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidLessThan(Integer value) {
            addCriterion("InforID <", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidLessThanOrEqualTo(Integer value) {
            addCriterion("InforID <=", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidIn(List<Integer> values) {
            addCriterion("InforID in", values, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidNotIn(List<Integer> values) {
            addCriterion("InforID not in", values, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidBetween(Integer value1, Integer value2) {
            addCriterion("InforID between", value1, value2, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidNotBetween(Integer value1, Integer value2) {
            addCriterion("InforID not between", value1, value2, "inforid");
            return (Criteria) this;
        }

        public Criteria andInfortitleIsNull() {
            addCriterion("Infortitle is null");
            return (Criteria) this;
        }

        public Criteria andInfortitleIsNotNull() {
            addCriterion("Infortitle is not null");
            return (Criteria) this;
        }

        public Criteria andInfortitleEqualTo(String value) {
            addCriterion("Infortitle =", value, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleNotEqualTo(String value) {
            addCriterion("Infortitle <>", value, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleGreaterThan(String value) {
            addCriterion("Infortitle >", value, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleGreaterThanOrEqualTo(String value) {
            addCriterion("Infortitle >=", value, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleLessThan(String value) {
            addCriterion("Infortitle <", value, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleLessThanOrEqualTo(String value) {
            addCriterion("Infortitle <=", value, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleLike(String value) {
            addCriterion("Infortitle like", value, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleNotLike(String value) {
            addCriterion("Infortitle not like", value, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleIn(List<String> values) {
            addCriterion("Infortitle in", values, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleNotIn(List<String> values) {
            addCriterion("Infortitle not in", values, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleBetween(String value1, String value2) {
            addCriterion("Infortitle between", value1, value2, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInfortitleNotBetween(String value1, String value2) {
            addCriterion("Infortitle not between", value1, value2, "infortitle");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeIsNull() {
            addCriterion("InforAddtime is null");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeIsNotNull() {
            addCriterion("InforAddtime is not null");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeEqualTo(Date value) {
            addCriterion("InforAddtime =", value, "inforaddtime");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeNotEqualTo(Date value) {
            addCriterion("InforAddtime <>", value, "inforaddtime");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeGreaterThan(Date value) {
            addCriterion("InforAddtime >", value, "inforaddtime");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("InforAddtime >=", value, "inforaddtime");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeLessThan(Date value) {
            addCriterion("InforAddtime <", value, "inforaddtime");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("InforAddtime <=", value, "inforaddtime");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeIn(List<Date> values) {
            addCriterion("InforAddtime in", values, "inforaddtime");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeNotIn(List<Date> values) {
            addCriterion("InforAddtime not in", values, "inforaddtime");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeBetween(Date value1, Date value2) {
            addCriterion("InforAddtime between", value1, value2, "inforaddtime");
            return (Criteria) this;
        }

        public Criteria andInforaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("InforAddtime not between", value1, value2, "inforaddtime");
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