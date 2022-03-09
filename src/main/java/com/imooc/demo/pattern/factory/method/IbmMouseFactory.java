package com.imooc.demo.pattern.factory.method;

import com.imooc.demo.pattern.factory.entity.IbmMouse;
import com.imooc.demo.pattern.factory.entity.Mouse;

public class IbmMouseFactory extends  LenvoMouseFactory{
    public Mouse createMouse()
    {
        return new IbmMouse();
    }
}
