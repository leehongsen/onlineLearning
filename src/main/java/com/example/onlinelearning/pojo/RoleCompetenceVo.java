package com.example.onlinelearning.pojo;

public class RoleCompetenceVo {
    private Integer roleid;

    private String roleName;

    private String roleDes;

    private String notes;

    private Integer modid;

    private Integer comNum;

    private String modDes;

    private Integer modCD;

    private String modName;

    private String modUrl;

    private Integer parMod;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDes() {
        return roleDes;
    }

    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes == null ? null : roleDes.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getModid() {
        return modid;
    }

    public void setModid(Integer modid) {
        this.modid = modid;
    }

    public Integer getComNum() {
        return comNum;
    }

    public void setComNum(Integer comNum) {
        this.comNum = comNum;
    }

    public String getModDes() {
        return modDes;
    }

    public void setModDes(String modDes) {
        this.modDes = modDes == null ? null : modDes.trim();
    }

    public Integer getModCD() {
        return modCD;
    }

    public void setModCD(Integer modCD) {
        this.modCD = modCD;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName == null ? null : modName.trim();
    }

    public String getModUrl() {
        return modUrl;
    }

    public void setModUrl(String modUrl) {
        this.modUrl = modUrl == null ? null : modUrl.trim();
    }

    public Integer getParMod() {
        return parMod;
    }

    public void setParMod(Integer parMod) {
        this.parMod = parMod;
    }
}