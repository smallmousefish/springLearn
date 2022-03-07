package com.imooc.demo.pattern.singleton;

import sun.plugin2.liveconnect.JSExceptions;

import java.lang.reflect.Constructor;

public class SingletonDemo {

    public static void main(String[] args) throws Exception {

        System.out.println(StarvingSingleton.getInstance());

        Class clazz = StarvingSingleton.class;
        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        System.out.println(declaredConstructor.newInstance());

    }
}
