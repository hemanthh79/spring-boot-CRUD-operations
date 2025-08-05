package com.CRUD.Operations.controller;

import com.CRUD.Operations.model.Students;
import com.CRUD.Operations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    public StudentRepository studentRepository;

    @PostMapping("/post")
    public ResponseEntity<?> saveStudent(@RequestBody Students student) {
        if(student == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("student data cannot be null");
        }

        Students savedStudent = studentRepository.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getAllStudents() {
        List<Students> result = studentRepository.findAll();

        if(result.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No students to display");
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Integer id) {
        Optional<Students> result = studentRepository.findById(id);

        if(result.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No students to display");
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id) {
        Optional<Students> student = studentRepository.findById(id);

        if(student.isPresent()) {
            studentRepository.delete(student.get());
            return ResponseEntity.ok("Student with ID " + id + " deleted successfully");
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with ID " + id + " not found");
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateById(@PathVariable Integer id, @RequestBody Students updatedStudent) {
        Optional<Students> optionalStudent = studentRepository.findById(id);

        if(optionalStudent.isPresent()) {
            Students student = optionalStudent.get();

            student.setName(updatedStudent.getName());
            student.setAddress(updatedStudent.getAddress());
            student.setEmail(updatedStudent.getEmail());

            studentRepository.save(student);

            return ResponseEntity.ok(student);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cannot find student with id" + id);
    }
}
