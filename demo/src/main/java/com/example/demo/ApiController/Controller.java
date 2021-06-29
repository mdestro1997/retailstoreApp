package com.example.demo.ApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path= "api/v1/retailStore" )
public class Controller {

    private final UserService userService;
   
    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }
   
    @GetMapping("/getDiscount")
    public Double calculateUserDiscount(@RequestParam String userType,@RequestParam Double amount){
        System.out.println(userType);
        System.out.println(amount);
        User david = userService.newUser(userType, amount);
        System.out.println("david"+david);
        Double discountAmount = userService.userTypeDiscount(david);
        System.out.println("at controller"+discountAmount);
        Double finalDiscount = userService.finalDiscount(david);
        System.out.println("at controller FINAL"+finalDiscount);



        return finalDiscount;
    }
}
