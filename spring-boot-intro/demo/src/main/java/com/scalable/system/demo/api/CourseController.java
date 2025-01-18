package com.scalable.system.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private List<Course> courses = List.of(
            new Course(1, "Data Structure", "bla bla bla"),
            new Course(2, "Algorithms", "bla bla bla"),
            new Course(3, "Calculus", "bla bla bla")
    );

    @GetMapping
    public ResponseEntity<List<Course>> getAlCourses() {
        return ResponseEntity.ok(courses);
    }

    record Course(int id, String name, String description) {}
}

