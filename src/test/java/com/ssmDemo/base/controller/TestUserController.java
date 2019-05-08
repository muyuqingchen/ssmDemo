package com.ssmDemo.base.controller;

import com.ssmDemo.base.model.User;
import com.ssmDemo.base.model.UserExample;
import com.ssmDemo.base.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@ContextConfiguration(locations = {"classpath:spring/spring-mvc.xml","classpath:spring/spring-mybatis.xml"})
public class TestUserController {

    @Resource
    private UserServiceImpl userServiceImpl;

    @Test
    public void test(){
        UserExample userExample = new UserExample();
        List<User> userList = userServiceImpl.selectByExample(userExample);
        System.out.println(userList);
    }
}
