package com.example.springbootredis.Controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class myCon {

    @Resource
    private StringRedisTemplate redisTemplate;
    @RequestMapping("/add")
    @ResponseBody
    public String add(String name_k,String name_v){
        ValueOperations operations = redisTemplate.opsForValue();
        operations.set("a","b");
        return "添加数据";

    }
}
