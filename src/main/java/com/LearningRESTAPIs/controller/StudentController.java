package com.LearningRESTAPIs.controller;

import com.LearningRESTAPIs.dto.StudentDto;
import com.LearningRESTAPIs.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {

    private final StudentService  studentService;


    @GetMapping("/students")
    public List<StudentDto> getAllStudent() {
        return studentService.getAllStudents();
    }

        @GetMapping("/students/{id}")
        public StudentDto getStudentById () {
            return new StudentDto(5l, "tusher", "tusdher@gmail.com");
        }

    }

