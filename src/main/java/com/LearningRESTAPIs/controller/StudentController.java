package com.LearningRESTAPIs.controller;

import com.LearningRESTAPIs.dto.StudentDto;
import com.LearningRESTAPIs.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

        @GetMapping("/students/{id}/{name}")
        public String getStudentById (@PathVariable Long id, @PathVariable String name) {
            return "Path variable "+id+" name is "+name;
        }

    }

