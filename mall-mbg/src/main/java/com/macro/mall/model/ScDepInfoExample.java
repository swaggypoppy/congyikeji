package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScDepInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScDepInfoExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andDepNameIsNull() {
            addCriterion("dep_name is null");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNotNull() {
            addCriterion("dep_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepNameEqualTo(String value) {
            addCriterion("dep_name =", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotEqualTo(String value) {
            addCriterion("dep_name <>", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThan(String value) {
            addCriterion("dep_name >", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThanOrEqualTo(String value) {
            addCriterion("dep_name >=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThan(String value) {
            addCriterion("dep_name <", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThanOrEqualTo(String value) {
            addCriterion("dep_name <=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLike(String value) {
            addCriterion("dep_name like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotLike(String value) {
            addCriterion("dep_name not like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameIn(List<String> values) {
            addCriterion("dep_name in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotIn(List<String> values) {
            addCriterion("dep_name not in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameBetween(String value1, String value2) {
            addCriterion("dep_name between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotBetween(String value1, String value2) {
            addCriterion("dep_name not between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andDepTypeIsNull() {
            addCriterion("dep_type is null");
            return (Criteria) this;
        }

        public Criteria andDepTypeIsNotNull() {
            addCriterion("dep_type is not null");
            return (Criteria) this;
        }

        public Criteria andDepTypeEqualTo(Byte value) {
            addCriterion("dep_type =", value, "depType");
            return (Criteria) this;
        }

        public Criteria andDepTypeNotEqualTo(Byte value) {
            addCriterion("dep_type <>", value, "depType");
            return (Criteria) this;
        }

        public Criteria andDepTypeGreaterThan(Byte value) {
            addCriterion("dep_type >", value, "depType");
            return (Criteria) this;
        }

        public Criteria andDepTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("dep_type >=", value, "depType");
            return (Criteria) this;
        }

        public Criteria andDepTypeLessThan(Byte value) {
            addCriterion("dep_type <", value, "depType");
            return (Criteria) this;
        }

        public Criteria andDepTypeLessThanOrEqualTo(Byte value) {
            addCriterion("dep_type <=", value, "depType");
            return (Criteria) this;
        }

        public Criteria andDepTypeIn(List<Byte> values) {
            addCriterion("dep_type in", values, "depType");
            return (Criteria) this;
        }

        public Criteria andDepTypeNotIn(List<Byte> values) {
            addCriterion("dep_type not in", values, "depType");
            return (Criteria) this;
        }

        public Criteria andDepTypeBetween(Byte value1, Byte value2) {
            addCriterion("dep_type between", value1, value2, "depType");
            return (Criteria) this;
        }

        public Criteria andDepTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("dep_type not between", value1, value2, "depType");
            return (Criteria) this;
        }

        public Criteria andDepStatusIsNull() {
            addCriterion("dep_status is null");
            return (Criteria) this;
        }

        public Criteria andDepStatusIsNotNull() {
            addCriterion("dep_status is not null");
            return (Criteria) this;
        }

        public Criteria andDepStatusEqualTo(Boolean value) {
            addCriterion("dep_status =", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusNotEqualTo(Boolean value) {
            addCriterion("dep_status <>", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusGreaterThan(Boolean value) {
            addCriterion("dep_status >", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dep_status >=", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusLessThan(Boolean value) {
            addCriterion("dep_status <", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("dep_status <=", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusIn(List<Boolean> values) {
            addCriterion("dep_status in", values, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusNotIn(List<Boolean> values) {
            addCriterion("dep_status not in", values, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("dep_status between", value1, value2, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dep_status not between", value1, value2, "depStatus");
            return (Criteria) this;
        }

        public Criteria andInuserIsNull() {
            addCriterion("inuser is null");
            return (Criteria) this;
        }

        public Criteria andInuserIsNotNull() {
            addCriterion("inuser is not null");
            return (Criteria) this;
        }

        public Criteria andInuserEqualTo(String value) {
            addCriterion("inuser =", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserNotEqualTo(String value) {
            addCriterion("inuser <>", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserGreaterThan(String value) {
            addCriterion("inuser >", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserGreaterThanOrEqualTo(String value) {
            addCriterion("inuser >=", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserLessThan(String value) {
            addCriterion("inuser <", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserLessThanOrEqualTo(String value) {
            addCriterion("inuser <=", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserLike(String value) {
            addCriterion("inuser like", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserNotLike(String value) {
            addCriterion("inuser not like", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserIn(List<String> values) {
            addCriterion("inuser in", values, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserNotIn(List<String> values) {
            addCriterion("inuser not in", values, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserBetween(String value1, String value2) {
            addCriterion("inuser between", value1, value2, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserNotBetween(String value1, String value2) {
            addCriterion("inuser not between", value1, value2, "inuser");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNull() {
            addCriterion("intime is null");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNotNull() {
            addCriterion("intime is not null");
            return (Criteria) this;
        }

        public Criteria andIntimeEqualTo(Date value) {
            addCriterion("intime =", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotEqualTo(Date value) {
            addCriterion("intime <>", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThan(Date value) {
            addCriterion("intime >", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("intime >=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThan(Date value) {
            addCriterion("intime <", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThanOrEqualTo(Date value) {
            addCriterion("intime <=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeIn(List<Date> values) {
            addCriterion("intime in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotIn(List<Date> values) {
            addCriterion("intime not in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeBetween(Date value1, Date value2) {
            addCriterion("intime between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotBetween(Date value1, Date value2) {
            addCriterion("intime not between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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