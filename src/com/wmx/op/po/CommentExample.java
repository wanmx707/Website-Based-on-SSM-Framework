package com.wmx.op.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("CommentID is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("CommentID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("CommentID =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("CommentID <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("CommentID >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentID >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("CommentID <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("CommentID <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("CommentID in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("CommentID not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("CommentID between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentID not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidIsNull() {
            addCriterion("CommenttoPicId is null");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidIsNotNull() {
            addCriterion("CommenttoPicId is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidEqualTo(Integer value) {
            addCriterion("CommenttoPicId =", value, "commenttopicid");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidNotEqualTo(Integer value) {
            addCriterion("CommenttoPicId <>", value, "commenttopicid");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidGreaterThan(Integer value) {
            addCriterion("CommenttoPicId >", value, "commenttopicid");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommenttoPicId >=", value, "commenttopicid");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidLessThan(Integer value) {
            addCriterion("CommenttoPicId <", value, "commenttopicid");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidLessThanOrEqualTo(Integer value) {
            addCriterion("CommenttoPicId <=", value, "commenttopicid");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidIn(List<Integer> values) {
            addCriterion("CommenttoPicId in", values, "commenttopicid");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidNotIn(List<Integer> values) {
            addCriterion("CommenttoPicId not in", values, "commenttopicid");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidBetween(Integer value1, Integer value2) {
            addCriterion("CommenttoPicId between", value1, value2, "commenttopicid");
            return (Criteria) this;
        }

        public Criteria andCommenttopicidNotBetween(Integer value1, Integer value2) {
            addCriterion("CommenttoPicId not between", value1, value2, "commenttopicid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridIsNull() {
            addCriterion("CommentuserId is null");
            return (Criteria) this;
        }

        public Criteria andCommentuseridIsNotNull() {
            addCriterion("CommentuserId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentuseridEqualTo(Integer value) {
            addCriterion("CommentuserId =", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridNotEqualTo(Integer value) {
            addCriterion("CommentuserId <>", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridGreaterThan(Integer value) {
            addCriterion("CommentuserId >", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentuserId >=", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridLessThan(Integer value) {
            addCriterion("CommentuserId <", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridLessThanOrEqualTo(Integer value) {
            addCriterion("CommentuserId <=", value, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridIn(List<Integer> values) {
            addCriterion("CommentuserId in", values, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridNotIn(List<Integer> values) {
            addCriterion("CommentuserId not in", values, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridBetween(Integer value1, Integer value2) {
            addCriterion("CommentuserId between", value1, value2, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentuserId not between", value1, value2, "commentuserid");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeIsNull() {
            addCriterion("CommentAddtime is null");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeIsNotNull() {
            addCriterion("CommentAddtime is not null");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeEqualTo(Date value) {
            addCriterion("CommentAddtime =", value, "commentaddtime");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeNotEqualTo(Date value) {
            addCriterion("CommentAddtime <>", value, "commentaddtime");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeGreaterThan(Date value) {
            addCriterion("CommentAddtime >", value, "commentaddtime");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CommentAddtime >=", value, "commentaddtime");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeLessThan(Date value) {
            addCriterion("CommentAddtime <", value, "commentaddtime");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("CommentAddtime <=", value, "commentaddtime");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeIn(List<Date> values) {
            addCriterion("CommentAddtime in", values, "commentaddtime");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeNotIn(List<Date> values) {
            addCriterion("CommentAddtime not in", values, "commentaddtime");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeBetween(Date value1, Date value2) {
            addCriterion("CommentAddtime between", value1, value2, "commentaddtime");
            return (Criteria) this;
        }

        public Criteria andCommentaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("CommentAddtime not between", value1, value2, "commentaddtime");
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