package com.example.onlinelearning.pojo;

public class Learnscorevo {
    private Integer scoid;

    private Integer userid;

    private Integer couid;

    private String username;

    private String couName;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName == null ? null : couName.trim();
    }
}