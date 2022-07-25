package com.example.dubboprovide02.imp;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.model.User;
import org.example.service.Userquery;
import org.springframework.stereotype.Service;

/**
 * @Service 可以不加
 */
@DubboService(interfaceClass = Userquery.class,version = "1.0")

public class UserqueryImp implements Userquery {

    @Override
    public User queryById(Integer id) {
        User user =new User();
        user.setId(id);
        user.setName("dlz");
        return user;
    }
}
