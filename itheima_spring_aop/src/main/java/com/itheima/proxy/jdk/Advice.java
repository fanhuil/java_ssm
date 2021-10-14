package com.itheima.proxy.jdk;

/**
 * @author fanhuilin
 * @date 2021-10-13 9:00
 */
public class Advice {
    public void before() {
        System.out.println("前置增强");
    }

    public void afterReturning() {
        System.out.println("后置增强");
    }
}
