package org.web.emall.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatar_url =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatar_url <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatar_url >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_url >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatar_url <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatar_url <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatar_url like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatar_url not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatar_url in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatar_url not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatar_url between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatar_url not between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
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

        public Criteria andDateLoginIsNull() {
            addCriterion("date_login is null");
            return (Criteria) this;
        }

        public Criteria andDateLoginIsNotNull() {
            addCriterion("date_login is not null");
            return (Criteria) this;
        }

        public Criteria andDateLoginEqualTo(Date value) {
            addCriterion("date_login =", value, "dateLogin");
            return (Criteria) this;
        }

        public Criteria andDateLoginNotEqualTo(Date value) {
            addCriterion("date_login <>", value, "dateLogin");
            return (Criteria) this;
        }

        public Criteria andDateLoginGreaterThan(Date value) {
            addCriterion("date_login >", value, "dateLogin");
            return (Criteria) this;
        }

        public Criteria andDateLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("date_login >=", value, "dateLogin");
            return (Criteria) this;
        }

        public Criteria andDateLoginLessThan(Date value) {
            addCriterion("date_login <", value, "dateLogin");
            return (Criteria) this;
        }

        public Criteria andDateLoginLessThanOrEqualTo(Date value) {
            addCriterion("date_login <=", value, "dateLogin");
            return (Criteria) this;
        }

        public Criteria andDateLoginIn(List<Date> values) {
            addCriterion("date_login in", values, "dateLogin");
            return (Criteria) this;
        }

        public Criteria andDateLoginNotIn(List<Date> values) {
            addCriterion("date_login not in", values, "dateLogin");
            return (Criteria) this;
        }

        public Criteria andDateLoginBetween(Date value1, Date value2) {
            addCriterion("date_login between", value1, value2, "dateLogin");
            return (Criteria) this;
        }

        public Criteria andDateLoginNotBetween(Date value1, Date value2) {
            addCriterion("date_login not between", value1, value2, "dateLogin");
            return (Criteria) this;
        }

        public Criteria andIpAddIsNull() {
            addCriterion("ip_add is null");
            return (Criteria) this;
        }

        public Criteria andIpAddIsNotNull() {
            addCriterion("ip_add is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddEqualTo(String value) {
            addCriterion("ip_add =", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddNotEqualTo(String value) {
            addCriterion("ip_add <>", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddGreaterThan(String value) {
            addCriterion("ip_add >", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddGreaterThanOrEqualTo(String value) {
            addCriterion("ip_add >=", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddLessThan(String value) {
            addCriterion("ip_add <", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddLessThanOrEqualTo(String value) {
            addCriterion("ip_add <=", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddLike(String value) {
            addCriterion("ip_add like", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddNotLike(String value) {
            addCriterion("ip_add not like", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddIn(List<String> values) {
            addCriterion("ip_add in", values, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddNotIn(List<String> values) {
            addCriterion("ip_add not in", values, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddBetween(String value1, String value2) {
            addCriterion("ip_add between", value1, value2, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddNotBetween(String value1, String value2) {
            addCriterion("ip_add not between", value1, value2, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpLoginIsNull() {
            addCriterion("ip_login is null");
            return (Criteria) this;
        }

        public Criteria andIpLoginIsNotNull() {
            addCriterion("ip_login is not null");
            return (Criteria) this;
        }

        public Criteria andIpLoginEqualTo(String value) {
            addCriterion("ip_login =", value, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginNotEqualTo(String value) {
            addCriterion("ip_login <>", value, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginGreaterThan(String value) {
            addCriterion("ip_login >", value, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginGreaterThanOrEqualTo(String value) {
            addCriterion("ip_login >=", value, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginLessThan(String value) {
            addCriterion("ip_login <", value, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginLessThanOrEqualTo(String value) {
            addCriterion("ip_login <=", value, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginLike(String value) {
            addCriterion("ip_login like", value, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginNotLike(String value) {
            addCriterion("ip_login not like", value, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginIn(List<String> values) {
            addCriterion("ip_login in", values, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginNotIn(List<String> values) {
            addCriterion("ip_login not in", values, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginBetween(String value1, String value2) {
            addCriterion("ip_login between", value1, value2, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIpLoginNotBetween(String value1, String value2) {
            addCriterion("ip_login not between", value1, value2, "ipLogin");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckIsNull() {
            addCriterion("is_idcard_check is null");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckIsNotNull() {
            addCriterion("is_idcard_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckEqualTo(Boolean value) {
            addCriterion("is_idcard_check =", value, "isIdcardCheck");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckNotEqualTo(Boolean value) {
            addCriterion("is_idcard_check <>", value, "isIdcardCheck");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckGreaterThan(Boolean value) {
            addCriterion("is_idcard_check >", value, "isIdcardCheck");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_idcard_check >=", value, "isIdcardCheck");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckLessThan(Boolean value) {
            addCriterion("is_idcard_check <", value, "isIdcardCheck");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckLessThanOrEqualTo(Boolean value) {
            addCriterion("is_idcard_check <=", value, "isIdcardCheck");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckIn(List<Boolean> values) {
            addCriterion("is_idcard_check in", values, "isIdcardCheck");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckNotIn(List<Boolean> values) {
            addCriterion("is_idcard_check not in", values, "isIdcardCheck");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckBetween(Boolean value1, Boolean value2) {
            addCriterion("is_idcard_check between", value1, value2, "isIdcardCheck");
            return (Criteria) this;
        }

        public Criteria andIsIdcardCheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_idcard_check not between", value1, value2, "isIdcardCheck");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andNickIsNull() {
            addCriterion("nick is null");
            return (Criteria) this;
        }

        public Criteria andNickIsNotNull() {
            addCriterion("nick is not null");
            return (Criteria) this;
        }

        public Criteria andNickEqualTo(String value) {
            addCriterion("nick =", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotEqualTo(String value) {
            addCriterion("nick <>", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThan(String value) {
            addCriterion("nick >", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThanOrEqualTo(String value) {
            addCriterion("nick >=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThan(String value) {
            addCriterion("nick <", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThanOrEqualTo(String value) {
            addCriterion("nick <=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLike(String value) {
            addCriterion("nick like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotLike(String value) {
            addCriterion("nick not like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickIn(List<String> values) {
            addCriterion("nick in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotIn(List<String> values) {
            addCriterion("nick not in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickBetween(String value1, String value2) {
            addCriterion("nick between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotBetween(String value1, String value2) {
            addCriterion("nick not between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceStrIsNull() {
            addCriterion("source_str is null");
            return (Criteria) this;
        }

        public Criteria andSourceStrIsNotNull() {
            addCriterion("source_str is not null");
            return (Criteria) this;
        }

        public Criteria andSourceStrEqualTo(String value) {
            addCriterion("source_str =", value, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrNotEqualTo(String value) {
            addCriterion("source_str <>", value, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrGreaterThan(String value) {
            addCriterion("source_str >", value, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrGreaterThanOrEqualTo(String value) {
            addCriterion("source_str >=", value, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrLessThan(String value) {
            addCriterion("source_str <", value, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrLessThanOrEqualTo(String value) {
            addCriterion("source_str <=", value, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrLike(String value) {
            addCriterion("source_str like", value, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrNotLike(String value) {
            addCriterion("source_str not like", value, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrIn(List<String> values) {
            addCriterion("source_str in", values, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrNotIn(List<String> values) {
            addCriterion("source_str not in", values, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrBetween(String value1, String value2) {
            addCriterion("source_str between", value1, value2, "sourceStr");
            return (Criteria) this;
        }

        public Criteria andSourceStrNotBetween(String value1, String value2) {
            addCriterion("source_str not between", value1, value2, "sourceStr");
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