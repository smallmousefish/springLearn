package com.imooc.demo.reflect;

public class ReflectTarget {

    public static void main(String[] args) throws ClassNotFoundException {
        ReflectTarget reflectTarget = new ReflectTarget();
        Class reflectTargetClass1 = reflectTarget.getClass();
        System.out.println("1="+reflectTargetClass1.getName());

        Class reflectTargetClass2 =  ReflectTarget.class;
        System.out.println("2="+reflectTargetClass2.getName());
        System.out.println(reflectTargetClass1 == reflectTargetClass2);

        Class reflectTargetClass3 =  Class.forName("com.imooc.demo.reflect.ReflectTarget");
        System.out.println("3="+reflectTargetClass3.getName());
    }
}
