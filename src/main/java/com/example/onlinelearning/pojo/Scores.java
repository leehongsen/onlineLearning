package com.example.onlinelearning.pojo;

public class Scores {
    private Integer scoid;

    private Integer userid;

    private Integer couid;

    private Integer scores;

    private String notes;

    public Integer getScoid() {
        return scoid;
    }

    public void setScoid(Integer scoid) {
        this.scoid = scoid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}