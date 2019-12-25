package com.wjy.demo_1220.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${app.msg}")   //将配置中的常量注入给属性msg
    private String msg;

    @GetMapping("/")
    public String testJson(){
        return msg;
    }
}
