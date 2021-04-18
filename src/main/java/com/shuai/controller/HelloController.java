package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shuaion 2018/4/25
 **/
@Controller
public class HelloController {

    @RequestMapping("/main")
    public String main() {
        return "main";
    }
}
