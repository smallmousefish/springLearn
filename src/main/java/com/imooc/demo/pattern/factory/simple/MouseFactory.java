package com.imooc.demo.pattern.factory.simple;

import com.imooc.demo.pattern.factory.entity.DellMouse;
import com.imooc.demo.pattern.factory.entity.HpMouse;
import com.imooc.demo.pattern.factory.entity.Mouse;


//简单工厂

/**
 * 优点
 * 1.可以对创建的对象加工，对客户端隐藏相关细节
 * 缺点
 * 1.因为创建逻辑复杂或创建对象过多造成代码臃肿
 * 2.增加删除新的类需要修改代码  违反开闭原则  一个软件实体应该对拓展开放对修改关闭。
 * 3。新增联想鼠标的例子
 */
public class MouseFactory  {

    public static Mouse createMouse(int type)
    {
        switch (type)
        {
            case 0 :return new DellMouse();
            case 1 :return new HpMouse();
            default:return new DellMouse();

        }
    }

    public static void main(String[] args) {

       Mouse mouse =  MouseFactory.createMouse(1);
       mouse.sayHi();
    }
}
