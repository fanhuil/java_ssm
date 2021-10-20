package com.itheima.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author fanhuilin
 * @date 2021-10-12 15:22
 */

@Controller
public class UserController {

    // 获得集合类型参数1
    @RequestMapping("quick13")
    @ResponseBody
    public void save13(String[] strs) { // 获得数组类型参数
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping("quick12")
    @ResponseBody
    public void save12(User user) { // 获得POJO类型参数
        System.out.println(user);
    }

    @RequestMapping("quick11")
    @ResponseBody
    public void save11(String username, int age) { // 基本类型参数
        System.out.println(username + "====" + age);
    }

    @RequestMapping("quikc10")
    @ResponseBody
    public User save10() {
        User user = new User();
        user.setUsername("lisi");
        user.setAge(30);
        return user;
    }

    @RequestMapping("quick9")
    @ResponseBody // 告知springMVC框架 不进行视图跳转，直接进行数据响应
    public String save9() throws JsonProcessingException {
        User user = new User();
        user.setUsername("lisi");
        user.setAge(30);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping("quick7")
    @ResponseBody // 告知springMVC框架 不进行视图跳转，直接进行数据响应
    public String save7() {
        return "hello itcast";
    }

    @RequestMapping("quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello itcast");
    }

    @RequestMapping("quick5")
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "沙丁鱼");
        return "quick5.jsp";
    }

    @RequestMapping("/quick4")
    public String save4(Model model) {
        model.addAttribute("username", "博学谷");
        return "quick4.jsp";
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        // 设置模型数据
        modelAndView.addObject("username", "itcast");
        // 设置跳转视图的名称
        modelAndView.setViewName("quick3.jsp");
        return modelAndView;
    }

    /**
     * Model 模型 封装数据
     * View 封装数据
     *
     * @return
     */
    @RequestMapping("/quick2")
    public ModelAndView save2() {
        ModelAndView modelAndView = new ModelAndView();
        // 设置模型数据
        modelAndView.addObject("username", "itcast");
        // 设置跳转视图的名称
        modelAndView.setViewName("quick2.jsp");
        return modelAndView;
    }

    @RequestMapping(value = "/quick")
    public String save() {
        System.out.println("Controller save running...");
        return "success.jsp";
    }
}

/**
 * 注解
 *
 * @RequestMapping 用于建立请求url和处理请求方法之间的对应关系
 * 作用地方：类、方法
 * 参数：
 */
