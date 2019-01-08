package com.purchase.entity;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSupplieridIsNull() {
            addCriterion("supplierid is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("supplierid is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(String value) {
            addCriterion("supplierid =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(String value) {
            addCriterion("supplierid <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(String value) {
            addCriterion("supplierid >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(String value) {
            addCriterion("supplierid >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(String value) {
            addCriterion("supplierid <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(String value) {
            addCriterion("supplierid <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLike(String value) {
            addCriterion("supplierid like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotLike(String value) {
            addCriterion("supplierid not like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<String> values) {
            addCriterion("supplierid in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<String> values) {
            addCriterion("supplierid not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(String value1, String value2) {
            addCriterion("supplierid between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(String value1, String value2) {
            addCriterion("supplierid not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("suppliername is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("suppliername is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("suppliername =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("suppliername <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("suppliername >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("suppliername >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("suppliername <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("suppliername <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("suppliername like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("suppliername not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("suppliername in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("suppliername not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("suppliername between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("suppliername not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSupplieraddIsNull() {
            addCriterion("supplieradd is null");
            return (Criteria) this;
        }

        public Criteria andSupplieraddIsNotNull() {
            addCriterion("supplieradd is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieraddEqualTo(String value) {
            addCriterion("supplieradd =", value, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddNotEqualTo(String value) {
            addCriterion("supplieradd <>", value, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddGreaterThan(String value) {
            addCriterion("supplieradd >", value, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddGreaterThanOrEqualTo(String value) {
            addCriterion("supplieradd >=", value, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddLessThan(String value) {
            addCriterion("supplieradd <", value, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddLessThanOrEqualTo(String value) {
            addCriterion("supplieradd <=", value, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddLike(String value) {
            addCriterion("supplieradd like", value, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddNotLike(String value) {
            addCriterion("supplieradd not like", value, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddIn(List<String> values) {
            addCriterion("supplieradd in", values, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddNotIn(List<String> values) {
            addCriterion("supplieradd not in", values, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddBetween(String value1, String value2) {
            addCriterion("supplieradd between", value1, value2, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSupplieraddNotBetween(String value1, String value2) {
            addCriterion("supplieradd not between", value1, value2, "supplieradd");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterIsNull() {
            addCriterion("suppliercontacter is null");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterIsNotNull() {
            addCriterion("suppliercontacter is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterEqualTo(String value) {
            addCriterion("suppliercontacter =", value, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterNotEqualTo(String value) {
            addCriterion("suppliercontacter <>", value, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterGreaterThan(String value) {
            addCriterion("suppliercontacter >", value, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterGreaterThanOrEqualTo(String value) {
            addCriterion("suppliercontacter >=", value, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterLessThan(String value) {
            addCriterion("suppliercontacter <", value, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterLessThanOrEqualTo(String value) {
            addCriterion("suppliercontacter <=", value, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterLike(String value) {
            addCriterion("suppliercontacter like", value, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterNotLike(String value) {
            addCriterion("suppliercontacter not like", value, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterIn(List<String> values) {
            addCriterion("suppliercontacter in", values, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterNotIn(List<String> values) {
            addCriterion("suppliercontacter not in", values, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterBetween(String value1, String value2) {
            addCriterion("suppliercontacter between", value1, value2, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSuppliercontacterNotBetween(String value1, String value2) {
            addCriterion("suppliercontacter not between", value1, value2, "suppliercontacter");
            return (Criteria) this;
        }

        public Criteria andSupplierteleIsNull() {
            addCriterion("suppliertele is null");
            return (Criteria) this;
        }

        public Criteria andSupplierteleIsNotNull() {
            addCriterion("suppliertele is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierteleEqualTo(String value) {
            addCriterion("suppliertele =", value, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleNotEqualTo(String value) {
            addCriterion("suppliertele <>", value, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleGreaterThan(String value) {
            addCriterion("suppliertele >", value, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleGreaterThanOrEqualTo(String value) {
            addCriterion("suppliertele >=", value, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleLessThan(String value) {
            addCriterion("suppliertele <", value, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleLessThanOrEqualTo(String value) {
            addCriterion("suppliertele <=", value, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleLike(String value) {
            addCriterion("suppliertele like", value, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleNotLike(String value) {
            addCriterion("suppliertele not like", value, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleIn(List<String> values) {
            addCriterion("suppliertele in", values, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleNotIn(List<String> values) {
            addCriterion("suppliertele not in", values, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleBetween(String value1, String value2) {
            addCriterion("suppliertele between", value1, value2, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierteleNotBetween(String value1, String value2) {
            addCriterion("suppliertele not between", value1, value2, "suppliertele");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIsNull() {
            addCriterion("supplierphone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIsNotNull() {
            addCriterion("supplierphone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneEqualTo(String value) {
            addCriterion("supplierphone =", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotEqualTo(String value) {
            addCriterion("supplierphone <>", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneGreaterThan(String value) {
            addCriterion("supplierphone >", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplierphone >=", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLessThan(String value) {
            addCriterion("supplierphone <", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLessThanOrEqualTo(String value) {
            addCriterion("supplierphone <=", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLike(String value) {
            addCriterion("supplierphone like", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotLike(String value) {
            addCriterion("supplierphone not like", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIn(List<String> values) {
            addCriterion("supplierphone in", values, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotIn(List<String> values) {
            addCriterion("supplierphone not in", values, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneBetween(String value1, String value2) {
            addCriterion("supplierphone between", value1, value2, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotBetween(String value1, String value2) {
            addCriterion("supplierphone not between", value1, value2, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxIsNull() {
            addCriterion("supplierfax is null");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxIsNotNull() {
            addCriterion("supplierfax is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxEqualTo(String value) {
            addCriterion("supplierfax =", value, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxNotEqualTo(String value) {
            addCriterion("supplierfax <>", value, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxGreaterThan(String value) {
            addCriterion("supplierfax >", value, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxGreaterThanOrEqualTo(String value) {
            addCriterion("supplierfax >=", value, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxLessThan(String value) {
            addCriterion("supplierfax <", value, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxLessThanOrEqualTo(String value) {
            addCriterion("supplierfax <=", value, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxLike(String value) {
            addCriterion("supplierfax like", value, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxNotLike(String value) {
            addCriterion("supplierfax not like", value, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxIn(List<String> values) {
            addCriterion("supplierfax in", values, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxNotIn(List<String> values) {
            addCriterion("supplierfax not in", values, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxBetween(String value1, String value2) {
            addCriterion("supplierfax between", value1, value2, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSupplierfaxNotBetween(String value1, String value2) {
            addCriterion("supplierfax not between", value1, value2, "supplierfax");
            return (Criteria) this;
        }

        public Criteria andSuppliermailIsNull() {
            addCriterion("suppliermail is null");
            return (Criteria) this;
        }

        public Criteria andSuppliermailIsNotNull() {
            addCriterion("suppliermail is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliermailEqualTo(String value) {
            addCriterion("suppliermail =", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailNotEqualTo(String value) {
            addCriterion("suppliermail <>", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailGreaterThan(String value) {
            addCriterion("suppliermail >", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailGreaterThanOrEqualTo(String value) {
            addCriterion("suppliermail >=", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailLessThan(String value) {
            addCriterion("suppliermail <", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailLessThanOrEqualTo(String value) {
            addCriterion("suppliermail <=", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailLike(String value) {
            addCriterion("suppliermail like", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailNotLike(String value) {
            addCriterion("suppliermail not like", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailIn(List<String> values) {
            addCriterion("suppliermail in", values, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailNotIn(List<String> values) {
            addCriterion("suppliermail not in", values, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailBetween(String value1, String value2) {
            addCriterion("suppliermail between", value1, value2, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailNotBetween(String value1, String value2) {
            addCriterion("suppliermail not between", value1, value2, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeIsNull() {
            addCriterion("supplierzipcode is null");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeIsNotNull() {
            addCriterion("supplierzipcode is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeEqualTo(String value) {
            addCriterion("supplierzipcode =", value, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeNotEqualTo(String value) {
            addCriterion("supplierzipcode <>", value, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeGreaterThan(String value) {
            addCriterion("supplierzipcode >", value, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("supplierzipcode >=", value, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeLessThan(String value) {
            addCriterion("supplierzipcode <", value, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeLessThanOrEqualTo(String value) {
            addCriterion("supplierzipcode <=", value, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeLike(String value) {
            addCriterion("supplierzipcode like", value, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeNotLike(String value) {
            addCriterion("supplierzipcode not like", value, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeIn(List<String> values) {
            addCriterion("supplierzipcode in", values, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeNotIn(List<String> values) {
            addCriterion("supplierzipcode not in", values, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeBetween(String value1, String value2) {
            addCriterion("supplierzipcode between", value1, value2, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierzipcodeNotBetween(String value1, String value2) {
            addCriterion("supplierzipcode not between", value1, value2, "supplierzipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountIsNull() {
            addCriterion("supplierbankaccount is null");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountIsNotNull() {
            addCriterion("supplierbankaccount is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountEqualTo(String value) {
            addCriterion("supplierbankaccount =", value, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountNotEqualTo(String value) {
            addCriterion("supplierbankaccount <>", value, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountGreaterThan(String value) {
            addCriterion("supplierbankaccount >", value, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("supplierbankaccount >=", value, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountLessThan(String value) {
            addCriterion("supplierbankaccount <", value, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountLessThanOrEqualTo(String value) {
            addCriterion("supplierbankaccount <=", value, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountLike(String value) {
            addCriterion("supplierbankaccount like", value, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountNotLike(String value) {
            addCriterion("supplierbankaccount not like", value, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountIn(List<String> values) {
            addCriterion("supplierbankaccount in", values, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountNotIn(List<String> values) {
            addCriterion("supplierbankaccount not in", values, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountBetween(String value1, String value2) {
            addCriterion("supplierbankaccount between", value1, value2, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierbankaccountNotBetween(String value1, String value2) {
            addCriterion("supplierbankaccount not between", value1, value2, "supplierbankaccount");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryIsNull() {
            addCriterion("supplierequipcategory is null");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryIsNotNull() {
            addCriterion("supplierequipcategory is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryEqualTo(String value) {
            addCriterion("supplierequipcategory =", value, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryNotEqualTo(String value) {
            addCriterion("supplierequipcategory <>", value, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryGreaterThan(String value) {
            addCriterion("supplierequipcategory >", value, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("supplierequipcategory >=", value, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryLessThan(String value) {
            addCriterion("supplierequipcategory <", value, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryLessThanOrEqualTo(String value) {
            addCriterion("supplierequipcategory <=", value, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryLike(String value) {
            addCriterion("supplierequipcategory like", value, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryNotLike(String value) {
            addCriterion("supplierequipcategory not like", value, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryIn(List<String> values) {
            addCriterion("supplierequipcategory in", values, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryNotIn(List<String> values) {
            addCriterion("supplierequipcategory not in", values, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryBetween(String value1, String value2) {
            addCriterion("supplierequipcategory between", value1, value2, "supplierequipcategory");
            return (Criteria) this;
        }

        public Criteria andSupplierequipcategoryNotBetween(String value1, String value2) {
            addCriterion("supplierequipcategory not between", value1, value2, "supplierequipcategory");
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