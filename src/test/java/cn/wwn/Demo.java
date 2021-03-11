package cn.wwn;

import cn.wwn.test.intf.Hello;
import cn.wwn.test.intf.impl.HelloImpl;
import cn.wwn.test.intf.impl.HelloImpl2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Demo {
    @Test
    public void HelloTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = applicationContext.getBean("hello", Hello.class);
        Hello bean = applicationContext.getBean(Hello.class);
        Object hello1 = applicationContext.getBean("hello");
        Class<?> aClass = hello1.getClass();
        System.out.println(aClass);
        bean.sayHello();
        hello.sayHello();
    }
    @Test
    public void HelloTest2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (HelloImpl2)applicationContext.getBean("hello2");
        hello.sayHello();
    }
}
