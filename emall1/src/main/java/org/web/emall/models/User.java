package org.web.emall.models;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;

    private String avatarUrl;

    private String city;

    private Date dateAdd;

    private Date dateLogin;

    private String ipAdd;

    private String ipLogin;

    private Boolean isIdcardCheck;

    private String mobile;

    private String nick;

    private String province;

    private Integer source;

    private String sourceStr;

    private Integer status;

    private String statusStr;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Date getDateLogin() {
        return dateLogin;
    }

    public void setDateLogin(Date dateLogin) {
        this.dateLogin = dateLogin;
    }

    public String getIpAdd() {
        return ipAdd;
    }

    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd == null ? null : ipAdd.trim();
    }

    public String getIpLogin() {
        return ipLogin;
    }

    public void setIpLogin(String ipLogin) {
        this.ipLogin = ipLogin == null ? null : ipLogin.trim();
    }

    public Boolean getIsIdcardCheck() {
        return isIdcardCheck;
    }

    public void setIsIdcardCheck(Boolean isIdcardCheck) {
        this.isIdcardCheck = isIdcardCheck;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getSourceStr() {
        return sourceStr;
    }

    public void setSourceStr(String sourceStr) {
        this.sourceStr = sourceStr == null ? null : sourceStr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr == null ? null : statusStr.trim();
    }
}