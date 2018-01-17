package org.web.emall.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIsNull() {
            addCriterion("characteristic is null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIsNotNull() {
            addCriterion("characteristic is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicEqualTo(String value) {
            addCriterion("characteristic =", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotEqualTo(String value) {
            addCriterion("characteristic <>", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicGreaterThan(String value) {
            addCriterion("characteristic >", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicGreaterThanOrEqualTo(String value) {
            addCriterion("characteristic >=", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLessThan(String value) {
            addCriterion("characteristic <", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLessThanOrEqualTo(String value) {
            addCriterion("characteristic <=", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLike(String value) {
            addCriterion("characteristic like", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotLike(String value) {
            addCriterion("characteristic not like", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIn(List<String> values) {
            addCriterion("characteristic in", values, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotIn(List<String> values) {
            addCriterion("characteristic not in", values, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicBetween(String value1, String value2) {
            addCriterion("characteristic between", value1, value2, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotBetween(String value1, String value2) {
            addCriterion("characteristic not between", value1, value2, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Double value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Double value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Double value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Double value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Double value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Double value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Double> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Double> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Double value1, Double value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Double value1, Double value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeIsNull() {
            addCriterion("commission_type is null");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeIsNotNull() {
            addCriterion("commission_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeEqualTo(Integer value) {
            addCriterion("commission_type =", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotEqualTo(Integer value) {
            addCriterion("commission_type <>", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeGreaterThan(Integer value) {
            addCriterion("commission_type >", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("commission_type >=", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeLessThan(Integer value) {
            addCriterion("commission_type <", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("commission_type <=", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeIn(List<Integer> values) {
            addCriterion("commission_type in", values, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotIn(List<Integer> values) {
            addCriterion("commission_type not in", values, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeBetween(Integer value1, Integer value2) {
            addCriterion("commission_type between", value1, value2, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("commission_type not between", value1, value2, "commissionType");
            return (Criteria) this;
        }

        public Criteria andDateAddIsNull() {
            addCriterion("date_add is null");
            return (Criteria) this;
        }

        public Criteria andDateAddIsNotNull() {
            addCriterion("date_add is not null");
            return (Criteria) this;
        }

        public Criteria andDateAddEqualTo(Date value) {
            addCriterion("date_add =", value, "dateAdd");
            return (Criteria) this;
        }

        public Criteria andDateAddNotEqualTo(Date value) {
            addCriterion("date_add <>", value, "dateAdd");
            return (Criteria) this;
        }

        public Criteria andDateAddGreaterThan(Date value) {
            addCriterion("date_add >", value, "dateAdd");
            return (Criteria) this;
        }

        public Criteria andDateAddGreaterThanOrEqualTo(Date value) {
            addCriterion("date_add >=", value, "dateAdd");
            return (Criteria) this;
        }

        public Criteria andDateAddLessThan(Date value) {
            addCriterion("date_add <", value, "dateAdd");
            return (Criteria) this;
        }

        public Criteria andDateAddLessThanOrEqualTo(Date value) {
            addCriterion("date_add <=", value, "dateAdd");
            return (Criteria) this;
        }

        public Criteria andDateAddIn(List<Date> values) {
            addCriterion("date_add in", values, "dateAdd");
            return (Criteria) this;
        }

        public Criteria andDateAddNotIn(List<Date> values) {
            addCriterion("date_add not in", values, "dateAdd");
            return (Criteria) this;
        }

        public Criteria andDateAddBetween(Date value1, Date value2) {
            addCriterion("date_add between", value1, value2, "dateAdd");
            return (Criteria) this;
        }

        public Criteria andDateAddNotBetween(Date value1, Date value2) {
            addCriterion("date_add not between", value1, value2, "dateAdd");
            return (Criteria) this;
        }

        public Criteria andDateStartIsNull() {
            addCriterion("date_start is null");
            return (Criteria) this;
        }

        public Criteria andDateStartIsNotNull() {
            addCriterion("date_start is not null");
            return (Criteria) this;
        }

        public Criteria andDateStartEqualTo(Date value) {
            addCriterion("date_start =", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartNotEqualTo(Date value) {
            addCriterion("date_start <>", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartGreaterThan(Date value) {
            addCriterion("date_start >", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartGreaterThanOrEqualTo(Date value) {
            addCriterion("date_start >=", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartLessThan(Date value) {
            addCriterion("date_start <", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartLessThanOrEqualTo(Date value) {
            addCriterion("date_start <=", value, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartIn(List<Date> values) {
            addCriterion("date_start in", values, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartNotIn(List<Date> values) {
            addCriterion("date_start not in", values, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartBetween(Date value1, Date value2) {
            addCriterion("date_start between", value1, value2, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateStartNotBetween(Date value1, Date value2) {
            addCriterion("date_start not between", value1, value2, "dateStart");
            return (Criteria) this;
        }

        public Criteria andDateUpdateIsNull() {
            addCriterion("date_update is null");
            return (Criteria) this;
        }

        public Criteria andDateUpdateIsNotNull() {
            addCriterion("date_update is not null");
            return (Criteria) this;
        }

        public Criteria andDateUpdateEqualTo(Date value) {
            addCriterion("date_update =", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateNotEqualTo(Date value) {
            addCriterion("date_update <>", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateGreaterThan(Date value) {
            addCriterion("date_update >", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("date_update >=", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateLessThan(Date value) {
            addCriterion("date_update <", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateLessThanOrEqualTo(Date value) {
            addCriterion("date_update <=", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateIn(List<Date> values) {
            addCriterion("date_update in", values, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateNotIn(List<Date> values) {
            addCriterion("date_update not in", values, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateBetween(Date value1, Date value2) {
            addCriterion("date_update between", value1, value2, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateNotBetween(Date value1, Date value2) {
            addCriterion("date_update not between", value1, value2, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIsNull() {
            addCriterion("logistics_id is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIsNotNull() {
            addCriterion("logistics_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdEqualTo(Integer value) {
            addCriterion("logistics_id =", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotEqualTo(Integer value) {
            addCriterion("logistics_id <>", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdGreaterThan(Integer value) {
            addCriterion("logistics_id >", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_id >=", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdLessThan(Integer value) {
            addCriterion("logistics_id <", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_id <=", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIn(List<Integer> values) {
            addCriterion("logistics_id in", values, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotIn(List<Integer> values) {
            addCriterion("logistics_id not in", values, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdBetween(Integer value1, Integer value2) {
            addCriterion("logistics_id between", value1, value2, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_id not between", value1, value2, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNull() {
            addCriterion("min_price is null");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNotNull() {
            addCriterion("min_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinPriceEqualTo(Double value) {
            addCriterion("min_price =", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotEqualTo(Double value) {
            addCriterion("min_price <>", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThan(Double value) {
            addCriterion("min_price >", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("min_price >=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThan(Double value) {
            addCriterion("min_price <", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThanOrEqualTo(Double value) {
            addCriterion("min_price <=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceIn(List<Double> values) {
            addCriterion("min_price in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotIn(List<Double> values) {
            addCriterion("min_price not in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceBetween(Double value1, Double value2) {
            addCriterion("min_price between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotBetween(Double value1, Double value2) {
            addCriterion("min_price not between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNumberFavIsNull() {
            addCriterion("number_fav is null");
            return (Criteria) this;
        }

        public Criteria andNumberFavIsNotNull() {
            addCriterion("number_fav is not null");
            return (Criteria) this;
        }

        public Criteria andNumberFavEqualTo(Integer value) {
            addCriterion("number_fav =", value, "numberFav");
            return (Criteria) this;
        }

        public Criteria andNumberFavNotEqualTo(Integer value) {
            addCriterion("number_fav <>", value, "numberFav");
            return (Criteria) this;
        }

        public Criteria andNumberFavGreaterThan(Integer value) {
            addCriterion("number_fav >", value, "numberFav");
            return (Criteria) this;
        }

        public Criteria andNumberFavGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_fav >=", value, "numberFav");
            return (Criteria) this;
        }

        public Criteria andNumberFavLessThan(Integer value) {
            addCriterion("number_fav <", value, "numberFav");
            return (Criteria) this;
        }

        public Criteria andNumberFavLessThanOrEqualTo(Integer value) {
            addCriterion("number_fav <=", value, "numberFav");
            return (Criteria) this;
        }

        public Criteria andNumberFavIn(List<Integer> values) {
            addCriterion("number_fav in", values, "numberFav");
            return (Criteria) this;
        }

        public Criteria andNumberFavNotIn(List<Integer> values) {
            addCriterion("number_fav not in", values, "numberFav");
            return (Criteria) this;
        }

        public Criteria andNumberFavBetween(Integer value1, Integer value2) {
            addCriterion("number_fav between", value1, value2, "numberFav");
            return (Criteria) this;
        }

        public Criteria andNumberFavNotBetween(Integer value1, Integer value2) {
            addCriterion("number_fav not between", value1, value2, "numberFav");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationIsNull() {
            addCriterion("number_good_reputation is null");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationIsNotNull() {
            addCriterion("number_good_reputation is not null");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationEqualTo(Integer value) {
            addCriterion("number_good_reputation =", value, "numberGoodReputation");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationNotEqualTo(Integer value) {
            addCriterion("number_good_reputation <>", value, "numberGoodReputation");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationGreaterThan(Integer value) {
            addCriterion("number_good_reputation >", value, "numberGoodReputation");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_good_reputation >=", value, "numberGoodReputation");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationLessThan(Integer value) {
            addCriterion("number_good_reputation <", value, "numberGoodReputation");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationLessThanOrEqualTo(Integer value) {
            addCriterion("number_good_reputation <=", value, "numberGoodReputation");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationIn(List<Integer> values) {
            addCriterion("number_good_reputation in", values, "numberGoodReputation");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationNotIn(List<Integer> values) {
            addCriterion("number_good_reputation not in", values, "numberGoodReputation");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationBetween(Integer value1, Integer value2) {
            addCriterion("number_good_reputation between", value1, value2, "numberGoodReputation");
            return (Criteria) this;
        }

        public Criteria andNumberGoodReputationNotBetween(Integer value1, Integer value2) {
            addCriterion("number_good_reputation not between", value1, value2, "numberGoodReputation");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersIsNull() {
            addCriterion("number_orders is null");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersIsNotNull() {
            addCriterion("number_orders is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersEqualTo(Integer value) {
            addCriterion("number_orders =", value, "numberOrders");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersNotEqualTo(Integer value) {
            addCriterion("number_orders <>", value, "numberOrders");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersGreaterThan(Integer value) {
            addCriterion("number_orders >", value, "numberOrders");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_orders >=", value, "numberOrders");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersLessThan(Integer value) {
            addCriterion("number_orders <", value, "numberOrders");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("number_orders <=", value, "numberOrders");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersIn(List<Integer> values) {
            addCriterion("number_orders in", values, "numberOrders");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersNotIn(List<Integer> values) {
            addCriterion("number_orders not in", values, "numberOrders");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersBetween(Integer value1, Integer value2) {
            addCriterion("number_orders between", value1, value2, "numberOrders");
            return (Criteria) this;
        }

        public Criteria andNumberOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("number_orders not between", value1, value2, "numberOrders");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("original_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("original_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(Double value) {
            addCriterion("original_price =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(Double value) {
            addCriterion("original_price <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(Double value) {
            addCriterion("original_price >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("original_price >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(Double value) {
            addCriterion("original_price <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(Double value) {
            addCriterion("original_price <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<Double> values) {
            addCriterion("original_price in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<Double> values) {
            addCriterion("original_price not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(Double value1, Double value2) {
            addCriterion("original_price between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(Double value1, Double value2) {
            addCriterion("original_price not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andPaixuIsNull() {
            addCriterion("paixu is null");
            return (Criteria) this;
        }

        public Criteria andPaixuIsNotNull() {
            addCriterion("paixu is not null");
            return (Criteria) this;
        }

        public Criteria andPaixuEqualTo(Integer value) {
            addCriterion("paixu =", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotEqualTo(Integer value) {
            addCriterion("paixu <>", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuGreaterThan(Integer value) {
            addCriterion("paixu >", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuGreaterThanOrEqualTo(Integer value) {
            addCriterion("paixu >=", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuLessThan(Integer value) {
            addCriterion("paixu <", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuLessThanOrEqualTo(Integer value) {
            addCriterion("paixu <=", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuIn(List<Integer> values) {
            addCriterion("paixu in", values, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotIn(List<Integer> values) {
            addCriterion("paixu not in", values, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuBetween(Integer value1, Integer value2) {
            addCriterion("paixu between", value1, value2, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotBetween(Integer value1, Integer value2) {
            addCriterion("paixu not between", value1, value2, "paixu");
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

        public Criteria andPropertyIdsIsNull() {
            addCriterion("property_ids is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsIsNotNull() {
            addCriterion("property_ids is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsEqualTo(String value) {
            addCriterion("property_ids =", value, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsNotEqualTo(String value) {
            addCriterion("property_ids <>", value, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsGreaterThan(String value) {
            addCriterion("property_ids >", value, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsGreaterThanOrEqualTo(String value) {
            addCriterion("property_ids >=", value, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsLessThan(String value) {
            addCriterion("property_ids <", value, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsLessThanOrEqualTo(String value) {
            addCriterion("property_ids <=", value, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsLike(String value) {
            addCriterion("property_ids like", value, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsNotLike(String value) {
            addCriterion("property_ids not like", value, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsIn(List<String> values) {
            addCriterion("property_ids in", values, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsNotIn(List<String> values) {
            addCriterion("property_ids not in", values, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsBetween(String value1, String value2) {
            addCriterion("property_ids between", value1, value2, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andPropertyIdsNotBetween(String value1, String value2) {
            addCriterion("property_ids not between", value1, value2, "propertyIds");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIsNull() {
            addCriterion("recommend_status is null");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIsNotNull() {
            addCriterion("recommend_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusEqualTo(Integer value) {
            addCriterion("recommend_status =", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotEqualTo(Integer value) {
            addCriterion("recommend_status <>", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusGreaterThan(Integer value) {
            addCriterion("recommend_status >", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_status >=", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusLessThan(Integer value) {
            addCriterion("recommend_status <", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_status <=", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIn(List<Integer> values) {
            addCriterion("recommend_status in", values, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotIn(List<Integer> values) {
            addCriterion("recommend_status not in", values, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusBetween(Integer value1, Integer value2) {
            addCriterion("recommend_status between", value1, value2, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_status not between", value1, value2, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrIsNull() {
            addCriterion("recommend_status_str is null");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrIsNotNull() {
            addCriterion("recommend_status_str is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrEqualTo(String value) {
            addCriterion("recommend_status_str =", value, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrNotEqualTo(String value) {
            addCriterion("recommend_status_str <>", value, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrGreaterThan(String value) {
            addCriterion("recommend_status_str >", value, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_status_str >=", value, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrLessThan(String value) {
            addCriterion("recommend_status_str <", value, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrLessThanOrEqualTo(String value) {
            addCriterion("recommend_status_str <=", value, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrLike(String value) {
            addCriterion("recommend_status_str like", value, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrNotLike(String value) {
            addCriterion("recommend_status_str not like", value, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrIn(List<String> values) {
            addCriterion("recommend_status_str in", values, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrNotIn(List<String> values) {
            addCriterion("recommend_status_str not in", values, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrBetween(String value1, String value2) {
            addCriterion("recommend_status_str between", value1, value2, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusStrNotBetween(String value1, String value2) {
            addCriterion("recommend_status_str not between", value1, value2, "recommendStatusStr");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusStrIsNull() {
            addCriterion("status_str is null");
            return (Criteria) this;
        }

        public Criteria andStatusStrIsNotNull() {
            addCriterion("status_str is not null");
            return (Criteria) this;
        }

        public Criteria andStatusStrEqualTo(String value) {
            addCriterion("status_str =", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrNotEqualTo(String value) {
            addCriterion("status_str <>", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrGreaterThan(String value) {
            addCriterion("status_str >", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrGreaterThanOrEqualTo(String value) {
            addCriterion("status_str >=", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrLessThan(String value) {
            addCriterion("status_str <", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrLessThanOrEqualTo(String value) {
            addCriterion("status_str <=", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrLike(String value) {
            addCriterion("status_str like", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrNotLike(String value) {
            addCriterion("status_str not like", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrIn(List<String> values) {
            addCriterion("status_str in", values, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrNotIn(List<String> values) {
            addCriterion("status_str not in", values, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrBetween(String value1, String value2) {
            addCriterion("status_str between", value1, value2, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrNotBetween(String value1, String value2) {
            addCriterion("status_str not between", value1, value2, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStoresIsNull() {
            addCriterion("stores is null");
            return (Criteria) this;
        }

        public Criteria andStoresIsNotNull() {
            addCriterion("stores is not null");
            return (Criteria) this;
        }

        public Criteria andStoresEqualTo(Integer value) {
            addCriterion("stores =", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresNotEqualTo(Integer value) {
            addCriterion("stores <>", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresGreaterThan(Integer value) {
            addCriterion("stores >", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresGreaterThanOrEqualTo(Integer value) {
            addCriterion("stores >=", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresLessThan(Integer value) {
            addCriterion("stores <", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresLessThanOrEqualTo(Integer value) {
            addCriterion("stores <=", value, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresIn(List<Integer> values) {
            addCriterion("stores in", values, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresNotIn(List<Integer> values) {
            addCriterion("stores not in", values, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresBetween(Integer value1, Integer value2) {
            addCriterion("stores between", value1, value2, "stores");
            return (Criteria) this;
        }

        public Criteria andStoresNotBetween(Integer value1, Integer value2) {
            addCriterion("stores not between", value1, value2, "stores");
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

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
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