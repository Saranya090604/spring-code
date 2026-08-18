package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Student student = context.getBean("st1", Student.class);
//        student.setAge(23);
//        System.out.println(student.getAge());
        student.writeExam();
    }
}
