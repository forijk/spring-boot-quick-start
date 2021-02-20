package com.springboot.springbootquickstart.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class VideoController {

    @RequestMapping("list")
    public Object list(){

        Map<String,String> map = new HashMap<>();
        map.put("1", "SpringBoot课程");
        map.put("2", "SpringCloud微服务课程");
        map.put("3", "SpringCloud微服务课程");
        map.put("4", "SpringCloud微服务课程");

        return map;
    }
}
