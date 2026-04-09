package com.LearningRESTAPIs.service.impl;

import com.LearningRESTAPIs.dto.StudentDto;
import com.LearningRESTAPIs.entity.Student;
import com.LearningRESTAPIs.repository.StudentRepository;
import com.LearningRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
       return students
                .stream().
                map(student -> new StudentDto(student.getId(),student.getName(),student.getEmail()))
                .toList();
    }
}
