package com.wulang.localdatabase.model;

public class UserRewardResultDO {
    private Integer userId;

    private String nickName;

    private Integer fiftyVideo;

    private Integer oneHundredVideo;

    private Integer threeHundredVideo;

    private Integer totalAmount;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Integer getFiftyVideo() {
        return fiftyVideo;
    }

    public void setFiftyVideo(Integer fiftyVideo) {
        this.fiftyVideo = fiftyVideo;
    }

    public Integer getOneHundredVideo() {
        return oneHundredVideo;
    }

    public void setOneHundredVideo(Integer oneHundredVideo) {
        this.oneHundredVideo = oneHundredVideo;
    }

    public Integer getThreeHundredVideo() {
        return threeHundredVideo;
    }

    public void setThreeHundredVideo(Integer threeHundredVideo) {
        this.threeHundredVideo = threeHundredVideo;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }
}