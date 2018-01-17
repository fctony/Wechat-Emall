package org.web.emall.models;

import java.io.Serializable;
import java.util.Date;

public class Coupons implements Serializable {
    private Integer id;

    private Integer dateEndDays;

    private Integer dateEndType;

    private Integer dateStartType;

    private Integer moneyHreshold;

    private Double moneyMax;

    private Double moneyMin;

    private String name;

    private Integer needscore;

    private Integer numberGitNumber;

    private Integer numberGit;

    private Integer numberLeft;

    private Integer numberPersonMax;

    private Integer numberTotal;

    private Integer numberUsed;

    private Integer status;

    private String statusStr;

    private String type;

    private Date dateAdd;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDateEndDays() {
        return dateEndDays;
    }

    public void setDateEndDays(Integer dateEndDays) {
        this.dateEndDays = dateEndDays;
    }

    public Integer getDateEndType() {
        return dateEndType;
    }

    public void setDateEndType(Integer dateEndType) {
        this.dateEndType = dateEndType;
    }

    public Integer getDateStartType() {
        return dateStartType;
    }

    public void setDateStartType(Integer dateStartType) {
        this.dateStartType = dateStartType;
    }

    public Integer getMoneyHreshold() {
        return moneyHreshold;
    }

    public void setMoneyHreshold(Integer moneyHreshold) {
        this.moneyHreshold = moneyHreshold;
    }

    public Double getMoneyMax() {
        return moneyMax;
    }

    public void setMoneyMax(Double moneyMax) {
        this.moneyMax = moneyMax;
    }

    public Double getMoneyMin() {
        return moneyMin;
    }

    public void setMoneyMin(Double moneyMin) {
        this.moneyMin = moneyMin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNeedscore() {
        return needscore;
    }

    public void setNeedscore(Integer needscore) {
        this.needscore = needscore;
    }

    public Integer getNumberGitNumber() {
        return numberGitNumber;
    }

    public void setNumberGitNumber(Integer numberGitNumber) {
        this.numberGitNumber = numberGitNumber;
    }

    public Integer getNumberGit() {
        return numberGit;
    }

    public void setNumberGit(Integer numberGit) {
        this.numberGit = numberGit;
    }

    public Integer getNumberLeft() {
        return numberLeft;
    }

    public void setNumberLeft(Integer numberLeft) {
        this.numberLeft = numberLeft;
    }

    public Integer getNumberPersonMax() {
        return numberPersonMax;
    }

    public void setNumberPersonMax(Integer numberPersonMax) {
        this.numberPersonMax = numberPersonMax;
    }

    public Integer getNumberTotal() {
        return numberTotal;
    }

    public void setNumberTotal(Integer numberTotal) {
        this.numberTotal = numberTotal;
    }

    public Integer getNumberUsed() {
        return numberUsed;
    }

    public void setNumberUsed(Integer numberUsed) {
        this.numberUsed = numberUsed;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }
}