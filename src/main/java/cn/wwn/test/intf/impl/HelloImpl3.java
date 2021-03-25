package cn.wwn.test.intf.impl;

import cn.wwn.test.intf.Hello;

public class HelloImpl3 implements Hello {
    private String message;
    private int number;

    public HelloImpl3 ( ) {

    }

    public HelloImpl3 (String message, int number) {
        this.message = message;
        this.number = number;
    }

    public void setMessage (String message) {
        this.message = message;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    @Override
    public void sayHello ( ) {
        System.out.println(message+"有"+number+"只猫");
    }
}
