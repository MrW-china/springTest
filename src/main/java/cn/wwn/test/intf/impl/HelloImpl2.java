package cn.wwn.test.intf.impl;

import cn.wwn.test.intf.Hello;

public class HelloImpl2 implements Hello {
    private String message;
    public HelloImpl2(){
        this.message="Hello";
    }
    public HelloImpl2(String message){
        this.message=message;
    }
    @Override
    public void sayHello ( ) {
        System.out.println(message);
    }
}
