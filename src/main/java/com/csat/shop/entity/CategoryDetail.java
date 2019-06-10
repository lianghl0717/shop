package com.csat.shop.entity;

/**
 * @author lianghaolong
 * @date 2019/6/10 10:43
 */
public class CategoryDetail {
    private Integer cId;
    private String name;
    private String src;
    private String typeNumber;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber;
    }

    @Override
    public String toString() {
        return "CategoryDetail{" +
                "cId=" + cId +
                ", name='" + name + '\'' +
                ", src='" + src + '\'' +
                ", typeNumber='" + typeNumber + '\'' +
                '}';
    }
}
