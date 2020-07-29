package com.itcast.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * WebSocketController
 * @author zhengkai.blog.csdn.net
 */
@Controller
@RequestMapping("page")
public class DemoController1 {

    ///测试  2017  第一次提交
    @GetMapping("index")
    public String page(){

        return "websocket";
    }


}
