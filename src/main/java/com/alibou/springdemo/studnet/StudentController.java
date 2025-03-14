package com.alibou.springdemo.studnet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<String> findAllStudents() {
        return List.of("Alibou", "Hello world");
    }
}
