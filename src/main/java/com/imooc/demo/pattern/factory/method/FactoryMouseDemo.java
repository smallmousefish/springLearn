package com.imooc.demo.pattern.factory.method;

import com.imooc.demo.pattern.factory.entity.Mouse;

/**
 * 遵循开闭原则  隐藏对象创建逻辑。单一原则
 * 添加新的类需要增加与之对应的具体工厂类
 * 只支持同一类产品的创建
 */
public class FactoryMouseDemo {

    public static void main(String[] args) {
        MouseFactory mouseFactory = new IbmMouseFactory();
        Mouse mouse = mouseFactory.createMouse();
        mouse.sayHi();
    }
}
