package cn.wwn;

import cn.wwn.test.intf.Hello;
import cn.wwn.test.intf.impl.HelloImpl;
import cn.wwn.test.intf.impl.HelloImpl2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
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
        //HelloImpl bean = applicationContext.getBean(HelloImpl.class);
        //bean.sayHello();
        Hello hello = (HelloImpl)applicationContext.getBean("hello");
        hello.sayHello();
    }
    @Test
    //构造器实例化
    public void HelloTest2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (HelloImpl2)applicationContext.getBean("hello2");
        hello.sayHello();
    }
    @Test
    //静态工厂实例化
    public void HelloTest3(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello3 = (Hello)beanFactory.getBean("hello3");
        hello3.sayHello();
    }
    @Test
    //实例工厂实例化
    public void HelloTest4(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello5 = (Hello)beanFactory.getBean("hello6");
        hello5.sayHello();
    }
}
