package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/xvxcsdfsd")
public class TextController {

    @RequestMapping("/sadsad")
    @ResponseBody
    public String text(){
        System.err.println("到了,这里");
        return "成功了";
    }
}
