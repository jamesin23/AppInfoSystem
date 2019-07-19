package cn.appsys.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/test")
    @ResponseBody
    public String hello(String world){
        return  "world="+world;
    }
}
