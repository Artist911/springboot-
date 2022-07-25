package com.example.bootorm01mapper.service.Imp;

import com.example.bootorm01mapper.dao.query;
import com.example.bootorm01mapper.model.Student;
import com.example.bootorm01mapper.service.queryservice;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class queryImpl implements queryservice {
    @Resource
    private query query;
    @Override
    public Student querybyid(Integer id) {
        Student student = query.queryById(id);
        return student;
    }
}
