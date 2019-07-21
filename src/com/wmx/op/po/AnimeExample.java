package com.wmx.op.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimeExample() {
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

        public Criteria andAnimeidIsNull() {
            addCriterion("AnimeID is null");
            return (Criteria) this;
        }

        public Criteria andAnimeidIsNotNull() {
            addCriterion("AnimeID is not null");
            return (Criteria) this;
        }

        public Criteria andAnimeidEqualTo(Integer value) {
            addCriterion("AnimeID =", value, "animeid");
            return (Criteria) this;
        }

        public Criteria andAnimeidNotEqualTo(Integer value) {
            addCriterion("AnimeID <>", value, "animeid");
            return (Criteria) this;
        }

        public Criteria andAnimeidGreaterThan(Integer value) {
            addCriterion("AnimeID >", value, "animeid");
            return (Criteria) this;
        }

        public Criteria andAnimeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AnimeID >=", value, "animeid");
            return (Criteria) this;
        }

        public Criteria andAnimeidLessThan(Integer value) {
            addCriterion("AnimeID <", value, "animeid");
            return (Criteria) this;
        }

        public Criteria andAnimeidLessThanOrEqualTo(Integer value) {
            addCriterion("AnimeID <=", value, "animeid");
            return (Criteria) this;
        }

        public Criteria andAnimeidIn(List<Integer> values) {
            addCriterion("AnimeID in", values, "animeid");
            return (Criteria) this;
        }

        public Criteria andAnimeidNotIn(List<Integer> values) {
            addCriterion("AnimeID not in", values, "animeid");
            return (Criteria) this;
        }

        public Criteria andAnimeidBetween(Integer value1, Integer value2) {
            addCriterion("AnimeID between", value1, value2, "animeid");
            return (Criteria) this;
        }

        public Criteria andAnimeidNotBetween(Integer value1, Integer value2) {
            addCriterion("AnimeID not between", value1, value2, "animeid");
            return (Criteria) this;
        }

        public Criteria andAnimepidIsNull() {
            addCriterion("Animepid is null");
            return (Criteria) this;
        }

        public Criteria andAnimepidIsNotNull() {
            addCriterion("Animepid is not null");
            return (Criteria) this;
        }

        public Criteria andAnimepidEqualTo(String value) {
            addCriterion("Animepid =", value, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidNotEqualTo(String value) {
            addCriterion("Animepid <>", value, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidGreaterThan(String value) {
            addCriterion("Animepid >", value, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidGreaterThanOrEqualTo(String value) {
            addCriterion("Animepid >=", value, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidLessThan(String value) {
            addCriterion("Animepid <", value, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidLessThanOrEqualTo(String value) {
            addCriterion("Animepid <=", value, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidLike(String value) {
            addCriterion("Animepid like", value, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidNotLike(String value) {
            addCriterion("Animepid not like", value, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidIn(List<String> values) {
            addCriterion("Animepid in", values, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidNotIn(List<String> values) {
            addCriterion("Animepid not in", values, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidBetween(String value1, String value2) {
            addCriterion("Animepid between", value1, value2, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimepidNotBetween(String value1, String value2) {
            addCriterion("Animepid not between", value1, value2, "animepid");
            return (Criteria) this;
        }

        public Criteria andAnimetitleIsNull() {
            addCriterion("Animetitle is null");
            return (Criteria) this;
        }

        public Criteria andAnimetitleIsNotNull() {
            addCriterion("Animetitle is not null");
            return (Criteria) this;
        }

        public Criteria andAnimetitleEqualTo(String value) {
            addCriterion("Animetitle =", value, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleNotEqualTo(String value) {
            addCriterion("Animetitle <>", value, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleGreaterThan(String value) {
            addCriterion("Animetitle >", value, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleGreaterThanOrEqualTo(String value) {
            addCriterion("Animetitle >=", value, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleLessThan(String value) {
            addCriterion("Animetitle <", value, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleLessThanOrEqualTo(String value) {
            addCriterion("Animetitle <=", value, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleLike(String value) {
            addCriterion("Animetitle like", value, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleNotLike(String value) {
            addCriterion("Animetitle not like", value, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleIn(List<String> values) {
            addCriterion("Animetitle in", values, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleNotIn(List<String> values) {
            addCriterion("Animetitle not in", values, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleBetween(String value1, String value2) {
            addCriterion("Animetitle between", value1, value2, "animetitle");
            return (Criteria) this;
        }

        public Criteria andAnimetitleNotBetween(String value1, String value2) {
            addCriterion("Animetitle not between", value1, value2, "animetitle");
            return (Criteria) this;
        }

        public Criteria andWayIsNull() {
            addCriterion("Way is null");
            return (Criteria) this;
        }

        public Criteria andWayIsNotNull() {
            addCriterion("Way is not null");
            return (Criteria) this;
        }

        public Criteria andWayEqualTo(String value) {
            addCriterion("Way =", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotEqualTo(String value) {
            addCriterion("Way <>", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThan(String value) {
            addCriterion("Way >", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThanOrEqualTo(String value) {
            addCriterion("Way >=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThan(String value) {
            addCriterion("Way <", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThanOrEqualTo(String value) {
            addCriterion("Way <=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLike(String value) {
            addCriterion("Way like", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotLike(String value) {
            addCriterion("Way not like", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayIn(List<String> values) {
            addCriterion("Way in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotIn(List<String> values) {
            addCriterion("Way not in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayBetween(String value1, String value2) {
            addCriterion("Way between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotBetween(String value1, String value2) {
            addCriterion("Way not between", value1, value2, "way");
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