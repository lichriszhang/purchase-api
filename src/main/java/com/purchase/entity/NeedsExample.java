package com.purchase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NeedsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NeedsExample() {
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

        public Criteria andNeedsidIsNull() {
            addCriterion("needsid is null");
            return (Criteria) this;
        }

        public Criteria andNeedsidIsNotNull() {
            addCriterion("needsid is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsidEqualTo(String value) {
            addCriterion("needsid =", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidNotEqualTo(String value) {
            addCriterion("needsid <>", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidGreaterThan(String value) {
            addCriterion("needsid >", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidGreaterThanOrEqualTo(String value) {
            addCriterion("needsid >=", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidLessThan(String value) {
            addCriterion("needsid <", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidLessThanOrEqualTo(String value) {
            addCriterion("needsid <=", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidLike(String value) {
            addCriterion("needsid like", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidNotLike(String value) {
            addCriterion("needsid not like", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidIn(List<String> values) {
            addCriterion("needsid in", values, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidNotIn(List<String> values) {
            addCriterion("needsid not in", values, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidBetween(String value1, String value2) {
            addCriterion("needsid between", value1, value2, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidNotBetween(String value1, String value2) {
            addCriterion("needsid not between", value1, value2, "needsid");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("orgname is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("orgname is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("orgname =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("orgname <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("orgname >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("orgname >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("orgname <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("orgname <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("orgname like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("orgname not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("orgname in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("orgname not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("orgname between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("orgname not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNull() {
            addCriterion("submitdate is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNotNull() {
            addCriterion("submitdate is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateEqualTo(Date value) {
            addCriterion("submitdate =", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotEqualTo(Date value) {
            addCriterion("submitdate <>", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThan(Date value) {
            addCriterion("submitdate >", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThanOrEqualTo(Date value) {
            addCriterion("submitdate >=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThan(Date value) {
            addCriterion("submitdate <", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThanOrEqualTo(Date value) {
            addCriterion("submitdate <=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIn(List<Date> values) {
            addCriterion("submitdate in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotIn(List<Date> values) {
            addCriterion("submitdate not in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateBetween(Date value1, Date value2) {
            addCriterion("submitdate between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotBetween(Date value1, Date value2) {
            addCriterion("submitdate not between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmiterIsNull() {
            addCriterion("submiter is null");
            return (Criteria) this;
        }

        public Criteria andSubmiterIsNotNull() {
            addCriterion("submiter is not null");
            return (Criteria) this;
        }

        public Criteria andSubmiterEqualTo(String value) {
            addCriterion("submiter =", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterNotEqualTo(String value) {
            addCriterion("submiter <>", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterGreaterThan(String value) {
            addCriterion("submiter >", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterGreaterThanOrEqualTo(String value) {
            addCriterion("submiter >=", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterLessThan(String value) {
            addCriterion("submiter <", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterLessThanOrEqualTo(String value) {
            addCriterion("submiter <=", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterLike(String value) {
            addCriterion("submiter like", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterNotLike(String value) {
            addCriterion("submiter not like", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterIn(List<String> values) {
            addCriterion("submiter in", values, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterNotIn(List<String> values) {
            addCriterion("submiter not in", values, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterBetween(String value1, String value2) {
            addCriterion("submiter between", value1, value2, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterNotBetween(String value1, String value2) {
            addCriterion("submiter not between", value1, value2, "submiter");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalIsNull() {
            addCriterion("orgprincipal is null");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalIsNotNull() {
            addCriterion("orgprincipal is not null");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalEqualTo(String value) {
            addCriterion("orgprincipal =", value, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalNotEqualTo(String value) {
            addCriterion("orgprincipal <>", value, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalGreaterThan(String value) {
            addCriterion("orgprincipal >", value, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalGreaterThanOrEqualTo(String value) {
            addCriterion("orgprincipal >=", value, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalLessThan(String value) {
            addCriterion("orgprincipal <", value, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalLessThanOrEqualTo(String value) {
            addCriterion("orgprincipal <=", value, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalLike(String value) {
            addCriterion("orgprincipal like", value, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalNotLike(String value) {
            addCriterion("orgprincipal not like", value, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalIn(List<String> values) {
            addCriterion("orgprincipal in", values, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalNotIn(List<String> values) {
            addCriterion("orgprincipal not in", values, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalBetween(String value1, String value2) {
            addCriterion("orgprincipal between", value1, value2, "orgprincipal");
            return (Criteria) this;
        }

        public Criteria andOrgprincipalNotBetween(String value1, String value2) {
            addCriterion("orgprincipal not between", value1, value2, "orgprincipal");
            return (Criteria) this;
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

        public Criteria andEquipstateIsNull() {
            addCriterion("equipstate is null");
            return (Criteria) this;
        }

        public Criteria andEquipstateIsNotNull() {
            addCriterion("equipstate is not null");
            return (Criteria) this;
        }

        public Criteria andEquipstateEqualTo(String value) {
            addCriterion("equipstate =", value, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateNotEqualTo(String value) {
            addCriterion("equipstate <>", value, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateGreaterThan(String value) {
            addCriterion("equipstate >", value, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateGreaterThanOrEqualTo(String value) {
            addCriterion("equipstate >=", value, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateLessThan(String value) {
            addCriterion("equipstate <", value, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateLessThanOrEqualTo(String value) {
            addCriterion("equipstate <=", value, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateLike(String value) {
            addCriterion("equipstate like", value, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateNotLike(String value) {
            addCriterion("equipstate not like", value, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateIn(List<String> values) {
            addCriterion("equipstate in", values, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateNotIn(List<String> values) {
            addCriterion("equipstate not in", values, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateBetween(String value1, String value2) {
            addCriterion("equipstate between", value1, value2, "equipstate");
            return (Criteria) this;
        }

        public Criteria andEquipstateNotBetween(String value1, String value2) {
            addCriterion("equipstate not between", value1, value2, "equipstate");
            return (Criteria) this;
        }

        public Criteria andIspassIsNull() {
            addCriterion("ispass is null");
            return (Criteria) this;
        }

        public Criteria andIspassIsNotNull() {
            addCriterion("ispass is not null");
            return (Criteria) this;
        }

        public Criteria andIspassEqualTo(Integer value) {
            addCriterion("ispass =", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotEqualTo(Integer value) {
            addCriterion("ispass <>", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassGreaterThan(Integer value) {
            addCriterion("ispass >", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassGreaterThanOrEqualTo(Integer value) {
            addCriterion("ispass >=", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassLessThan(Integer value) {
            addCriterion("ispass <", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassLessThanOrEqualTo(Integer value) {
            addCriterion("ispass <=", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassIn(List<Integer> values) {
            addCriterion("ispass in", values, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotIn(List<Integer> values) {
            addCriterion("ispass not in", values, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassBetween(Integer value1, Integer value2) {
            addCriterion("ispass between", value1, value2, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotBetween(Integer value1, Integer value2) {
            addCriterion("ispass not between", value1, value2, "ispass");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
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