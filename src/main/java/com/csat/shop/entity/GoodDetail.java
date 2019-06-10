package com.csat.shop.entity;

/**
 * @author lianghaolong
 * @date 2019/6/10 17:06
 */
public class GoodDetail {
    private Integer goodsId;
    private String description;
    private Integer prise;
    private String picture;
    private Integer isFork;
    private String colorGroup;
    private String sizeGroup;
    private Integer productId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrise() {
        return prise;
    }

    public void setPrise(Integer prise) {
        this.prise = prise;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getIsFork() {
        return isFork;
    }

    public void setIsFork(Integer isFork) {
        this.isFork = isFork;
    }

    public String getColorGroup() {
        return colorGroup;
    }

    public void setColorGroup(String colorGroup) {
        this.colorGroup = colorGroup;
    }

    public String getSizeGroup() {
        return sizeGroup;
    }

    public void setSizeGroup(String sizeGroup) {
        this.sizeGroup = sizeGroup;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "GoodDetail{" +
                "goodsId=" + goodsId +
                ", description='" + description + '\'' +
                ", prise=" + prise +
                ", picture='" + picture + '\'' +
                ", isFork=" + isFork +
                ", colorGroup='" + colorGroup + '\'' +
                ", sizeGroup='" + sizeGroup + '\'' +
                ", productId=" + productId +
                '}';
    }
}
