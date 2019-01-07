package com.zl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (C)，XX
 * FileName: HelloController
 * Author: zl
 * Date: 2019/1/7  21:30
 * Description: controller类
 **/

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {

        return "Hello World";

    }
}
