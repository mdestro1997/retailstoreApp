package com.example.demo.ApiController;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserServiceTest {
    @Test
    void testFinalDiscount() {
        
        User testUser = new User(400.0, UserType.EMPLOYEE);
        testUser.setUserTypeDiscount(280.0);
        
        Double finaDiscount = testUser.getUserTypeDiscount() - (Math.floor(Math.floor(testUser.getCost()) / 100) * 5);
        assertThat(finaDiscount).isEqualTo(260.0);

        User testUser1 = new User(600.0, UserType.AFFILIATE);
        testUser1.setUserTypeDiscount(540.0);
        
        Double finaDiscount1 = testUser1.getUserTypeDiscount() - (Math.floor(Math.floor(testUser1.getCost()) / 100) * 5);
        assertThat(finaDiscount1).isEqualTo(510.0);

        User testUser2 = new User(300.0, UserType.OLD_CUSTOMER);
        testUser2.setUserTypeDiscount(285.0);
        
        Double finaDiscount2 = testUser2.getUserTypeDiscount() - (Math.floor(Math.floor(testUser2.getCost()) / 100) * 5);
        assertThat(finaDiscount2).isEqualTo(270.0);
    
    }

    @Test
    void testNewUser() {

    }

    @Test
    void testUserTypeDiscount() {
        User testUser = new User(400.0, UserType.EMPLOYEE);
        Double discountAmount = testUser.getCost();
        Double discountPercentage = testUser.getUserType().getDiscountPercentage();
        discountAmount = ((discountAmount * discountPercentage) );
        testUser.setUserTypeDiscount(testUser.getCost() - discountAmount);

        Double userTypeDiscount = testUser.getUserTypeDiscount();
        assertThat(userTypeDiscount).isEqualTo(280.0);

        User testUser1 = new User(600.0, UserType.AFFILIATE);
        Double discountAmount1 = testUser1.getCost();
        Double discountPercentage1 = testUser1.getUserType().getDiscountPercentage();
        discountAmount1 = ((discountAmount1 * discountPercentage1) );
        testUser1.setUserTypeDiscount(testUser1.getCost() - discountAmount1);

        Double userTypeDiscount1 = testUser1.getUserTypeDiscount();


       assertThat(userTypeDiscount1).isEqualTo(540.0);

       User testUser2 = new User(300.0, UserType.OLD_CUSTOMER);
       Double discountAmount2 = testUser2.getCost();
       Double discountPercentage2 = testUser2.getUserType().getDiscountPercentage();
       discountAmount2 = ((discountAmount2 * discountPercentage2) );
       testUser2.setUserTypeDiscount(testUser2.getCost() - discountAmount2);

       Double userTypeDiscount2 = testUser2.getUserTypeDiscount();


      assertThat(userTypeDiscount2).isEqualTo(285.0);
    }
}
