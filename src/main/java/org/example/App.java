package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Student student = context.getBean("st1", Student.class);
        student.writeExam();   // calls the pen() method we’ll add in Student.java
    }
}
