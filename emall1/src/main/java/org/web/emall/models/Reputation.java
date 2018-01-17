package org.web.emall.models;

import java.io.Serializable;
import java.util.Date;

public class Reputation implements Serializable {
    private Double amount;

    private Date dateReputation;

    private Integer goodReputation;

    private String goodReputationRemark;

    private String goodReputationStr;

    private Integer number;

    private Integer orderId;

    private String pic;

    private Integer uid;

    private Integer userId;

    private Integer goodsId;

    private String goodsName;

    private static final long serialVersionUID = 1L;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDateReputation() {
        return dateReputation;
    }

    public void setDateReputation(Date dateReputation) {
        this.dateReputation = dateReputation;
    }

    public Integer getGoodReputation() {
        return goodReputation;
    }

    public void setGoodReputation(Integer goodReputation) {
        this.goodReputation = goodReputation;
    }

    public String getGoodReputationRemark() {
        return goodReputationRemark;
    }

    public void setGoodReputationRemark(String goodReputationRemark) {
        this.goodReputationRemark = goodReputationRemark == null ? null : goodReputationRemark.trim();
    }

    public String getGoodReputationStr() {
        return goodReputationStr;
    }

    public void setGoodReputationStr(String goodReputationStr) {
        this.goodReputationStr = goodReputationStr == null ? null : goodReputationStr.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }
}