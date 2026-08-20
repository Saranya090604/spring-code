package org.example;

public class Student {
//    private int age;
//    private int rno;
    private Writer writer;

    public Student(Writer writer) {
        this.writer = writer;
    }
    public Student(){

    }

    public void writeExam(){
        writer.write();
    }
}
