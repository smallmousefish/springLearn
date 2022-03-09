package com.imooc.demo.pattern.factory.abstractFactory;

import com.imooc.demo.pattern.factory.entity.HpKeyBorad;
import com.imooc.demo.pattern.factory.entity.HpMouse;
import com.imooc.demo.pattern.factory.entity.KeyBorad;
import com.imooc.demo.pattern.factory.entity.Mouse;

public class HpComputerFactory implements ComputerFactory{
    public Mouse createMouse() {
        return new HpMouse();
    }

    public KeyBorad createKeyBorad() {
        return new HpKeyBorad();
    }
}
