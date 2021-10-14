package com.itheima.proxy.jdk;

/**
 * @author fanhuilin
 * @date 2021-10-13 8:59
 */
public class Target implements TargetInterface{
    @Override
    public void save() {
        System.out.println("save running...");
    }
}
