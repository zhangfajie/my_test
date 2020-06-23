package com.itcast.Controller;import com.itcast.pojo.User;import com.itcast.service.UserMapper;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.ResponseBody;import org.springframework.web.bind.annotation.RestController;import java.util.List;/** * Created by zhangfajie on 2020/5/28. */@RestController@RequestMapping("user")public class UserController {    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);    @Autowired    private UserMapper userMapper;    @RequestMapping("finUserId")    @ResponseBody    public User finUserId(Integer userid){        return userMapper.finId(2);    }    @RequestMapping("finall")    @ResponseBody    public List<User> finUserAll(){        return userMapper.finAll();    }    @RequestMapping("finId_1")    @ResponseBody    public List<User> finId_1(){        return userMapper.finId_1();    }}