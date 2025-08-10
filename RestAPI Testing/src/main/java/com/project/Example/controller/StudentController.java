package com.project.Example.controller;

import com.project.Example.Service.StudentService;
import com.project.Example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class StudentController {

    @Autowired
    private StudentService service;

    //get all students
    @GetMapping("/students")
    public List<Student> getStudents(){
        return service.getStudents();
    }


    //get students by id
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }


    //create new student in database
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/students/add")
    public Student createStudent(@RequestBody Student student){
        return service.createStudent(student);
    }


    //update student data in database
    @PutMapping("students/update")
    public Student updateStudent( @RequestBody Student student ){
        return service.updateStudent(student);
    }


    @DeleteMapping("students/{id}")
    public void deleteStudent(@PathVariable int id){
         service.deleteStudent(id);
    }

}
