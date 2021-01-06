package com.zyz.demo.controller;

import com.zyz.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class TestController {

    @Autowired
    UserService userService;

    @GetMapping("/QueryUser")
    public String findUserById(Integer id){
        log.info("findUserById方法被调用");
        return userService.findUserById(id);
    }
}
