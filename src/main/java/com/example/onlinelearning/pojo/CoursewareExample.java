package com.example.onlinelearning.pojo;

import java.util.ArrayList;
import java.util.List;

public class CoursewareExample {
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

    public CoursewareExample() {
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

        public Criteria andCosidIsNull() {
            addCriterion("cosid is null");
            return (Criteria) this;
        }

        public Criteria andCosidIsNotNull() {
            addCriterion("cosid is not null");
            return (Criteria) this;
        }

        public Criteria andCosidEqualTo(Integer value) {
            addCriterion("cosid =", value, "cosid");
            return (Criteria) this;
        }

        public Criteria andCosidNotEqualTo(Integer value) {
            addCriterion("cosid <>", value, "cosid");
            return (Criteria) this;
        }

        public Criteria andCosidGreaterThan(Integer value) {
            addCriterion("cosid >", value, "cosid");
            return (Criteria) this;
        }

        public Criteria andCosidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cosid >=", value, "cosid");
            return (Criteria) this;
        }

        public Criteria andCosidLessThan(Integer value) {
            addCriterion("cosid <", value, "cosid");
            return (Criteria) this;
        }

        public Criteria andCosidLessThanOrEqualTo(Integer value) {
            addCriterion("cosid <=", value, "cosid");
            return (Criteria) this;
        }

        public Criteria andCosidIn(List<Integer> values) {
            addCriterion("cosid in", values, "cosid");
            return (Criteria) this;
        }

        public Criteria andCosidNotIn(List<Integer> values) {
            addCriterion("cosid not in", values, "cosid");
            return (Criteria) this;
        }

        public Criteria andCosidBetween(Integer value1, Integer value2) {
            addCriterion("cosid between", value1, value2, "cosid");
            return (Criteria) this;
        }

        public Criteria andCosidNotBetween(Integer value1, Integer value2) {
            addCriterion("cosid not between", value1, value2, "cosid");
            return (Criteria) this;
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

        public Criteria andCosNameIsNull() {
            addCriterion("cosName is null");
            return (Criteria) this;
        }

        public Criteria andCosNameIsNotNull() {
            addCriterion("cosName is not null");
            return (Criteria) this;
        }

        public Criteria andCosNameEqualTo(String value) {
            addCriterion("cosName =", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameNotEqualTo(String value) {
            addCriterion("cosName <>", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameGreaterThan(String value) {
            addCriterion("cosName >", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameGreaterThanOrEqualTo(String value) {
            addCriterion("cosName >=", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameLessThan(String value) {
            addCriterion("cosName <", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameLessThanOrEqualTo(String value) {
            addCriterion("cosName <=", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameLike(String value) {
            addCriterion("cosName like", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameNotLike(String value) {
            addCriterion("cosName not like", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameIn(List<String> values) {
            addCriterion("cosName in", values, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameNotIn(List<String> values) {
            addCriterion("cosName not in", values, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameBetween(String value1, String value2) {
            addCriterion("cosName between", value1, value2, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameNotBetween(String value1, String value2) {
            addCriterion("cosName not between", value1, value2, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeIsNull() {
            addCriterion("cosUploadTime is null");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeIsNotNull() {
            addCriterion("cosUploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeEqualTo(String value) {
            addCriterion("cosUploadTime =", value, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeNotEqualTo(String value) {
            addCriterion("cosUploadTime <>", value, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeGreaterThan(String value) {
            addCriterion("cosUploadTime >", value, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeGreaterThanOrEqualTo(String value) {
            addCriterion("cosUploadTime >=", value, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeLessThan(String value) {
            addCriterion("cosUploadTime <", value, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeLessThanOrEqualTo(String value) {
            addCriterion("cosUploadTime <=", value, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeLike(String value) {
            addCriterion("cosUploadTime like", value, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeNotLike(String value) {
            addCriterion("cosUploadTime not like", value, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeIn(List<String> values) {
            addCriterion("cosUploadTime in", values, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeNotIn(List<String> values) {
            addCriterion("cosUploadTime not in", values, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeBetween(String value1, String value2) {
            addCriterion("cosUploadTime between", value1, value2, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUploadTimeNotBetween(String value1, String value2) {
            addCriterion("cosUploadTime not between", value1, value2, "cosUploadTime");
            return (Criteria) this;
        }

        public Criteria andCosUrlIsNull() {
            addCriterion("cosUrl is null");
            return (Criteria) this;
        }

        public Criteria andCosUrlIsNotNull() {
            addCriterion("cosUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCosUrlEqualTo(String value) {
            addCriterion("cosUrl =", value, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlNotEqualTo(String value) {
            addCriterion("cosUrl <>", value, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlGreaterThan(String value) {
            addCriterion("cosUrl >", value, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cosUrl >=", value, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlLessThan(String value) {
            addCriterion("cosUrl <", value, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlLessThanOrEqualTo(String value) {
            addCriterion("cosUrl <=", value, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlLike(String value) {
            addCriterion("cosUrl like", value, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlNotLike(String value) {
            addCriterion("cosUrl not like", value, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlIn(List<String> values) {
            addCriterion("cosUrl in", values, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlNotIn(List<String> values) {
            addCriterion("cosUrl not in", values, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlBetween(String value1, String value2) {
            addCriterion("cosUrl between", value1, value2, "cosUrl");
            return (Criteria) this;
        }

        public Criteria andCosUrlNotBetween(String value1, String value2) {
            addCriterion("cosUrl not between", value1, value2, "cosUrl");
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