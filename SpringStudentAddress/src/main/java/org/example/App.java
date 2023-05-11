package org.example;

import com.bean.Student;
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

        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); //no autowiring used
       ApplicationContext context = new ClassPathXmlApplicationContext("byName.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("byType.xml");
//       ApplicationContext context = new ClassPathXmlApplicationContext("byConstructor.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

    }
}
