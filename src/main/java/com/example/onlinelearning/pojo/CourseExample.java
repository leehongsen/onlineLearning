package com.example.onlinelearning.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
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

    public CourseExample() {
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

        public Criteria andCouidIsNull() {
            addCriterion("couid is null");
            return (Criteria) this;
        }

        public Criteria andCouidIsNotNull() {
            addCriterion("couid is not null");
            return (Criteria) this;
        }

        public Criteria andCouidEqualTo(Integer value) {
            addCriterion("couid =", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotEqualTo(Integer value) {
            addCriterion("couid <>", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidGreaterThan(Integer value) {
            addCriterion("couid >", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("couid >=", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidLessThan(Integer value) {
            addCriterion("couid <", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidLessThanOrEqualTo(Integer value) {
            addCriterion("couid <=", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidIn(List<Integer> values) {
            addCriterion("couid in", values, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotIn(List<Integer> values) {
            addCriterion("couid not in", values, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidBetween(Integer value1, Integer value2) {
            addCriterion("couid between", value1, value2, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotBetween(Integer value1, Integer value2) {
            addCriterion("couid not between", value1, value2, "couid");
            return (Criteria) this;
        }

        public Criteria andCouNameIsNull() {
            addCriterion("couName is null");
            return (Criteria) this;
        }

        public Criteria andCouNameIsNotNull() {
            addCriterion("couName is not null");
            return (Criteria) this;
        }

        public Criteria andCouNameEqualTo(String value) {
            addCriterion("couName =", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotEqualTo(String value) {
            addCriterion("couName <>", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameGreaterThan(String value) {
            addCriterion("couName >", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameGreaterThanOrEqualTo(String value) {
            addCriterion("couName >=", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLessThan(String value) {
            addCriterion("couName <", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLessThanOrEqualTo(String value) {
            addCriterion("couName <=", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLike(String value) {
            addCriterion("couName like", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotLike(String value) {
            addCriterion("couName not like", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameIn(List<String> values) {
            addCriterion("couName in", values, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotIn(List<String> values) {
            addCriterion("couName not in", values, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameBetween(String value1, String value2) {
            addCriterion("couName between", value1, value2, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotBetween(String value1, String value2) {
            addCriterion("couName not between", value1, value2, "couName");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeIsNull() {
            addCriterion("couUploadTime is null");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeIsNotNull() {
            addCriterion("couUploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeEqualTo(String value) {
            addCriterion("couUploadTime =", value, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeNotEqualTo(String value) {
            addCriterion("couUploadTime <>", value, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeGreaterThan(String value) {
            addCriterion("couUploadTime >", value, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeGreaterThanOrEqualTo(String value) {
            addCriterion("couUploadTime >=", value, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeLessThan(String value) {
            addCriterion("couUploadTime <", value, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeLessThanOrEqualTo(String value) {
            addCriterion("couUploadTime <=", value, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeLike(String value) {
            addCriterion("couUploadTime like", value, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeNotLike(String value) {
            addCriterion("couUploadTime not like", value, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeIn(List<String> values) {
            addCriterion("couUploadTime in", values, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeNotIn(List<String> values) {
            addCriterion("couUploadTime not in", values, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeBetween(String value1, String value2) {
            addCriterion("couUploadTime between", value1, value2, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouUploadTimeNotBetween(String value1, String value2) {
            addCriterion("couUploadTime not between", value1, value2, "couUploadTime");
            return (Criteria) this;
        }

        public Criteria andCouDurationIsNull() {
            addCriterion("couDuration is null");
            return (Criteria) this;
        }

        public Criteria andCouDurationIsNotNull() {
            addCriterion("couDuration is not null");
            return (Criteria) this;
        }

        public Criteria andCouDurationEqualTo(String value) {
            addCriterion("couDuration =", value, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationNotEqualTo(String value) {
            addCriterion("couDuration <>", value, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationGreaterThan(String value) {
            addCriterion("couDuration >", value, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationGreaterThanOrEqualTo(String value) {
            addCriterion("couDuration >=", value, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationLessThan(String value) {
            addCriterion("couDuration <", value, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationLessThanOrEqualTo(String value) {
            addCriterion("couDuration <=", value, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationLike(String value) {
            addCriterion("couDuration like", value, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationNotLike(String value) {
            addCriterion("couDuration not like", value, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationIn(List<String> values) {
            addCriterion("couDuration in", values, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationNotIn(List<String> values) {
            addCriterion("couDuration not in", values, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationBetween(String value1, String value2) {
            addCriterion("couDuration between", value1, value2, "couDuration");
            return (Criteria) this;
        }

        public Criteria andCouDurationNotBetween(String value1, String value2) {
            addCriterion("couDuration not between", value1, value2, "couDuration");
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