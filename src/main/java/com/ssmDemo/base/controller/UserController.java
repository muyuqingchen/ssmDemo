package com.ssmDemo.base.controller;

import com.ssmDemo.base.model.User;
import com.ssmDemo.base.model.UserExample;
import com.ssmDemo.base.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/main")
    @ResponseBody
    public void main(){
        UserExample userExample = new UserExample();
        List<User> userList = userServiceImpl.selectByExample(userExample);
        if(!CollectionUtils.isEmpty(userList)){
            System.out.println(userList.size());
            System.out.println(userList.get(0).toString());
            System.out.println(userList.get(0).getTruename());
        }

    }
}
