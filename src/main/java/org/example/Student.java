package org.example;

public class Student {
//    private int age;
//    private int rno;
    private Writer writer = new Pencil();
    public void writeExam(){
        writer.write();
    }
}
