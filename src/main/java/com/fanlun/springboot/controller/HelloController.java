package com.fanlun.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map){
        List<String> users = new ArrayList<>();
        users.add("fanlun100");
        users.add("jiny");
        users.add("huanyue");
        map.put("hello", "fanlun");
        map.put("users", users);

        return "success";
    }
    //修改代码
    //修改代码//修改代码//修改代码
    //修改代码
    //修改代码
    //修改代码
    //修改代码
    //修改代码
    //修改代码
    //修改代码//修改代码

}
