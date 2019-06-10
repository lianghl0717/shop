package com.csat.shop.entity;

public class ShopDetails {

    private String carriagePaid;
    private String name;
    private String  site;
    private String service;

    public String getCarriagePaid() {
        return carriagePaid;
    }

    public void setCarriagePaid(String carriagePaid) {
        this.carriagePaid = carriagePaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "ShopDetails{" +
                "carriagePaid='" + carriagePaid + '\'' +
                ", name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", service='" + service + '\'' +
                '}';
    }
}
