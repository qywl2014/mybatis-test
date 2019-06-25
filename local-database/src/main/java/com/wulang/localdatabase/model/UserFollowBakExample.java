package com.wulang.localdatabase.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserFollowBakExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserFollowBakExample() {
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

    public void setLimit(Integer limit) {
        this.limit=limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFollowedidIsNull() {
            addCriterion("followedid is null");
            return (Criteria) this;
        }

        public Criteria andFollowedidIsNotNull() {
            addCriterion("followedid is not null");
            return (Criteria) this;
        }

        public Criteria andFollowedidEqualTo(Integer value) {
            addCriterion("followedid =", value, "followedid");
            return (Criteria) this;
        }

        public Criteria andFollowedidNotEqualTo(Integer value) {
            addCriterion("followedid <>", value, "followedid");
            return (Criteria) this;
        }

        public Criteria andFollowedidGreaterThan(Integer value) {
            addCriterion("followedid >", value, "followedid");
            return (Criteria) this;
        }

        public Criteria andFollowedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("followedid >=", value, "followedid");
            return (Criteria) this;
        }

        public Criteria andFollowedidLessThan(Integer value) {
            addCriterion("followedid <", value, "followedid");
            return (Criteria) this;
        }

        public Criteria andFollowedidLessThanOrEqualTo(Integer value) {
            addCriterion("followedid <=", value, "followedid");
            return (Criteria) this;
        }

        public Criteria andFollowedidIn(List<Integer> values) {
            addCriterion("followedid in", values, "followedid");
            return (Criteria) this;
        }

        public Criteria andFollowedidNotIn(List<Integer> values) {
            addCriterion("followedid not in", values, "followedid");
            return (Criteria) this;
        }

        public Criteria andFollowedidBetween(Integer value1, Integer value2) {
            addCriterion("followedid between", value1, value2, "followedid");
            return (Criteria) this;
        }

        public Criteria andFollowedidNotBetween(Integer value1, Integer value2) {
            addCriterion("followedid not between", value1, value2, "followedid");
            return (Criteria) this;
        }

        public Criteria andDtimeIsNull() {
            addCriterion("dtime is null");
            return (Criteria) this;
        }

        public Criteria andDtimeIsNotNull() {
            addCriterion("dtime is not null");
            return (Criteria) this;
        }

        public Criteria andDtimeEqualTo(Date value) {
            addCriterion("dtime =", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotEqualTo(Date value) {
            addCriterion("dtime <>", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeGreaterThan(Date value) {
            addCriterion("dtime >", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dtime >=", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeLessThan(Date value) {
            addCriterion("dtime <", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeLessThanOrEqualTo(Date value) {
            addCriterion("dtime <=", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeIn(List<Date> values) {
            addCriterion("dtime in", values, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotIn(List<Date> values) {
            addCriterion("dtime not in", values, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeBetween(Date value1, Date value2) {
            addCriterion("dtime between", value1, value2, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotBetween(Date value1, Date value2) {
            addCriterion("dtime not between", value1, value2, "dtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtagIsNull() {
            addCriterion("confirmtag is null");
            return (Criteria) this;
        }

        public Criteria andConfirmtagIsNotNull() {
            addCriterion("confirmtag is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmtagEqualTo(Integer value) {
            addCriterion("confirmtag =", value, "confirmtag");
            return (Criteria) this;
        }

        public Criteria andConfirmtagNotEqualTo(Integer value) {
            addCriterion("confirmtag <>", value, "confirmtag");
            return (Criteria) this;
        }

        public Criteria andConfirmtagGreaterThan(Integer value) {
            addCriterion("confirmtag >", value, "confirmtag");
            return (Criteria) this;
        }

        public Criteria andConfirmtagGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirmtag >=", value, "confirmtag");
            return (Criteria) this;
        }

        public Criteria andConfirmtagLessThan(Integer value) {
            addCriterion("confirmtag <", value, "confirmtag");
            return (Criteria) this;
        }

        public Criteria andConfirmtagLessThanOrEqualTo(Integer value) {
            addCriterion("confirmtag <=", value, "confirmtag");
            return (Criteria) this;
        }

        public Criteria andConfirmtagIn(List<Integer> values) {
            addCriterion("confirmtag in", values, "confirmtag");
            return (Criteria) this;
        }

        public Criteria andConfirmtagNotIn(List<Integer> values) {
            addCriterion("confirmtag not in", values, "confirmtag");
            return (Criteria) this;
        }

        public Criteria andConfirmtagBetween(Integer value1, Integer value2) {
            addCriterion("confirmtag between", value1, value2, "confirmtag");
            return (Criteria) this;
        }

        public Criteria andConfirmtagNotBetween(Integer value1, Integer value2) {
            addCriterion("confirmtag not between", value1, value2, "confirmtag");
            return (Criteria) this;
        }

        public Criteria andOggtagIsNull() {
            addCriterion("oggtag is null");
            return (Criteria) this;
        }

        public Criteria andOggtagIsNotNull() {
            addCriterion("oggtag is not null");
            return (Criteria) this;
        }

        public Criteria andOggtagEqualTo(String value) {
            addCriterion("oggtag =", value, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagNotEqualTo(String value) {
            addCriterion("oggtag <>", value, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagGreaterThan(String value) {
            addCriterion("oggtag >", value, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagGreaterThanOrEqualTo(String value) {
            addCriterion("oggtag >=", value, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagLessThan(String value) {
            addCriterion("oggtag <", value, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagLessThanOrEqualTo(String value) {
            addCriterion("oggtag <=", value, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagLike(String value) {
            addCriterion("oggtag like", value, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagNotLike(String value) {
            addCriterion("oggtag not like", value, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagIn(List<String> values) {
            addCriterion("oggtag in", values, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagNotIn(List<String> values) {
            addCriterion("oggtag not in", values, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagBetween(String value1, String value2) {
            addCriterion("oggtag between", value1, value2, "oggtag");
            return (Criteria) this;
        }

        public Criteria andOggtagNotBetween(String value1, String value2) {
            addCriterion("oggtag not between", value1, value2, "oggtag");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherIsNull() {
            addCriterion("follow_each_other is null");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherIsNotNull() {
            addCriterion("follow_each_other is not null");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherEqualTo(Integer value) {
            addCriterion("follow_each_other =", value, "followEachOther");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherNotEqualTo(Integer value) {
            addCriterion("follow_each_other <>", value, "followEachOther");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherGreaterThan(Integer value) {
            addCriterion("follow_each_other >", value, "followEachOther");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_each_other >=", value, "followEachOther");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherLessThan(Integer value) {
            addCriterion("follow_each_other <", value, "followEachOther");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherLessThanOrEqualTo(Integer value) {
            addCriterion("follow_each_other <=", value, "followEachOther");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherIn(List<Integer> values) {
            addCriterion("follow_each_other in", values, "followEachOther");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherNotIn(List<Integer> values) {
            addCriterion("follow_each_other not in", values, "followEachOther");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherBetween(Integer value1, Integer value2) {
            addCriterion("follow_each_other between", value1, value2, "followEachOther");
            return (Criteria) this;
        }

        public Criteria andFollowEachOtherNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_each_other not between", value1, value2, "followEachOther");
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