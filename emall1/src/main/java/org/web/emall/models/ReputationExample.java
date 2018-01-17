package org.web.emall.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReputationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReputationExample() {
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andDateReputationIsNull() {
            addCriterion("date_reputation is null");
            return (Criteria) this;
        }

        public Criteria andDateReputationIsNotNull() {
            addCriterion("date_reputation is not null");
            return (Criteria) this;
        }

        public Criteria andDateReputationEqualTo(Date value) {
            addCriterion("date_reputation =", value, "dateReputation");
            return (Criteria) this;
        }

        public Criteria andDateReputationNotEqualTo(Date value) {
            addCriterion("date_reputation <>", value, "dateReputation");
            return (Criteria) this;
        }

        public Criteria andDateReputationGreaterThan(Date value) {
            addCriterion("date_reputation >", value, "dateReputation");
            return (Criteria) this;
        }

        public Criteria andDateReputationGreaterThanOrEqualTo(Date value) {
            addCriterion("date_reputation >=", value, "dateReputation");
            return (Criteria) this;
        }

        public Criteria andDateReputationLessThan(Date value) {
            addCriterion("date_reputation <", value, "dateReputation");
            return (Criteria) this;
        }

        public Criteria andDateReputationLessThanOrEqualTo(Date value) {
            addCriterion("date_reputation <=", value, "dateReputation");
            return (Criteria) this;
        }

        public Criteria andDateReputationIn(List<Date> values) {
            addCriterion("date_reputation in", values, "dateReputation");
            return (Criteria) this;
        }

        public Criteria andDateReputationNotIn(List<Date> values) {
            addCriterion("date_reputation not in", values, "dateReputation");
            return (Criteria) this;
        }

        public Criteria andDateReputationBetween(Date value1, Date value2) {
            addCriterion("date_reputation between", value1, value2, "dateReputation");
            return (Criteria) this;
        }

        public Criteria andDateReputationNotBetween(Date value1, Date value2) {
            addCriterion("date_reputation not between", value1, value2, "dateReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationIsNull() {
            addCriterion("good_reputation is null");
            return (Criteria) this;
        }

        public Criteria andGoodReputationIsNotNull() {
            addCriterion("good_reputation is not null");
            return (Criteria) this;
        }

        public Criteria andGoodReputationEqualTo(Integer value) {
            addCriterion("good_reputation =", value, "goodReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationNotEqualTo(Integer value) {
            addCriterion("good_reputation <>", value, "goodReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationGreaterThan(Integer value) {
            addCriterion("good_reputation >", value, "goodReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_reputation >=", value, "goodReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationLessThan(Integer value) {
            addCriterion("good_reputation <", value, "goodReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationLessThanOrEqualTo(Integer value) {
            addCriterion("good_reputation <=", value, "goodReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationIn(List<Integer> values) {
            addCriterion("good_reputation in", values, "goodReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationNotIn(List<Integer> values) {
            addCriterion("good_reputation not in", values, "goodReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationBetween(Integer value1, Integer value2) {
            addCriterion("good_reputation between", value1, value2, "goodReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationNotBetween(Integer value1, Integer value2) {
            addCriterion("good_reputation not between", value1, value2, "goodReputation");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkIsNull() {
            addCriterion("good_reputation_remark is null");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkIsNotNull() {
            addCriterion("good_reputation_remark is not null");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkEqualTo(String value) {
            addCriterion("good_reputation_remark =", value, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkNotEqualTo(String value) {
            addCriterion("good_reputation_remark <>", value, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkGreaterThan(String value) {
            addCriterion("good_reputation_remark >", value, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("good_reputation_remark >=", value, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkLessThan(String value) {
            addCriterion("good_reputation_remark <", value, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkLessThanOrEqualTo(String value) {
            addCriterion("good_reputation_remark <=", value, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkLike(String value) {
            addCriterion("good_reputation_remark like", value, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkNotLike(String value) {
            addCriterion("good_reputation_remark not like", value, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkIn(List<String> values) {
            addCriterion("good_reputation_remark in", values, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkNotIn(List<String> values) {
            addCriterion("good_reputation_remark not in", values, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkBetween(String value1, String value2) {
            addCriterion("good_reputation_remark between", value1, value2, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationRemarkNotBetween(String value1, String value2) {
            addCriterion("good_reputation_remark not between", value1, value2, "goodReputationRemark");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrIsNull() {
            addCriterion("good_reputation_str is null");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrIsNotNull() {
            addCriterion("good_reputation_str is not null");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrEqualTo(String value) {
            addCriterion("good_reputation_str =", value, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrNotEqualTo(String value) {
            addCriterion("good_reputation_str <>", value, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrGreaterThan(String value) {
            addCriterion("good_reputation_str >", value, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrGreaterThanOrEqualTo(String value) {
            addCriterion("good_reputation_str >=", value, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrLessThan(String value) {
            addCriterion("good_reputation_str <", value, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrLessThanOrEqualTo(String value) {
            addCriterion("good_reputation_str <=", value, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrLike(String value) {
            addCriterion("good_reputation_str like", value, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrNotLike(String value) {
            addCriterion("good_reputation_str not like", value, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrIn(List<String> values) {
            addCriterion("good_reputation_str in", values, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrNotIn(List<String> values) {
            addCriterion("good_reputation_str not in", values, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrBetween(String value1, String value2) {
            addCriterion("good_reputation_str between", value1, value2, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andGoodReputationStrNotBetween(String value1, String value2) {
            addCriterion("good_reputation_str not between", value1, value2, "goodReputationStr");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
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