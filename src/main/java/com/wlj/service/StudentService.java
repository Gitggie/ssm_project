package com.wlj.service;

import com.wlj.domain.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student selectById(int id);
    void insert(Student student);
    boolean delete(int id);
    void update(Student student);
}
