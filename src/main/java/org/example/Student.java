package org.example;

public class Student {
    public Student() {
        System.out.println("student is created..");
    }

    private int age;
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("Age: " + age);
    }

    // New method to fix the error
    public void pen() {
        if (pen != null) {
            pen.write();
        } else {
            System.out.println("Pen is created..");
        }
    }
}
