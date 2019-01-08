package com.purchase.entity;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andEquipidIsNull() {
            addCriterion("equipid is null");
            return (Criteria) this;
        }

        public Criteria andEquipidIsNotNull() {
            addCriterion("equipid is not null");
            return (Criteria) this;
        }

        public Criteria andEquipidEqualTo(String value) {
            addCriterion("equipid =", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotEqualTo(String value) {
            addCriterion("equipid <>", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidGreaterThan(String value) {
            addCriterion("equipid >", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidGreaterThanOrEqualTo(String value) {
            addCriterion("equipid >=", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLessThan(String value) {
            addCriterion("equipid <", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLessThanOrEqualTo(String value) {
            addCriterion("equipid <=", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLike(String value) {
            addCriterion("equipid like", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotLike(String value) {
            addCriterion("equipid not like", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidIn(List<String> values) {
            addCriterion("equipid in", values, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotIn(List<String> values) {
            addCriterion("equipid not in", values, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidBetween(String value1, String value2) {
            addCriterion("equipid between", value1, value2, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotBetween(String value1, String value2) {
            addCriterion("equipid not between", value1, value2, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipnameIsNull() {
            addCriterion("equipname is null");
            return (Criteria) this;
        }

        public Criteria andEquipnameIsNotNull() {
            addCriterion("equipname is not null");
            return (Criteria) this;
        }

        public Criteria andEquipnameEqualTo(String value) {
            addCriterion("equipname =", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameNotEqualTo(String value) {
            addCriterion("equipname <>", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameGreaterThan(String value) {
            addCriterion("equipname >", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameGreaterThanOrEqualTo(String value) {
            addCriterion("equipname >=", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameLessThan(String value) {
            addCriterion("equipname <", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameLessThanOrEqualTo(String value) {
            addCriterion("equipname <=", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameLike(String value) {
            addCriterion("equipname like", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameNotLike(String value) {
            addCriterion("equipname not like", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameIn(List<String> values) {
            addCriterion("equipname in", values, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameNotIn(List<String> values) {
            addCriterion("equipname not in", values, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameBetween(String value1, String value2) {
            addCriterion("equipname between", value1, value2, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameNotBetween(String value1, String value2) {
            addCriterion("equipname not between", value1, value2, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipspecIsNull() {
            addCriterion("equipspec is null");
            return (Criteria) this;
        }

        public Criteria andEquipspecIsNotNull() {
            addCriterion("equipspec is not null");
            return (Criteria) this;
        }

        public Criteria andEquipspecEqualTo(String value) {
            addCriterion("equipspec =", value, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecNotEqualTo(String value) {
            addCriterion("equipspec <>", value, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecGreaterThan(String value) {
            addCriterion("equipspec >", value, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecGreaterThanOrEqualTo(String value) {
            addCriterion("equipspec >=", value, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecLessThan(String value) {
            addCriterion("equipspec <", value, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecLessThanOrEqualTo(String value) {
            addCriterion("equipspec <=", value, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecLike(String value) {
            addCriterion("equipspec like", value, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecNotLike(String value) {
            addCriterion("equipspec not like", value, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecIn(List<String> values) {
            addCriterion("equipspec in", values, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecNotIn(List<String> values) {
            addCriterion("equipspec not in", values, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecBetween(String value1, String value2) {
            addCriterion("equipspec between", value1, value2, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipspecNotBetween(String value1, String value2) {
            addCriterion("equipspec not between", value1, value2, "equipspec");
            return (Criteria) this;
        }

        public Criteria andEquipmodelIsNull() {
            addCriterion("equipmodel is null");
            return (Criteria) this;
        }

        public Criteria andEquipmodelIsNotNull() {
            addCriterion("equipmodel is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmodelEqualTo(String value) {
            addCriterion("equipmodel =", value, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelNotEqualTo(String value) {
            addCriterion("equipmodel <>", value, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelGreaterThan(String value) {
            addCriterion("equipmodel >", value, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelGreaterThanOrEqualTo(String value) {
            addCriterion("equipmodel >=", value, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelLessThan(String value) {
            addCriterion("equipmodel <", value, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelLessThanOrEqualTo(String value) {
            addCriterion("equipmodel <=", value, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelLike(String value) {
            addCriterion("equipmodel like", value, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelNotLike(String value) {
            addCriterion("equipmodel not like", value, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelIn(List<String> values) {
            addCriterion("equipmodel in", values, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelNotIn(List<String> values) {
            addCriterion("equipmodel not in", values, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelBetween(String value1, String value2) {
            addCriterion("equipmodel between", value1, value2, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmodelNotBetween(String value1, String value2) {
            addCriterion("equipmodel not between", value1, value2, "equipmodel");
            return (Criteria) this;
        }

        public Criteria andEquiptextIsNull() {
            addCriterion("equiptext is null");
            return (Criteria) this;
        }

        public Criteria andEquiptextIsNotNull() {
            addCriterion("equiptext is not null");
            return (Criteria) this;
        }

        public Criteria andEquiptextEqualTo(String value) {
            addCriterion("equiptext =", value, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextNotEqualTo(String value) {
            addCriterion("equiptext <>", value, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextGreaterThan(String value) {
            addCriterion("equiptext >", value, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextGreaterThanOrEqualTo(String value) {
            addCriterion("equiptext >=", value, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextLessThan(String value) {
            addCriterion("equiptext <", value, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextLessThanOrEqualTo(String value) {
            addCriterion("equiptext <=", value, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextLike(String value) {
            addCriterion("equiptext like", value, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextNotLike(String value) {
            addCriterion("equiptext not like", value, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextIn(List<String> values) {
            addCriterion("equiptext in", values, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextNotIn(List<String> values) {
            addCriterion("equiptext not in", values, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextBetween(String value1, String value2) {
            addCriterion("equiptext between", value1, value2, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquiptextNotBetween(String value1, String value2) {
            addCriterion("equiptext not between", value1, value2, "equiptext");
            return (Criteria) this;
        }

        public Criteria andEquipnumIsNull() {
            addCriterion("equipnum is null");
            return (Criteria) this;
        }

        public Criteria andEquipnumIsNotNull() {
            addCriterion("equipnum is not null");
            return (Criteria) this;
        }

        public Criteria andEquipnumEqualTo(Integer value) {
            addCriterion("equipnum =", value, "equipnum");
            return (Criteria) this;
        }

        public Criteria andEquipnumNotEqualTo(Integer value) {
            addCriterion("equipnum <>", value, "equipnum");
            return (Criteria) this;
        }

        public Criteria andEquipnumGreaterThan(Integer value) {
            addCriterion("equipnum >", value, "equipnum");
            return (Criteria) this;
        }

        public Criteria andEquipnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipnum >=", value, "equipnum");
            return (Criteria) this;
        }

        public Criteria andEquipnumLessThan(Integer value) {
            addCriterion("equipnum <", value, "equipnum");
            return (Criteria) this;
        }

        public Criteria andEquipnumLessThanOrEqualTo(Integer value) {
            addCriterion("equipnum <=", value, "equipnum");
            return (Criteria) this;
        }

        public Criteria andEquipnumIn(List<Integer> values) {
            addCriterion("equipnum in", values, "equipnum");
            return (Criteria) this;
        }

        public Criteria andEquipnumNotIn(List<Integer> values) {
            addCriterion("equipnum not in", values, "equipnum");
            return (Criteria) this;
        }

        public Criteria andEquipnumBetween(Integer value1, Integer value2) {
            addCriterion("equipnum between", value1, value2, "equipnum");
            return (Criteria) this;
        }

        public Criteria andEquipnumNotBetween(Integer value1, Integer value2) {
            addCriterion("equipnum not between", value1, value2, "equipnum");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryIsNull() {
            addCriterion("equipcategory is null");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryIsNotNull() {
            addCriterion("equipcategory is not null");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryEqualTo(String value) {
            addCriterion("equipcategory =", value, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryNotEqualTo(String value) {
            addCriterion("equipcategory <>", value, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryGreaterThan(String value) {
            addCriterion("equipcategory >", value, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("equipcategory >=", value, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryLessThan(String value) {
            addCriterion("equipcategory <", value, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryLessThanOrEqualTo(String value) {
            addCriterion("equipcategory <=", value, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryLike(String value) {
            addCriterion("equipcategory like", value, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryNotLike(String value) {
            addCriterion("equipcategory not like", value, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryIn(List<String> values) {
            addCriterion("equipcategory in", values, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryNotIn(List<String> values) {
            addCriterion("equipcategory not in", values, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryBetween(String value1, String value2) {
            addCriterion("equipcategory between", value1, value2, "equipcategory");
            return (Criteria) this;
        }

        public Criteria andEquipcategoryNotBetween(String value1, String value2) {
            addCriterion("equipcategory not between", value1, value2, "equipcategory");
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