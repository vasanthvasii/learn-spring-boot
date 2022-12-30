package com.vasanthamd.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS","vasanth"),
                new Course(2,"Learn JAVA","vasanth")
        );
    }

    /*
    @RequestMapping("/courses/{id}")
    public Course retrieveCourseById(@RequestParam long id){
        return new Course(id, "learn AWS","vasanth");
    }
    */
}
