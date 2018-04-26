package com.ljljob.controller;

import com.ljljob.entity.User;
import com.ljljob.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list")
    public List<User> list() {
        return userMapper.selectByExample(null);
    }

    @GetMapping("/get/{id}")
    public User get(@PathVariable(name = "id") Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @DeleteMapping("/delete/{id}")
    public void list(@PathVariable(name = "id") Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @PostMapping("/add")
    public int add(@RequestBody User user) {
        int insert = userMapper.insert(user);
        return insert;
    }

}
