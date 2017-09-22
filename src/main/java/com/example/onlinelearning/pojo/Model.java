package com.example.onlinelearning.pojo;

public class Model {
    private Integer modid;

    private String modName;

    private String modDes;

    private Integer parMod;

    private Integer modCD;

    private String modUrl;

    private String notes;

    public Integer getModid() {
        return modid;
    }

    public void setModid(Integer modid) {
        this.modid = modid;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName == null ? null : modName.trim();
    }

    public String getModDes() {
        return modDes;
    }

    public void setModDes(String modDes) {
        this.modDes = modDes == null ? null : modDes.trim();
    }

    public Integer getParMod() {
        return parMod;
    }

    public void setParMod(Integer parMod) {
        this.parMod = parMod;
    }

    public Integer getModCD() {
        return modCD;
    }

    public void setModCD(Integer modCD) {
        this.modCD = modCD;
    }

    public String getModUrl() {
        return modUrl;
    }

    public void setModUrl(String modUrl) {
        this.modUrl = modUrl == null ? null : modUrl.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}