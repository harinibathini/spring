package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("**********Core Java way************");
        System.out.println( "Hello World!" );
        HelloWorld h = new HelloWorld();
        h.printHello();

       System.out.println("************Using Spring***********");
       ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
       HelloWorld h1 = (HelloWorld) context.getBean("hw");
        System.out.println(h1);
        h1.printHello();
    }
}
