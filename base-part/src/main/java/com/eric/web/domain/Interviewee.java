package com.eric.web.domain;

import java.io.Serializable;

/**
 * Created by eric on 2017/10/18.
 */
public class Interviewee implements Serializable {
    private static final long serialVersionUID = -1L;
    private long id;
    private long phone;
    private String wxName;
    private String wxAvatar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    public String getWxAvatar() {
        return wxAvatar;
    }

    public void setWxAvatar(String wxAvatar) {
        this.wxAvatar = wxAvatar;
    }
}
