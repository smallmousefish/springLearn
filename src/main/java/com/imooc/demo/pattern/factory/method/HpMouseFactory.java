package com.imooc.demo.pattern.factory.method;

import com.imooc.demo.pattern.factory.entity.HpMouse;
import com.imooc.demo.pattern.factory.entity.Mouse;

public class HpMouseFactory implements MouseFactory{
    public Mouse createMouse() {
        return new HpMouse();
    }
}
