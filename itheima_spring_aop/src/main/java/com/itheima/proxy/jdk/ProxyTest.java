package com.itheima.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author fanhuilin
 * @date 2021-10-13 9:01
 */
public class ProxyTest {
    public static void main(String[] args) {
        Target target = new Target();

        Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标对象的类加载器
                target.getClass().getInterfaces(),// 目标对象相同的接口字节，对象数组
                new InvocationHandler(){
                    public Object invoke(Object proxy, Method method,Object[] args){
                        return null;
                    }
                }
        );
    }
}
