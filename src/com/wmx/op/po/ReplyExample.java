package com.wmx.op.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andReplyidIsNull() {
            addCriterion("ReplyID is null");
            return (Criteria) this;
        }

        public Criteria andReplyidIsNotNull() {
            addCriterion("ReplyID is not null");
            return (Criteria) this;
        }

        public Criteria andReplyidEqualTo(Integer value) {
            addCriterion("ReplyID =", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotEqualTo(Integer value) {
            addCriterion("ReplyID <>", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidGreaterThan(Integer value) {
            addCriterion("ReplyID >", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReplyID >=", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidLessThan(Integer value) {
            addCriterion("ReplyID <", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidLessThanOrEqualTo(Integer value) {
            addCriterion("ReplyID <=", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidIn(List<Integer> values) {
            addCriterion("ReplyID in", values, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotIn(List<Integer> values) {
            addCriterion("ReplyID not in", values, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidBetween(Integer value1, Integer value2) {
            addCriterion("ReplyID between", value1, value2, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotBetween(Integer value1, Integer value2) {
            addCriterion("ReplyID not between", value1, value2, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyuseridIsNull() {
            addCriterion("ReplyuserId is null");
            return (Criteria) this;
        }

        public Criteria andReplyuseridIsNotNull() {
            addCriterion("ReplyuserId is not null");
            return (Criteria) this;
        }

        public Criteria andReplyuseridEqualTo(Integer value) {
            addCriterion("ReplyuserId =", value, "replyuserid");
            return (Criteria) this;
        }

        public Criteria andReplyuseridNotEqualTo(Integer value) {
            addCriterion("ReplyuserId <>", value, "replyuserid");
            return (Criteria) this;
        }

        public Criteria andReplyuseridGreaterThan(Integer value) {
            addCriterion("ReplyuserId >", value, "replyuserid");
            return (Criteria) this;
        }

        public Criteria andReplyuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReplyuserId >=", value, "replyuserid");
            return (Criteria) this;
        }

        public Criteria andReplyuseridLessThan(Integer value) {
            addCriterion("ReplyuserId <", value, "replyuserid");
            return (Criteria) this;
        }

        public Criteria andReplyuseridLessThanOrEqualTo(Integer value) {
            addCriterion("ReplyuserId <=", value, "replyuserid");
            return (Criteria) this;
        }

        public Criteria andReplyuseridIn(List<Integer> values) {
            addCriterion("ReplyuserId in", values, "replyuserid");
            return (Criteria) this;
        }

        public Criteria andReplyuseridNotIn(List<Integer> values) {
            addCriterion("ReplyuserId not in", values, "replyuserid");
            return (Criteria) this;
        }

        public Criteria andReplyuseridBetween(Integer value1, Integer value2) {
            addCriterion("ReplyuserId between", value1, value2, "replyuserid");
            return (Criteria) this;
        }

        public Criteria andReplyuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("ReplyuserId not between", value1, value2, "replyuserid");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidIsNull() {
            addCriterion("ReplytoCommentId is null");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidIsNotNull() {
            addCriterion("ReplytoCommentId is not null");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidEqualTo(Integer value) {
            addCriterion("ReplytoCommentId =", value, "replytocommentid");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidNotEqualTo(Integer value) {
            addCriterion("ReplytoCommentId <>", value, "replytocommentid");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidGreaterThan(Integer value) {
            addCriterion("ReplytoCommentId >", value, "replytocommentid");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReplytoCommentId >=", value, "replytocommentid");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidLessThan(Integer value) {
            addCriterion("ReplytoCommentId <", value, "replytocommentid");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidLessThanOrEqualTo(Integer value) {
            addCriterion("ReplytoCommentId <=", value, "replytocommentid");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidIn(List<Integer> values) {
            addCriterion("ReplytoCommentId in", values, "replytocommentid");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidNotIn(List<Integer> values) {
            addCriterion("ReplytoCommentId not in", values, "replytocommentid");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidBetween(Integer value1, Integer value2) {
            addCriterion("ReplytoCommentId between", value1, value2, "replytocommentid");
            return (Criteria) this;
        }

        public Criteria andReplytocommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ReplytoCommentId not between", value1, value2, "replytocommentid");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeIsNull() {
            addCriterion("ReplyAddtime is null");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeIsNotNull() {
            addCriterion("ReplyAddtime is not null");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeEqualTo(Date value) {
            addCriterion("ReplyAddtime =", value, "replyaddtime");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeNotEqualTo(Date value) {
            addCriterion("ReplyAddtime <>", value, "replyaddtime");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeGreaterThan(Date value) {
            addCriterion("ReplyAddtime >", value, "replyaddtime");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ReplyAddtime >=", value, "replyaddtime");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeLessThan(Date value) {
            addCriterion("ReplyAddtime <", value, "replyaddtime");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("ReplyAddtime <=", value, "replyaddtime");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeIn(List<Date> values) {
            addCriterion("ReplyAddtime in", values, "replyaddtime");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeNotIn(List<Date> values) {
            addCriterion("ReplyAddtime not in", values, "replyaddtime");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeBetween(Date value1, Date value2) {
            addCriterion("ReplyAddtime between", value1, value2, "replyaddtime");
            return (Criteria) this;
        }

        public Criteria andReplyaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("ReplyAddtime not between", value1, value2, "replyaddtime");
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