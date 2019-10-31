package com.xyddb2.api.entity;

public class SysRole {
    private String ROLEID;

    private String ROLENAME;

    private String STATUS;

    private String CREATTIME;

    private String CREATOPER;

    public String getROLEID() {
        return ROLEID;
    }

    public void setROLEID(String ROLEID) {
        this.ROLEID = ROLEID == null ? null : ROLEID.trim();
    }

    public String getROLENAME() {
        return ROLENAME;
    }

    public void setROLENAME(String ROLENAME) {
        this.ROLENAME = ROLENAME == null ? null : ROLENAME.trim();
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }

    public String getCREATTIME() {
        return CREATTIME;
    }

    public void setCREATTIME(String CREATTIME) {
        this.CREATTIME = CREATTIME == null ? null : CREATTIME.trim();
    }

    public String getCREATOPER() {
        return CREATOPER;
    }

    public void setCREATOPER(String CREATOPER) {
        this.CREATOPER = CREATOPER == null ? null : CREATOPER.trim();
    }
}