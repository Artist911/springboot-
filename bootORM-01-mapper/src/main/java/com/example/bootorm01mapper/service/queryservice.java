package com.example.bootorm01mapper.service;

import com.example.bootorm01mapper.model.Student;
import org.springframework.stereotype.Service;


public interface queryservice {
    public Student querybyid(Integer id);
}
