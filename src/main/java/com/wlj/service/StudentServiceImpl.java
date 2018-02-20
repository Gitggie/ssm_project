package com.wlj.service;

import com.wlj.dao.StudentDao;
import com.wlj.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<Student> getAll(){
        return studentDao.getAll();
    }

    public Student selectById(int id){
        return studentDao.selectById(id);
    }
    public void insert(Student student){
        studentDao.insert(student);
    }
    public boolean delete(int id){
        studentDao.delete(id);
        return true;
    }
    public void update(Student student){
        studentDao.update(student);
    }
}

