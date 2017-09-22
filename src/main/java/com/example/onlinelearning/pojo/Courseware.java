package com.example.onlinelearning.pojo;

public class Courseware {
    private Integer cosid;

    private Integer couid;

    private String cosName;

    private String cosUploadTime;

    private String cosUrl;

    private String notes;

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

    public String getCosName() {
        return cosName;
    }

    public void setCosName(String cosName) {
        this.cosName = cosName == null ? null : cosName.trim();
    }

    public String getCosUploadTime() {
        return cosUploadTime;
    }

    public void setCosUploadTime(String cosUploadTime) {
        this.cosUploadTime = cosUploadTime == null ? null : cosUploadTime.trim();
    }

    public String getCosUrl() {
        return cosUrl;
    }

    public void setCosUrl(String cosUrl) {
        this.cosUrl = cosUrl == null ? null : cosUrl.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}