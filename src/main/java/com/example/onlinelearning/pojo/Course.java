package com.example.onlinelearning.pojo;

public class Course {
    private Integer couid;

    private String couName;

    private String couUploadTime;

    private String couDuration;

    private String notes;

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName == null ? null : couName.trim();
    }

    public String getCouUploadTime() {
        return couUploadTime;
    }

    public void setCouUploadTime(String couUploadTime) {
        this.couUploadTime = couUploadTime == null ? null : couUploadTime.trim();
    }

    public String getCouDuration() {
        return couDuration;
    }

    public void setCouDuration(String couDuration) {
        this.couDuration = couDuration == null ? null : couDuration.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}