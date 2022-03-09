package com.imooc.demo.pattern.factory.abstractFactory;

import com.imooc.demo.pattern.factory.entity.KeyBorad;
import com.imooc.demo.pattern.factory.entity.Mouse;

//抽象工厂针对产品族
//添加新产品时候依旧违背开闭原则

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new HpComputerFactory();
        Mouse mouse = computerFactory.createMouse();
        KeyBorad keyBorad = computerFactory.createKeyBorad();
        mouse.sayHi();
        keyBorad.sayXXX();
    }
}
