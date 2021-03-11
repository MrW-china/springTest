package cn.wwn.test.intf.impl;

import cn.wwn.test.intf.Hello;

public class HelloImpl implements Hello {
    @Override
    public void sayHello ( ) {
        System.out.println("Hello");
    }
}
