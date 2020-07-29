package com.itcast.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * WebSocketControllerz
 * @author zhengkai.blog.csdn.net
 */
@Controller
@RequestMapping("page")
public class DemoController1 {

    //测试  2020  第一次提交  编号为2
    //测试  2020  第一次提交  编号为3
    @GetMapping("index")
    public String page(){

        return "websocket";
    }


}
