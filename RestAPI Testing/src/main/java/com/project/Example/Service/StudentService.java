package com.project.Example.Service;

import ch.qos.logback.classic.model.LoggerModel;
import com.project.Example.model.Student;
import com.project.Example.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Student createStudent(Student student) {
       return repo.save(student);
    }


    public Student getStudentById(int id) {
        return repo.findById(id).get();
    }

    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    public void deleteStudent(int id) {
         repo.deleteById(id);
    }
}
