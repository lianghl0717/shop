package com.csat.shop.entity;

public class GoodsList {

    private String name;
    private Integer haoping;
    private Integer buy;
    private Integer productId;
    private String src;
    private Integer typeNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHaoping() {
        return haoping;
    }

    public void setHaoping(Integer haoping) {
        this.haoping = haoping;
    }

    public Integer getBuy() {
        return buy;
    }

    public void setBuy(Integer buy) {
        this.buy = buy;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Integer getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(Integer typeNumber) {
        this.typeNumber = typeNumber;
    }

    @Override
    public String toString() {
        return "GoodsList{" +
                "name='" + name + '\'' +
                ", haoping=" + haoping +
                ", buy=" + buy +
                ", productId=" + productId +
                ", src='" + src + '\'' +
                ", typeNumber=" + typeNumber +
                '}';
    }
}
