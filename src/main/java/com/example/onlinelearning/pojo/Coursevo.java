package com.example.onlinelearning.pojo;

public class Coursevo {
    private Integer cosid;

    private String cosName;

    private Integer couid;

    private String couName;

    private String cosUploadTime;

    private String notes;

    private String cosUrl;

    public Integer getCosid() {
        return cosid;
    }

    public void setCosid(Integer cosid) {
        this.cosid = cosid;
    }

    public String getCosName() {
        return cosName;
    }

    public void setCosName(String cosName) {
        this.cosName = cosName == null ? null : cosName.trim();
    }

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

    public String getCosUploadTime() {
        return cosUploadTime;
    }

    public void setCosUploadTime(String cosUploadTime) {
        this.cosUploadTime = cosUploadTime == null ? null : cosUploadTime.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getCosUrl() {
        return cosUrl;
    }

    public void setCosUrl(String cosUrl) {
        this.cosUrl = cosUrl == null ? null : cosUrl.trim();
    }
}