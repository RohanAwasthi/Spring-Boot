package com.rohan.springboot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/welcome")
    public String welcomeMessage(){
       return "welcome to spring boot page";
    }
}
