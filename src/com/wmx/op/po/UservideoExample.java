package com.wmx.op.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UservideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UservideoExample() {
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

        public Criteria andVideoidIsNull() {
            addCriterion("videoID is null");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNotNull() {
            addCriterion("videoID is not null");
            return (Criteria) this;
        }

        public Criteria andVideoidEqualTo(Integer value) {
            addCriterion("videoID =", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotEqualTo(Integer value) {
            addCriterion("videoID <>", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThan(Integer value) {
            addCriterion("videoID >", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoID >=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThan(Integer value) {
            addCriterion("videoID <", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThanOrEqualTo(Integer value) {
            addCriterion("videoID <=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidIn(List<Integer> values) {
            addCriterion("videoID in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotIn(List<Integer> values) {
            addCriterion("videoID not in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidBetween(Integer value1, Integer value2) {
            addCriterion("videoID between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoID not between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideotitleIsNull() {
            addCriterion("videotitle is null");
            return (Criteria) this;
        }

        public Criteria andVideotitleIsNotNull() {
            addCriterion("videotitle is not null");
            return (Criteria) this;
        }

        public Criteria andVideotitleEqualTo(String value) {
            addCriterion("videotitle =", value, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleNotEqualTo(String value) {
            addCriterion("videotitle <>", value, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleGreaterThan(String value) {
            addCriterion("videotitle >", value, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleGreaterThanOrEqualTo(String value) {
            addCriterion("videotitle >=", value, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleLessThan(String value) {
            addCriterion("videotitle <", value, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleLessThanOrEqualTo(String value) {
            addCriterion("videotitle <=", value, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleLike(String value) {
            addCriterion("videotitle like", value, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleNotLike(String value) {
            addCriterion("videotitle not like", value, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleIn(List<String> values) {
            addCriterion("videotitle in", values, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleNotIn(List<String> values) {
            addCriterion("videotitle not in", values, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleBetween(String value1, String value2) {
            addCriterion("videotitle between", value1, value2, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideotitleNotBetween(String value1, String value2) {
            addCriterion("videotitle not between", value1, value2, "videotitle");
            return (Criteria) this;
        }

        public Criteria andVideopicIsNull() {
            addCriterion("videopic is null");
            return (Criteria) this;
        }

        public Criteria andVideopicIsNotNull() {
            addCriterion("videopic is not null");
            return (Criteria) this;
        }

        public Criteria andVideopicEqualTo(String value) {
            addCriterion("videopic =", value, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicNotEqualTo(String value) {
            addCriterion("videopic <>", value, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicGreaterThan(String value) {
            addCriterion("videopic >", value, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicGreaterThanOrEqualTo(String value) {
            addCriterion("videopic >=", value, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicLessThan(String value) {
            addCriterion("videopic <", value, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicLessThanOrEqualTo(String value) {
            addCriterion("videopic <=", value, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicLike(String value) {
            addCriterion("videopic like", value, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicNotLike(String value) {
            addCriterion("videopic not like", value, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicIn(List<String> values) {
            addCriterion("videopic in", values, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicNotIn(List<String> values) {
            addCriterion("videopic not in", values, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicBetween(String value1, String value2) {
            addCriterion("videopic between", value1, value2, "videopic");
            return (Criteria) this;
        }

        public Criteria andVideopicNotBetween(String value1, String value2) {
            addCriterion("videopic not between", value1, value2, "videopic");
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

        public Criteria andWayIsNull() {
            addCriterion("way is null");
            return (Criteria) this;
        }

        public Criteria andWayIsNotNull() {
            addCriterion("way is not null");
            return (Criteria) this;
        }

        public Criteria andWayEqualTo(String value) {
            addCriterion("way =", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotEqualTo(String value) {
            addCriterion("way <>", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThan(String value) {
            addCriterion("way >", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThanOrEqualTo(String value) {
            addCriterion("way >=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThan(String value) {
            addCriterion("way <", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThanOrEqualTo(String value) {
            addCriterion("way <=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLike(String value) {
            addCriterion("way like", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotLike(String value) {
            addCriterion("way not like", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayIn(List<String> values) {
            addCriterion("way in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotIn(List<String> values) {
            addCriterion("way not in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayBetween(String value1, String value2) {
            addCriterion("way between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotBetween(String value1, String value2) {
            addCriterion("way not between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeIsNull() {
            addCriterion("videoAddtime is null");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeIsNotNull() {
            addCriterion("videoAddtime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeEqualTo(Date value) {
            addCriterion("videoAddtime =", value, "videoaddtime");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeNotEqualTo(Date value) {
            addCriterion("videoAddtime <>", value, "videoaddtime");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeGreaterThan(Date value) {
            addCriterion("videoAddtime >", value, "videoaddtime");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("videoAddtime >=", value, "videoaddtime");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeLessThan(Date value) {
            addCriterion("videoAddtime <", value, "videoaddtime");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("videoAddtime <=", value, "videoaddtime");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeIn(List<Date> values) {
            addCriterion("videoAddtime in", values, "videoaddtime");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeNotIn(List<Date> values) {
            addCriterion("videoAddtime not in", values, "videoaddtime");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeBetween(Date value1, Date value2) {
            addCriterion("videoAddtime between", value1, value2, "videoaddtime");
            return (Criteria) this;
        }

        public Criteria andVideoaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("videoAddtime not between", value1, value2, "videoaddtime");
            return (Criteria) this;
        }

        public Criteria andStstusIsNull() {
            addCriterion("ststus is null");
            return (Criteria) this;
        }

        public Criteria andStstusIsNotNull() {
            addCriterion("ststus is not null");
            return (Criteria) this;
        }

        public Criteria andStstusEqualTo(Integer value) {
            addCriterion("ststus =", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusNotEqualTo(Integer value) {
            addCriterion("ststus <>", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusGreaterThan(Integer value) {
            addCriterion("ststus >", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ststus >=", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusLessThan(Integer value) {
            addCriterion("ststus <", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusLessThanOrEqualTo(Integer value) {
            addCriterion("ststus <=", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusIn(List<Integer> values) {
            addCriterion("ststus in", values, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusNotIn(List<Integer> values) {
            addCriterion("ststus not in", values, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusBetween(Integer value1, Integer value2) {
            addCriterion("ststus between", value1, value2, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusNotBetween(Integer value1, Integer value2) {
            addCriterion("ststus not between", value1, value2, "ststus");
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