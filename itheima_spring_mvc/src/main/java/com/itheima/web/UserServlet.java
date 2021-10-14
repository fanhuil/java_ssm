package com.itheima.web;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 这个东西相当于springmvc
 * @author fanhuilin
 * @date 2021-10-12 14:18
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        // 原始获取app工具类
        // ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");

        // 自定义获取app的工具类
        // ApplicationContext app = WebApplicationContextUtils.getWebApplacationContext(servletContext);

        // Spring获取app的工具类
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);

        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
