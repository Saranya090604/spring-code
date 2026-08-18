package org.example;

public class Student {
    public Student(){
       System.out.println("student is created..");
    }
    private int age;
    Pen pen = new Pen();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("Age: "+ age);
    }
    public void writeExam(){
        pen.write();
    }
}
