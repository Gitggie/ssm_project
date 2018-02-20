package com.wlj.dao;

import com.wlj.domain.Student;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface StudentDao {
    List<Student> getAll();
    Student selectById(int id);
    void insert(Student student);
    //dao接口该delete方法没有返回值，但业务层，逻辑层都必须要有
    void delete(int id);
    void update(Student student);
}

