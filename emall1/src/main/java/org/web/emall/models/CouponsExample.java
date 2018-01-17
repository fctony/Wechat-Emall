package org.web.emall.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponsExample() {
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

        public Criteria andDateEndDaysIsNull() {
            addCriterion("date_end_days is null");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysIsNotNull() {
            addCriterion("date_end_days is not null");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysEqualTo(Integer value) {
            addCriterion("date_end_days =", value, "dateEndDays");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysNotEqualTo(Integer value) {
            addCriterion("date_end_days <>", value, "dateEndDays");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysGreaterThan(Integer value) {
            addCriterion("date_end_days >", value, "dateEndDays");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_end_days >=", value, "dateEndDays");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysLessThan(Integer value) {
            addCriterion("date_end_days <", value, "dateEndDays");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysLessThanOrEqualTo(Integer value) {
            addCriterion("date_end_days <=", value, "dateEndDays");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysIn(List<Integer> values) {
            addCriterion("date_end_days in", values, "dateEndDays");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysNotIn(List<Integer> values) {
            addCriterion("date_end_days not in", values, "dateEndDays");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysBetween(Integer value1, Integer value2) {
            addCriterion("date_end_days between", value1, value2, "dateEndDays");
            return (Criteria) this;
        }

        public Criteria andDateEndDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("date_end_days not between", value1, value2, "dateEndDays");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeIsNull() {
            addCriterion("date_end_type is null");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeIsNotNull() {
            addCriterion("date_end_type is not null");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeEqualTo(Integer value) {
            addCriterion("date_end_type =", value, "dateEndType");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeNotEqualTo(Integer value) {
            addCriterion("date_end_type <>", value, "dateEndType");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeGreaterThan(Integer value) {
            addCriterion("date_end_type >", value, "dateEndType");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_end_type >=", value, "dateEndType");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeLessThan(Integer value) {
            addCriterion("date_end_type <", value, "dateEndType");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeLessThanOrEqualTo(Integer value) {
            addCriterion("date_end_type <=", value, "dateEndType");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeIn(List<Integer> values) {
            addCriterion("date_end_type in", values, "dateEndType");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeNotIn(List<Integer> values) {
            addCriterion("date_end_type not in", values, "dateEndType");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeBetween(Integer value1, Integer value2) {
            addCriterion("date_end_type between", value1, value2, "dateEndType");
            return (Criteria) this;
        }

        public Criteria andDateEndTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("date_end_type not between", value1, value2, "dateEndType");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeIsNull() {
            addCriterion("date_start_type is null");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeIsNotNull() {
            addCriterion("date_start_type is not null");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeEqualTo(Integer value) {
            addCriterion("date_start_type =", value, "dateStartType");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeNotEqualTo(Integer value) {
            addCriterion("date_start_type <>", value, "dateStartType");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeGreaterThan(Integer value) {
            addCriterion("date_start_type >", value, "dateStartType");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_start_type >=", value, "dateStartType");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeLessThan(Integer value) {
            addCriterion("date_start_type <", value, "dateStartType");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeLessThanOrEqualTo(Integer value) {
            addCriterion("date_start_type <=", value, "dateStartType");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeIn(List<Integer> values) {
            addCriterion("date_start_type in", values, "dateStartType");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeNotIn(List<Integer> values) {
            addCriterion("date_start_type not in", values, "dateStartType");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeBetween(Integer value1, Integer value2) {
            addCriterion("date_start_type between", value1, value2, "dateStartType");
            return (Criteria) this;
        }

        public Criteria andDateStartTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("date_start_type not between", value1, value2, "dateStartType");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdIsNull() {
            addCriterion("money_hreshold is null");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdIsNotNull() {
            addCriterion("money_hreshold is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdEqualTo(Integer value) {
            addCriterion("money_hreshold =", value, "moneyHreshold");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdNotEqualTo(Integer value) {
            addCriterion("money_hreshold <>", value, "moneyHreshold");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdGreaterThan(Integer value) {
            addCriterion("money_hreshold >", value, "moneyHreshold");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("money_hreshold >=", value, "moneyHreshold");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdLessThan(Integer value) {
            addCriterion("money_hreshold <", value, "moneyHreshold");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdLessThanOrEqualTo(Integer value) {
            addCriterion("money_hreshold <=", value, "moneyHreshold");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdIn(List<Integer> values) {
            addCriterion("money_hreshold in", values, "moneyHreshold");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdNotIn(List<Integer> values) {
            addCriterion("money_hreshold not in", values, "moneyHreshold");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdBetween(Integer value1, Integer value2) {
            addCriterion("money_hreshold between", value1, value2, "moneyHreshold");
            return (Criteria) this;
        }

        public Criteria andMoneyHresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("money_hreshold not between", value1, value2, "moneyHreshold");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxIsNull() {
            addCriterion("money_max is null");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxIsNotNull() {
            addCriterion("money_max is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxEqualTo(Double value) {
            addCriterion("money_max =", value, "moneyMax");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxNotEqualTo(Double value) {
            addCriterion("money_max <>", value, "moneyMax");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxGreaterThan(Double value) {
            addCriterion("money_max >", value, "moneyMax");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("money_max >=", value, "moneyMax");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxLessThan(Double value) {
            addCriterion("money_max <", value, "moneyMax");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxLessThanOrEqualTo(Double value) {
            addCriterion("money_max <=", value, "moneyMax");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxIn(List<Double> values) {
            addCriterion("money_max in", values, "moneyMax");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxNotIn(List<Double> values) {
            addCriterion("money_max not in", values, "moneyMax");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxBetween(Double value1, Double value2) {
            addCriterion("money_max between", value1, value2, "moneyMax");
            return (Criteria) this;
        }

        public Criteria andMoneyMaxNotBetween(Double value1, Double value2) {
            addCriterion("money_max not between", value1, value2, "moneyMax");
            return (Criteria) this;
        }

        public Criteria andMoneyMinIsNull() {
            addCriterion("money_min is null");
            return (Criteria) this;
        }

        public Criteria andMoneyMinIsNotNull() {
            addCriterion("money_min is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyMinEqualTo(Double value) {
            addCriterion("money_min =", value, "moneyMin");
            return (Criteria) this;
        }

        public Criteria andMoneyMinNotEqualTo(Double value) {
            addCriterion("money_min <>", value, "moneyMin");
            return (Criteria) this;
        }

        public Criteria andMoneyMinGreaterThan(Double value) {
            addCriterion("money_min >", value, "moneyMin");
            return (Criteria) this;
        }

        public Criteria andMoneyMinGreaterThanOrEqualTo(Double value) {
            addCriterion("money_min >=", value, "moneyMin");
            return (Criteria) this;
        }

        public Criteria andMoneyMinLessThan(Double value) {
            addCriterion("money_min <", value, "moneyMin");
            return (Criteria) this;
        }

        public Criteria andMoneyMinLessThanOrEqualTo(Double value) {
            addCriterion("money_min <=", value, "moneyMin");
            return (Criteria) this;
        }

        public Criteria andMoneyMinIn(List<Double> values) {
            addCriterion("money_min in", values, "moneyMin");
            return (Criteria) this;
        }

        public Criteria andMoneyMinNotIn(List<Double> values) {
            addCriterion("money_min not in", values, "moneyMin");
            return (Criteria) this;
        }

        public Criteria andMoneyMinBetween(Double value1, Double value2) {
            addCriterion("money_min between", value1, value2, "moneyMin");
            return (Criteria) this;
        }

        public Criteria andMoneyMinNotBetween(Double value1, Double value2) {
            addCriterion("money_min not between", value1, value2, "moneyMin");
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

        public Criteria andNeedscoreIsNull() {
            addCriterion("needScore is null");
            return (Criteria) this;
        }

        public Criteria andNeedscoreIsNotNull() {
            addCriterion("needScore is not null");
            return (Criteria) this;
        }

        public Criteria andNeedscoreEqualTo(Integer value) {
            addCriterion("needScore =", value, "needscore");
            return (Criteria) this;
        }

        public Criteria andNeedscoreNotEqualTo(Integer value) {
            addCriterion("needScore <>", value, "needscore");
            return (Criteria) this;
        }

        public Criteria andNeedscoreGreaterThan(Integer value) {
            addCriterion("needScore >", value, "needscore");
            return (Criteria) this;
        }

        public Criteria andNeedscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("needScore >=", value, "needscore");
            return (Criteria) this;
        }

        public Criteria andNeedscoreLessThan(Integer value) {
            addCriterion("needScore <", value, "needscore");
            return (Criteria) this;
        }

        public Criteria andNeedscoreLessThanOrEqualTo(Integer value) {
            addCriterion("needScore <=", value, "needscore");
            return (Criteria) this;
        }

        public Criteria andNeedscoreIn(List<Integer> values) {
            addCriterion("needScore in", values, "needscore");
            return (Criteria) this;
        }

        public Criteria andNeedscoreNotIn(List<Integer> values) {
            addCriterion("needScore not in", values, "needscore");
            return (Criteria) this;
        }

        public Criteria andNeedscoreBetween(Integer value1, Integer value2) {
            addCriterion("needScore between", value1, value2, "needscore");
            return (Criteria) this;
        }

        public Criteria andNeedscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("needScore not between", value1, value2, "needscore");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberIsNull() {
            addCriterion("number_git_number is null");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberIsNotNull() {
            addCriterion("number_git_number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberEqualTo(Integer value) {
            addCriterion("number_git_number =", value, "numberGitNumber");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberNotEqualTo(Integer value) {
            addCriterion("number_git_number <>", value, "numberGitNumber");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberGreaterThan(Integer value) {
            addCriterion("number_git_number >", value, "numberGitNumber");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_git_number >=", value, "numberGitNumber");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberLessThan(Integer value) {
            addCriterion("number_git_number <", value, "numberGitNumber");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number_git_number <=", value, "numberGitNumber");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberIn(List<Integer> values) {
            addCriterion("number_git_number in", values, "numberGitNumber");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberNotIn(List<Integer> values) {
            addCriterion("number_git_number not in", values, "numberGitNumber");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberBetween(Integer value1, Integer value2) {
            addCriterion("number_git_number between", value1, value2, "numberGitNumber");
            return (Criteria) this;
        }

        public Criteria andNumberGitNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number_git_number not between", value1, value2, "numberGitNumber");
            return (Criteria) this;
        }

        public Criteria andNumberGitIsNull() {
            addCriterion("number_git is null");
            return (Criteria) this;
        }

        public Criteria andNumberGitIsNotNull() {
            addCriterion("number_git is not null");
            return (Criteria) this;
        }

        public Criteria andNumberGitEqualTo(Integer value) {
            addCriterion("number_git =", value, "numberGit");
            return (Criteria) this;
        }

        public Criteria andNumberGitNotEqualTo(Integer value) {
            addCriterion("number_git <>", value, "numberGit");
            return (Criteria) this;
        }

        public Criteria andNumberGitGreaterThan(Integer value) {
            addCriterion("number_git >", value, "numberGit");
            return (Criteria) this;
        }

        public Criteria andNumberGitGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_git >=", value, "numberGit");
            return (Criteria) this;
        }

        public Criteria andNumberGitLessThan(Integer value) {
            addCriterion("number_git <", value, "numberGit");
            return (Criteria) this;
        }

        public Criteria andNumberGitLessThanOrEqualTo(Integer value) {
            addCriterion("number_git <=", value, "numberGit");
            return (Criteria) this;
        }

        public Criteria andNumberGitIn(List<Integer> values) {
            addCriterion("number_git in", values, "numberGit");
            return (Criteria) this;
        }

        public Criteria andNumberGitNotIn(List<Integer> values) {
            addCriterion("number_git not in", values, "numberGit");
            return (Criteria) this;
        }

        public Criteria andNumberGitBetween(Integer value1, Integer value2) {
            addCriterion("number_git between", value1, value2, "numberGit");
            return (Criteria) this;
        }

        public Criteria andNumberGitNotBetween(Integer value1, Integer value2) {
            addCriterion("number_git not between", value1, value2, "numberGit");
            return (Criteria) this;
        }

        public Criteria andNumberLeftIsNull() {
            addCriterion("number_left is null");
            return (Criteria) this;
        }

        public Criteria andNumberLeftIsNotNull() {
            addCriterion("number_left is not null");
            return (Criteria) this;
        }

        public Criteria andNumberLeftEqualTo(Integer value) {
            addCriterion("number_left =", value, "numberLeft");
            return (Criteria) this;
        }

        public Criteria andNumberLeftNotEqualTo(Integer value) {
            addCriterion("number_left <>", value, "numberLeft");
            return (Criteria) this;
        }

        public Criteria andNumberLeftGreaterThan(Integer value) {
            addCriterion("number_left >", value, "numberLeft");
            return (Criteria) this;
        }

        public Criteria andNumberLeftGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_left >=", value, "numberLeft");
            return (Criteria) this;
        }

        public Criteria andNumberLeftLessThan(Integer value) {
            addCriterion("number_left <", value, "numberLeft");
            return (Criteria) this;
        }

        public Criteria andNumberLeftLessThanOrEqualTo(Integer value) {
            addCriterion("number_left <=", value, "numberLeft");
            return (Criteria) this;
        }

        public Criteria andNumberLeftIn(List<Integer> values) {
            addCriterion("number_left in", values, "numberLeft");
            return (Criteria) this;
        }

        public Criteria andNumberLeftNotIn(List<Integer> values) {
            addCriterion("number_left not in", values, "numberLeft");
            return (Criteria) this;
        }

        public Criteria andNumberLeftBetween(Integer value1, Integer value2) {
            addCriterion("number_left between", value1, value2, "numberLeft");
            return (Criteria) this;
        }

        public Criteria andNumberLeftNotBetween(Integer value1, Integer value2) {
            addCriterion("number_left not between", value1, value2, "numberLeft");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxIsNull() {
            addCriterion("number_person_max is null");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxIsNotNull() {
            addCriterion("number_person_max is not null");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxEqualTo(Integer value) {
            addCriterion("number_person_max =", value, "numberPersonMax");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxNotEqualTo(Integer value) {
            addCriterion("number_person_max <>", value, "numberPersonMax");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxGreaterThan(Integer value) {
            addCriterion("number_person_max >", value, "numberPersonMax");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_person_max >=", value, "numberPersonMax");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxLessThan(Integer value) {
            addCriterion("number_person_max <", value, "numberPersonMax");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxLessThanOrEqualTo(Integer value) {
            addCriterion("number_person_max <=", value, "numberPersonMax");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxIn(List<Integer> values) {
            addCriterion("number_person_max in", values, "numberPersonMax");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxNotIn(List<Integer> values) {
            addCriterion("number_person_max not in", values, "numberPersonMax");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxBetween(Integer value1, Integer value2) {
            addCriterion("number_person_max between", value1, value2, "numberPersonMax");
            return (Criteria) this;
        }

        public Criteria andNumberPersonMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("number_person_max not between", value1, value2, "numberPersonMax");
            return (Criteria) this;
        }

        public Criteria andNumberTotalIsNull() {
            addCriterion("number_total is null");
            return (Criteria) this;
        }

        public Criteria andNumberTotalIsNotNull() {
            addCriterion("number_total is not null");
            return (Criteria) this;
        }

        public Criteria andNumberTotalEqualTo(Integer value) {
            addCriterion("number_total =", value, "numberTotal");
            return (Criteria) this;
        }

        public Criteria andNumberTotalNotEqualTo(Integer value) {
            addCriterion("number_total <>", value, "numberTotal");
            return (Criteria) this;
        }

        public Criteria andNumberTotalGreaterThan(Integer value) {
            addCriterion("number_total >", value, "numberTotal");
            return (Criteria) this;
        }

        public Criteria andNumberTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_total >=", value, "numberTotal");
            return (Criteria) this;
        }

        public Criteria andNumberTotalLessThan(Integer value) {
            addCriterion("number_total <", value, "numberTotal");
            return (Criteria) this;
        }

        public Criteria andNumberTotalLessThanOrEqualTo(Integer value) {
            addCriterion("number_total <=", value, "numberTotal");
            return (Criteria) this;
        }

        public Criteria andNumberTotalIn(List<Integer> values) {
            addCriterion("number_total in", values, "numberTotal");
            return (Criteria) this;
        }

        public Criteria andNumberTotalNotIn(List<Integer> values) {
            addCriterion("number_total not in", values, "numberTotal");
            return (Criteria) this;
        }

        public Criteria andNumberTotalBetween(Integer value1, Integer value2) {
            addCriterion("number_total between", value1, value2, "numberTotal");
            return (Criteria) this;
        }

        public Criteria andNumberTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("number_total not between", value1, value2, "numberTotal");
            return (Criteria) this;
        }

        public Criteria andNumberUsedIsNull() {
            addCriterion("number_used is null");
            return (Criteria) this;
        }

        public Criteria andNumberUsedIsNotNull() {
            addCriterion("number_used is not null");
            return (Criteria) this;
        }

        public Criteria andNumberUsedEqualTo(Integer value) {
            addCriterion("number_used =", value, "numberUsed");
            return (Criteria) this;
        }

        public Criteria andNumberUsedNotEqualTo(Integer value) {
            addCriterion("number_used <>", value, "numberUsed");
            return (Criteria) this;
        }

        public Criteria andNumberUsedGreaterThan(Integer value) {
            addCriterion("number_used >", value, "numberUsed");
            return (Criteria) this;
        }

        public Criteria andNumberUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_used >=", value, "numberUsed");
            return (Criteria) this;
        }

        public Criteria andNumberUsedLessThan(Integer value) {
            addCriterion("number_used <", value, "numberUsed");
            return (Criteria) this;
        }

        public Criteria andNumberUsedLessThanOrEqualTo(Integer value) {
            addCriterion("number_used <=", value, "numberUsed");
            return (Criteria) this;
        }

        public Criteria andNumberUsedIn(List<Integer> values) {
            addCriterion("number_used in", values, "numberUsed");
            return (Criteria) this;
        }

        public Criteria andNumberUsedNotIn(List<Integer> values) {
            addCriterion("number_used not in", values, "numberUsed");
            return (Criteria) this;
        }

        public Criteria andNumberUsedBetween(Integer value1, Integer value2) {
            addCriterion("number_used between", value1, value2, "numberUsed");
            return (Criteria) this;
        }

        public Criteria andNumberUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("number_used not between", value1, value2, "numberUsed");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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