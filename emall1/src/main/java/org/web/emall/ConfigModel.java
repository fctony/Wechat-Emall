package org.web.emall;

import java.util.Date;

public class ConfigModel implements java.io.Serializable{

    public ConfigModel() {
    }

    public ConfigModel(Integer id, Date createAt, Integer dateType, String key, String remark, Date updateAt, Integer userId, String value) {
        this.id = id;
        this.createAt = createAt;
        this.dateType = dateType;
        this.key = key;
        this.remark = remark;
        this.updateAt = updateAt;
        this.userId = userId;
        this.value = value;
    }

    private Integer id;

    private Date createAt;

    private Integer dateType = 0;

    private String key;

    private String remark;

    private Date updateAt;

    private Integer userId;

    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getDateType() {
        return dateType;
    }

    public void setDateType(Integer dateType) {
        this.dateType = dateType;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
