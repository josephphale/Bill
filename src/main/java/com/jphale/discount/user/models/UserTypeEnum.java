package com.jphale.discount.user.models;

public enum UserTypeEnum {
    EMPLOYEE("Employee"),
    AFFILIATE("Affiliate"),
    CUSTOMER("Customer");

    private String name;

    private UserTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
