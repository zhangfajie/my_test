package com.itcast.Controller;


import com.itcast.config.WebSocketServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.io.IOException;

/**
 * WebSocketController
 * @author zhengkai.blog.csdn.net   测试  2017  第一次提交
 */
@RestController
public class DemoController {


    //测试  2017  第一次提交
    //测试  2017  第一次提交  编号为12




    @GetMapping("index")
    public ResponseEntity<String> index(){
        return ResponseEntity.ok("请求成功");
    }

    @GetMapping("page")
    public ModelAndView page(){
        return new ModelAndView("websocket");
    }

    @RequestMapping("/push/{toUserId}")
    public ResponseEntity<String> pushToWeb(String message, @PathVariable String toUserId) throws IOException {
        WebSocketServer web=new WebSocketServer();
        web.sendInfo(message,toUserId);
        return ResponseEntity.ok("MSG SEND SUCCESS");
    }
}
