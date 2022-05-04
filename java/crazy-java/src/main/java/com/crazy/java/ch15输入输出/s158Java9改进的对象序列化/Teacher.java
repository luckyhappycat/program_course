package com.crazy.java.ch15输入输出.s158Java9改进的对象序列化;
public class Teacher implements java.io.Serializable {
    private String name;
    private Person student;
    public Teacher(String name, Person student) {
        this.name = name;
        this.student = student;
    }
    // 此处省略了name和student的setter和getter方法
    // name的setter和getter方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    // student的setter和getter方法
    public void setStudent(Person student) {
        this.student = student;
    }
    public Person getStudent() {
        return this.student;
    }
}