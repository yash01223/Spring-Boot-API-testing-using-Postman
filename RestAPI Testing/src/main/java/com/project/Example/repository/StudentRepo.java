package com.project.Example.repository;

import com.project.Example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo  extends JpaRepository<Student, Integer> {
}
