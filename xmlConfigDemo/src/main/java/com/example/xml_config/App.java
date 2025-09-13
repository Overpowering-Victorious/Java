package com.example.xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.xml_config.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac1=new ClassPathXmlApplicationContext("appConfig.xml");
        
        Employee e1=(Employee) ac1.getBean("e1");
        System.out.println(e1.toString());
        
        ApplicationContext ac2=new ClassPathXmlApplicationContext("appConfigConstructor_arg.xml");
        
        Employee e2=(Employee) ac2.getBean("e5");
        System.out.println(e2.toString());
    }
}
