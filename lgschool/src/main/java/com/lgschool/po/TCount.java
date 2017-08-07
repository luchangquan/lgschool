package com.lgschool.po;

import java.util.Date;

public class TCount extends BasePo{
    private String id;

    private String online;

    private String altogether;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online == null ? null : online.trim();
    }

    public String getAltogether() {
        return altogether;
    }

    public void setAltogether(String altogether) {
        this.altogether = altogether == null ? null : altogether.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}