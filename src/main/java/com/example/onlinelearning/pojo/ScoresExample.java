package com.example.onlinelearning.pojo;

import java.util.ArrayList;
import java.util.List;

public class ScoresExample {
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

    public ScoresExample() {
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

        public Criteria andScoidIsNull() {
            addCriterion("scoid is null");
            return (Criteria) this;
        }

        public Criteria andScoidIsNotNull() {
            addCriterion("scoid is not null");
            return (Criteria) this;
        }

        public Criteria andScoidEqualTo(Integer value) {
            addCriterion("scoid =", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidNotEqualTo(Integer value) {
            addCriterion("scoid <>", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidGreaterThan(Integer value) {
            addCriterion("scoid >", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scoid >=", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidLessThan(Integer value) {
            addCriterion("scoid <", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidLessThanOrEqualTo(Integer value) {
            addCriterion("scoid <=", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidIn(List<Integer> values) {
            addCriterion("scoid in", values, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidNotIn(List<Integer> values) {
            addCriterion("scoid not in", values, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidBetween(Integer value1, Integer value2) {
            addCriterion("scoid between", value1, value2, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidNotBetween(Integer value1, Integer value2) {
            addCriterion("scoid not between", value1, value2, "scoid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andScoresIsNull() {
            addCriterion("scores is null");
            return (Criteria) this;
        }

        public Criteria andScoresIsNotNull() {
            addCriterion("scores is not null");
            return (Criteria) this;
        }

        public Criteria andScoresEqualTo(Integer value) {
            addCriterion("scores =", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresNotEqualTo(Integer value) {
            addCriterion("scores <>", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresGreaterThan(Integer value) {
            addCriterion("scores >", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresGreaterThanOrEqualTo(Integer value) {
            addCriterion("scores >=", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresLessThan(Integer value) {
            addCriterion("scores <", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresLessThanOrEqualTo(Integer value) {
            addCriterion("scores <=", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresIn(List<Integer> values) {
            addCriterion("scores in", values, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresNotIn(List<Integer> values) {
            addCriterion("scores not in", values, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresBetween(Integer value1, Integer value2) {
            addCriterion("scores between", value1, value2, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresNotBetween(Integer value1, Integer value2) {
            addCriterion("scores not between", value1, value2, "scores");
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