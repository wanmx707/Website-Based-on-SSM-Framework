package com.wmx.op.po;

import java.util.ArrayList;
import java.util.List;

public class ComicsdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComicsdetailExample() {
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

        public Criteria andDetailidIsNull() {
            addCriterion("DetailID is null");
            return (Criteria) this;
        }

        public Criteria andDetailidIsNotNull() {
            addCriterion("DetailID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailidEqualTo(Integer value) {
            addCriterion("DetailID =", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotEqualTo(Integer value) {
            addCriterion("DetailID <>", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThan(Integer value) {
            addCriterion("DetailID >", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DetailID >=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThan(Integer value) {
            addCriterion("DetailID <", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThanOrEqualTo(Integer value) {
            addCriterion("DetailID <=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidIn(List<Integer> values) {
            addCriterion("DetailID in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotIn(List<Integer> values) {
            addCriterion("DetailID not in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidBetween(Integer value1, Integer value2) {
            addCriterion("DetailID between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("DetailID not between", value1, value2, "detailid");
            return (Criteria) this;
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

        public Criteria andDetailpaperIsNull() {
            addCriterion("Detailpaper is null");
            return (Criteria) this;
        }

        public Criteria andDetailpaperIsNotNull() {
            addCriterion("Detailpaper is not null");
            return (Criteria) this;
        }

        public Criteria andDetailpaperEqualTo(String value) {
            addCriterion("Detailpaper =", value, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperNotEqualTo(String value) {
            addCriterion("Detailpaper <>", value, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperGreaterThan(String value) {
            addCriterion("Detailpaper >", value, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperGreaterThanOrEqualTo(String value) {
            addCriterion("Detailpaper >=", value, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperLessThan(String value) {
            addCriterion("Detailpaper <", value, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperLessThanOrEqualTo(String value) {
            addCriterion("Detailpaper <=", value, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperLike(String value) {
            addCriterion("Detailpaper like", value, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperNotLike(String value) {
            addCriterion("Detailpaper not like", value, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperIn(List<String> values) {
            addCriterion("Detailpaper in", values, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperNotIn(List<String> values) {
            addCriterion("Detailpaper not in", values, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperBetween(String value1, String value2) {
            addCriterion("Detailpaper between", value1, value2, "detailpaper");
            return (Criteria) this;
        }

        public Criteria andDetailpaperNotBetween(String value1, String value2) {
            addCriterion("Detailpaper not between", value1, value2, "detailpaper");
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