package com.example.bootorm01mapper.dao;

import com.example.bootorm01mapper.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface query {
    Student queryById(@Param("stuID") Integer id);
}
