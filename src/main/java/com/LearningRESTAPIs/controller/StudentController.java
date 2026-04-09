package com.LearningRESTAPIs.controller;

import com.LearningRESTAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
       return new StudentDto(4L,"Toufiqul Islam","islamtusher4@gmail.com");
    }
    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(5l,"tusher","tusdher@gmail.com");
    }
}
