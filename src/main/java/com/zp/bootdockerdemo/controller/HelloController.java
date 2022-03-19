package com.zp.bootdockerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("sayHello")
    @ResponseBody
    public String hello() {
        System.out.println(" hello ======");
        return "hello";
    }
}
