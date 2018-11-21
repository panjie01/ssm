package com.toutiao.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ssm")
public class SSMController {

    @RequestMapping("demo")
    @ResponseBody
    public String test(){
        return "this is ssmdemo";
    }


    @RequestMapping("test")
    public String test2(){
        System.out.println("ceshi......");
        return "hello";
    }

}
