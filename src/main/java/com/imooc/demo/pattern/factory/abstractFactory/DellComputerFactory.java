package com.imooc.demo.pattern.factory.abstractFactory;

import com.imooc.demo.pattern.factory.entity.DellKeyBorad;
import com.imooc.demo.pattern.factory.entity.DellMouse;
import com.imooc.demo.pattern.factory.entity.KeyBorad;
import com.imooc.demo.pattern.factory.entity.Mouse;

public class DellComputerFactory implements ComputerFactory{


    public Mouse createMouse() {
        return new DellMouse();
    }

    public KeyBorad createKeyBorad() {
        return new DellKeyBorad();
    }
}
