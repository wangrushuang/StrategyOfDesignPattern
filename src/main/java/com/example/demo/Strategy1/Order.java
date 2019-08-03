package com.example.demo.Strategy1;

import org.springframework.stereotype.Component;


@Component
public class Order {
    public static final int FREE = 1; //免费订单
    public static final int HALF = 2; //半价订单
    public static final int DISCOUT = 3; //打折订单

    private String name;
    private Double price;
    private Integer type;//订单类型


    public static int getFREE() {
        return FREE;
    }

    public static int getHALF() {
        return HALF;
    }

    public static int getDISCOUT() {
        return DISCOUT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}