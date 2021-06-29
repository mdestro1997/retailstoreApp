package com.example.demo.ApiController;

public class User {
    
    private Double cost;
    private UserType userType;
    private Double userTypeDiscount;
    private Double finalDiscount;

    public User(Double cost, UserType userType) {
        this.cost = cost;
        this.userType = userType;
    }

    

    public Double getUserTypeDiscount() {
        return userTypeDiscount;
    }

    public void setUserTypeDiscount(Double userTypeDiscount) {
        this.userTypeDiscount = userTypeDiscount;
    }

    public Double getFinalDiscount() {
        return finalDiscount;
    }

    public void setFinalDiscount(Double finalDiscount) {
        this.finalDiscount = finalDiscount;
    }

    

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User [cost=" + cost + ", userType=" + userType + "]";
    }

    

    

    
}
