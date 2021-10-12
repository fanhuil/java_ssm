package com.itheima.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author fanhuilin
 * @date 2021-10-12 14:53
 */
public class WebApplicationContextUtils {

    public static ApplicationContext getWebApplacationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("app");
    }
}
