package com.example.onlinelearning.pojo;

public class LearningRecord {
    private Integer leaid;

    private Integer cosid;

    private Integer couid;

    private Integer userid;

    private String beginTimeToLearn;

    private String longTime;

    private String notes;

    public Integer getLeaid() {
        return leaid;
    }

    public void setLeaid(Integer leaid) {
        this.leaid = leaid;
    }

    public Integer getCosid() {
        return cosid;
    }

    public void setCosid(Integer cosid) {
        this.cosid = cosid;
    }

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBeginTimeToLearn() {
        return beginTimeToLearn;
    }

    public void setBeginTimeToLearn(String beginTimeToLearn) {
        this.beginTimeToLearn = beginTimeToLearn == null ? null : beginTimeToLearn.trim();
    }

    public String getLongTime() {
        return longTime;
    }

    public void setLongTime(String longTime) {
        this.longTime = longTime == null ? null : longTime.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}