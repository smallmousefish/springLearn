package com.imooc.demo.pattern.factory.abstractFactory;

import com.imooc.demo.pattern.factory.entity.KeyBorad;
import com.imooc.demo.pattern.factory.entity.Mouse;

public interface ComputerFactory {

    Mouse createMouse();
    KeyBorad createKeyBorad();
}
