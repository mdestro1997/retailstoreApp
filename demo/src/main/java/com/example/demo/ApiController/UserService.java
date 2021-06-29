package com.example.demo.ApiController;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User newUser(String UserType, Double cost) {
        // UserType userType;
        // String type = UserType.EMPLOYEE.getUserTypeId();
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
        // System.out.println("DISCOU"+discountAmount);

        newUser.setUserTypeDiscount((newUser.getCost() - discountAmount));
        // System.out.println("TYPE"+newUser.getUserTypeDiscount());

        return newUser.getUserTypeDiscount();
    }

    public Double finalDiscount(User newUser) {
        // Decrease 5 for each 100
        Double finaDiscount = newUser.getUserTypeDiscount() - (Math.floor(Math.floor(newUser.getCost()) / 100) * 5);
        // System.out.println("Bill Amount After Final Discount is : " +
        // userBill.getFinalbillCost());
        newUser.setFinalDiscount(finaDiscount);
        // System.out.println(newUser.getFinalDiscount());

        return newUser.getFinalDiscount();
    }
}
