package cn.wwn.test.factory;

import cn.wwn.test.intf.Hello;
import cn.wwn.test.intf.impl.HelloImpl2;

public class HelloApiStaticFactory {
    //静态工厂方法
    public static Hello newinstance(String message){
        //需要返回的bean实例
        return new HelloImpl2(message);
    }
    //实例工厂方法
    public Hello newinstance1(String message){
        //需要返回的bean实例
        return new HelloImpl2(message);
    }
}
