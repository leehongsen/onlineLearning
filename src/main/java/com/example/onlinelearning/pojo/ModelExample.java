package com.example.onlinelearning.pojo;

import java.util.ArrayList;
import java.util.List;

public class ModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer start;

    protected Integer limit;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ModelExample() {
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

        public Criteria andModidIsNull() {
            addCriterion("modid is null");
            return (Criteria) this;
        }

        public Criteria andModidIsNotNull() {
            addCriterion("modid is not null");
            return (Criteria) this;
        }

        public Criteria andModidEqualTo(Integer value) {
            addCriterion("modid =", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidNotEqualTo(Integer value) {
            addCriterion("modid <>", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidGreaterThan(Integer value) {
            addCriterion("modid >", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidGreaterThanOrEqualTo(Integer value) {
            addCriterion("modid >=", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidLessThan(Integer value) {
            addCriterion("modid <", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidLessThanOrEqualTo(Integer value) {
            addCriterion("modid <=", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidIn(List<Integer> values) {
            addCriterion("modid in", values, "modid");
            return (Criteria) this;
        }

        public Criteria andModidNotIn(List<Integer> values) {
            addCriterion("modid not in", values, "modid");
            return (Criteria) this;
        }

        public Criteria andModidBetween(Integer value1, Integer value2) {
            addCriterion("modid between", value1, value2, "modid");
            return (Criteria) this;
        }

        public Criteria andModidNotBetween(Integer value1, Integer value2) {
            addCriterion("modid not between", value1, value2, "modid");
            return (Criteria) this;
        }

        public Criteria andModNameIsNull() {
            addCriterion("modName is null");
            return (Criteria) this;
        }

        public Criteria andModNameIsNotNull() {
            addCriterion("modName is not null");
            return (Criteria) this;
        }

        public Criteria andModNameEqualTo(String value) {
            addCriterion("modName =", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotEqualTo(String value) {
            addCriterion("modName <>", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameGreaterThan(String value) {
            addCriterion("modName >", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameGreaterThanOrEqualTo(String value) {
            addCriterion("modName >=", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLessThan(String value) {
            addCriterion("modName <", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLessThanOrEqualTo(String value) {
            addCriterion("modName <=", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLike(String value) {
            addCriterion("modName like", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotLike(String value) {
            addCriterion("modName not like", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameIn(List<String> values) {
            addCriterion("modName in", values, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotIn(List<String> values) {
            addCriterion("modName not in", values, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameBetween(String value1, String value2) {
            addCriterion("modName between", value1, value2, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotBetween(String value1, String value2) {
            addCriterion("modName not between", value1, value2, "modName");
            return (Criteria) this;
        }

        public Criteria andModDesIsNull() {
            addCriterion("modDes is null");
            return (Criteria) this;
        }

        public Criteria andModDesIsNotNull() {
            addCriterion("modDes is not null");
            return (Criteria) this;
        }

        public Criteria andModDesEqualTo(String value) {
            addCriterion("modDes =", value, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesNotEqualTo(String value) {
            addCriterion("modDes <>", value, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesGreaterThan(String value) {
            addCriterion("modDes >", value, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesGreaterThanOrEqualTo(String value) {
            addCriterion("modDes >=", value, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesLessThan(String value) {
            addCriterion("modDes <", value, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesLessThanOrEqualTo(String value) {
            addCriterion("modDes <=", value, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesLike(String value) {
            addCriterion("modDes like", value, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesNotLike(String value) {
            addCriterion("modDes not like", value, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesIn(List<String> values) {
            addCriterion("modDes in", values, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesNotIn(List<String> values) {
            addCriterion("modDes not in", values, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesBetween(String value1, String value2) {
            addCriterion("modDes between", value1, value2, "modDes");
            return (Criteria) this;
        }

        public Criteria andModDesNotBetween(String value1, String value2) {
            addCriterion("modDes not between", value1, value2, "modDes");
            return (Criteria) this;
        }

        public Criteria andParModIsNull() {
            addCriterion("parMod is null");
            return (Criteria) this;
        }

        public Criteria andParModIsNotNull() {
            addCriterion("parMod is not null");
            return (Criteria) this;
        }

        public Criteria andParModEqualTo(Integer value) {
            addCriterion("parMod =", value, "parMod");
            return (Criteria) this;
        }

        public Criteria andParModNotEqualTo(Integer value) {
            addCriterion("parMod <>", value, "parMod");
            return (Criteria) this;
        }

        public Criteria andParModGreaterThan(Integer value) {
            addCriterion("parMod >", value, "parMod");
            return (Criteria) this;
        }

        public Criteria andParModGreaterThanOrEqualTo(Integer value) {
            addCriterion("parMod >=", value, "parMod");
            return (Criteria) this;
        }

        public Criteria andParModLessThan(Integer value) {
            addCriterion("parMod <", value, "parMod");
            return (Criteria) this;
        }

        public Criteria andParModLessThanOrEqualTo(Integer value) {
            addCriterion("parMod <=", value, "parMod");
            return (Criteria) this;
        }

        public Criteria andParModIn(List<Integer> values) {
            addCriterion("parMod in", values, "parMod");
            return (Criteria) this;
        }

        public Criteria andParModNotIn(List<Integer> values) {
            addCriterion("parMod not in", values, "parMod");
            return (Criteria) this;
        }

        public Criteria andParModBetween(Integer value1, Integer value2) {
            addCriterion("parMod between", value1, value2, "parMod");
            return (Criteria) this;
        }

        public Criteria andParModNotBetween(Integer value1, Integer value2) {
            addCriterion("parMod not between", value1, value2, "parMod");
            return (Criteria) this;
        }

        public Criteria andModCDIsNull() {
            addCriterion("modCD is null");
            return (Criteria) this;
        }

        public Criteria andModCDIsNotNull() {
            addCriterion("modCD is not null");
            return (Criteria) this;
        }

        public Criteria andModCDEqualTo(Integer value) {
            addCriterion("modCD =", value, "modCD");
            return (Criteria) this;
        }

        public Criteria andModCDNotEqualTo(Integer value) {
            addCriterion("modCD <>", value, "modCD");
            return (Criteria) this;
        }

        public Criteria andModCDGreaterThan(Integer value) {
            addCriterion("modCD >", value, "modCD");
            return (Criteria) this;
        }

        public Criteria andModCDGreaterThanOrEqualTo(Integer value) {
            addCriterion("modCD >=", value, "modCD");
            return (Criteria) this;
        }

        public Criteria andModCDLessThan(Integer value) {
            addCriterion("modCD <", value, "modCD");
            return (Criteria) this;
        }

        public Criteria andModCDLessThanOrEqualTo(Integer value) {
            addCriterion("modCD <=", value, "modCD");
            return (Criteria) this;
        }

        public Criteria andModCDIn(List<Integer> values) {
            addCriterion("modCD in", values, "modCD");
            return (Criteria) this;
        }

        public Criteria andModCDNotIn(List<Integer> values) {
            addCriterion("modCD not in", values, "modCD");
            return (Criteria) this;
        }

        public Criteria andModCDBetween(Integer value1, Integer value2) {
            addCriterion("modCD between", value1, value2, "modCD");
            return (Criteria) this;
        }

        public Criteria andModCDNotBetween(Integer value1, Integer value2) {
            addCriterion("modCD not between", value1, value2, "modCD");
            return (Criteria) this;
        }

        public Criteria andModUrlIsNull() {
            addCriterion("modUrl is null");
            return (Criteria) this;
        }

        public Criteria andModUrlIsNotNull() {
            addCriterion("modUrl is not null");
            return (Criteria) this;
        }

        public Criteria andModUrlEqualTo(String value) {
            addCriterion("modUrl =", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlNotEqualTo(String value) {
            addCriterion("modUrl <>", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlGreaterThan(String value) {
            addCriterion("modUrl >", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlGreaterThanOrEqualTo(String value) {
            addCriterion("modUrl >=", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlLessThan(String value) {
            addCriterion("modUrl <", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlLessThanOrEqualTo(String value) {
            addCriterion("modUrl <=", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlLike(String value) {
            addCriterion("modUrl like", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlNotLike(String value) {
            addCriterion("modUrl not like", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlIn(List<String> values) {
            addCriterion("modUrl in", values, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlNotIn(List<String> values) {
            addCriterion("modUrl not in", values, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlBetween(String value1, String value2) {
            addCriterion("modUrl between", value1, value2, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlNotBetween(String value1, String value2) {
            addCriterion("modUrl not between", value1, value2, "modUrl");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
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