package com.ljljob.controller;

import com.ljljob.entity.User;
import com.ljljob.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "Hello Spring Boot888!";
    }


}
