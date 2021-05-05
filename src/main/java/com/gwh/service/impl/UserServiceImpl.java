package com.gwh.service.impl;

import com.gwh.dao.UserRepository;
import com.gwh.entity.User;
import com.gwh.service.UserService;
import com.gwh.source.DataSource;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    /**
     * 查询用户数据
     * @return
     */
    @Override
    public String queryUser(Integer id){
        User user = this.userRepository.get(id);
        return JSONObject.fromObject(user).toString();
    }

    @Override
    public String getUserById(Integer id){
        User user = this.userRepository.get(id);
        return JSONObject.fromObject(user).toString();
    }

}
