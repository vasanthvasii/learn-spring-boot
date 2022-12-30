package com.vasanthamd.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class CurrencyServiceController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;
    @RequestMapping("/currency-service-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses(){
        return currencyServiceConfiguration;
    }

    /*
    @RequestMapping("/courses/{id}")
    public Course retrieveCourseById(@RequestParam long id){
        return new Course(id, "learn AWS","vasanth");
    }
    */
}
