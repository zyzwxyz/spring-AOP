package com.zyz.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public String findUserById(Integer id){
        LOGGER.info("id的值为:{}",id);
        return "zyz";
    }

}
