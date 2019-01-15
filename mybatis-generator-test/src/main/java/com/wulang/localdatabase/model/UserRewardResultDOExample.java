package com.wulang.localdatabase.model;

import java.util.ArrayList;
import java.util.List;

public class UserRewardResultDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRewardResultDOExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoIsNull() {
            addCriterion("fifty_video is null");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoIsNotNull() {
            addCriterion("fifty_video is not null");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoEqualTo(Integer value) {
            addCriterion("fifty_video =", value, "fiftyVideo");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoNotEqualTo(Integer value) {
            addCriterion("fifty_video <>", value, "fiftyVideo");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoGreaterThan(Integer value) {
            addCriterion("fifty_video >", value, "fiftyVideo");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("fifty_video >=", value, "fiftyVideo");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoLessThan(Integer value) {
            addCriterion("fifty_video <", value, "fiftyVideo");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoLessThanOrEqualTo(Integer value) {
            addCriterion("fifty_video <=", value, "fiftyVideo");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoIn(List<Integer> values) {
            addCriterion("fifty_video in", values, "fiftyVideo");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoNotIn(List<Integer> values) {
            addCriterion("fifty_video not in", values, "fiftyVideo");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoBetween(Integer value1, Integer value2) {
            addCriterion("fifty_video between", value1, value2, "fiftyVideo");
            return (Criteria) this;
        }

        public Criteria andFiftyVideoNotBetween(Integer value1, Integer value2) {
            addCriterion("fifty_video not between", value1, value2, "fiftyVideo");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoIsNull() {
            addCriterion("one_hundred_video is null");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoIsNotNull() {
            addCriterion("one_hundred_video is not null");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoEqualTo(Integer value) {
            addCriterion("one_hundred_video =", value, "oneHundredVideo");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoNotEqualTo(Integer value) {
            addCriterion("one_hundred_video <>", value, "oneHundredVideo");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoGreaterThan(Integer value) {
            addCriterion("one_hundred_video >", value, "oneHundredVideo");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("one_hundred_video >=", value, "oneHundredVideo");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoLessThan(Integer value) {
            addCriterion("one_hundred_video <", value, "oneHundredVideo");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoLessThanOrEqualTo(Integer value) {
            addCriterion("one_hundred_video <=", value, "oneHundredVideo");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoIn(List<Integer> values) {
            addCriterion("one_hundred_video in", values, "oneHundredVideo");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoNotIn(List<Integer> values) {
            addCriterion("one_hundred_video not in", values, "oneHundredVideo");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoBetween(Integer value1, Integer value2) {
            addCriterion("one_hundred_video between", value1, value2, "oneHundredVideo");
            return (Criteria) this;
        }

        public Criteria andOneHundredVideoNotBetween(Integer value1, Integer value2) {
            addCriterion("one_hundred_video not between", value1, value2, "oneHundredVideo");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoIsNull() {
            addCriterion("three_hundred_video is null");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoIsNotNull() {
            addCriterion("three_hundred_video is not null");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoEqualTo(Integer value) {
            addCriterion("three_hundred_video =", value, "threeHundredVideo");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoNotEqualTo(Integer value) {
            addCriterion("three_hundred_video <>", value, "threeHundredVideo");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoGreaterThan(Integer value) {
            addCriterion("three_hundred_video >", value, "threeHundredVideo");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("three_hundred_video >=", value, "threeHundredVideo");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoLessThan(Integer value) {
            addCriterion("three_hundred_video <", value, "threeHundredVideo");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoLessThanOrEqualTo(Integer value) {
            addCriterion("three_hundred_video <=", value, "threeHundredVideo");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoIn(List<Integer> values) {
            addCriterion("three_hundred_video in", values, "threeHundredVideo");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoNotIn(List<Integer> values) {
            addCriterion("three_hundred_video not in", values, "threeHundredVideo");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoBetween(Integer value1, Integer value2) {
            addCriterion("three_hundred_video between", value1, value2, "threeHundredVideo");
            return (Criteria) this;
        }

        public Criteria andThreeHundredVideoNotBetween(Integer value1, Integer value2) {
            addCriterion("three_hundred_video not between", value1, value2, "threeHundredVideo");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Integer value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Integer value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Integer value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Integer value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Integer> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Integer> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Integer value1, Integer value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
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