package com.example.demo.ApiController;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User newUser(String UserType, Double cost) {
       
        System.out.println(UserType);

        switch (UserType) {
            case "EMPLOYEE":

                return new User(cost, com.example.demo.ApiController.UserType.EMPLOYEE);

            case "AFFILIATE":

                return new User(cost, com.example.demo.ApiController.UserType.AFFILIATE);

            case "OLD_CUSTOMER":

                return new User(cost, com.example.demo.ApiController.UserType.OLD_CUSTOMER);

            default:
                return new User(cost, com.example.demo.ApiController.UserType.CUSTOMER);
        }

    }

    public Double userTypeDiscount(User newUser) {
        Double discountAmount = newUser.getCost();
        Double discountPercentage = newUser.getUserType().getDiscountPercentage();
        discountAmount = discountAmount * discountPercentage;
        newUser.setUserTypeDiscount((newUser.getCost() - discountAmount));
        return newUser.getUserTypeDiscount();
    }

    public Double finalDiscount(User newUser) {
        Double finaDiscount = newUser.getUserTypeDiscount() - (Math.floor(Math.floor(newUser.getCost()) / 100) * 5);
        newUser.setFinalDiscount(finaDiscount); 
        return newUser.getFinalDiscount();
    }
}
