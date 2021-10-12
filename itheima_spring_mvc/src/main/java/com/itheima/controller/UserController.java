package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanhuilin
 * @date 2021-10-12 15:22
 */

@Controller
public class UserController {

    @RequestMapping("/quick")
    public String save(){
        System.out.println("Controller save running...");
        return "success.jsp";
    }
}
