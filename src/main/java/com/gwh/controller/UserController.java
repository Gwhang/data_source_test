package com.gwh.controller;

import com.gwh.service.UserService;
import com.gwh.source.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 查询用户信息
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public String queryUser(@RequestParam("id") Integer id){
        return userService.queryUser(id);
    }

    @RequestMapping("/get")
    @ResponseBody
    public String getUserById(@RequestParam("id") Integer id){
      return  this.userService.getUserById(id);
    }

}
