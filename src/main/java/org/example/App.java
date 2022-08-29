package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AutoFactory autoFactory = context.getBean("auto_factory", AutoFactory.class);
        AutoFactory autoFactory1 = context.getBean("auto_factory1", AutoFactory.class);

        autoFactory.runProduction();
        System.out.println();
        autoFactory1.runProduction();
    }
}
