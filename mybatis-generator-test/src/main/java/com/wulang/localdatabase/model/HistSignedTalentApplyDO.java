package com.wulang.localdatabase.model;

import java.util.Date;

public class HistSignedTalentApplyDO {
    private Integer histid;

    private Integer userid;

    private String realName;

    private String phoneNumber;

    private Integer countryId;

    private String countryName;

    private String address;

    private String email;

    private String identityNumber;

    private String identityPictureFont;

    private Integer paymentType;

    private String bankCardNumber;

    private String bankCardName;

    private String bankCardPictureFont;

    private String paypalNumber;

    private Integer agencyId;

    private Integer checkState;

    private String checkReason;

    private Date checkTime;

    private Date createTime;

    private Date updateTime;

    public Integer getHistid() {
        return histid;
    }

    public void setHistid(Integer histid) {
        this.histid = histid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber == null ? null : identityNumber.trim();
    }

    public String getIdentityPictureFont() {
        return identityPictureFont;
    }

    public void setIdentityPictureFont(String identityPictureFont) {
        this.identityPictureFont = identityPictureFont == null ? null : identityPictureFont.trim();
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber == null ? null : bankCardNumber.trim();
    }

    public String getBankCardName() {
        return bankCardName;
    }

    public void setBankCardName(String bankCardName) {
        this.bankCardName = bankCardName == null ? null : bankCardName.trim();
    }

    public String getBankCardPictureFont() {
        return bankCardPictureFont;
    }

    public void setBankCardPictureFont(String bankCardPictureFont) {
        this.bankCardPictureFont = bankCardPictureFont == null ? null : bankCardPictureFont.trim();
    }

    public String getPaypalNumber() {
        return paypalNumber;
    }

    public void setPaypalNumber(String paypalNumber) {
        this.paypalNumber = paypalNumber == null ? null : paypalNumber.trim();
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getCheckState() {
        return checkState;
    }

    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }

    public String getCheckReason() {
        return checkReason;
    }

    public void setCheckReason(String checkReason) {
        this.checkReason = checkReason == null ? null : checkReason.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}