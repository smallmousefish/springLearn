package com.imooc.demo.pattern.factory.method;

import com.imooc.demo.pattern.factory.entity.DellMouse;
import com.imooc.demo.pattern.factory.entity.LenvoMouse;
import com.imooc.demo.pattern.factory.entity.Mouse;

public class LenvoMouseFactory implements MouseFactory{
    public Mouse createMouse() {

        return new LenvoMouse();
    }
}
