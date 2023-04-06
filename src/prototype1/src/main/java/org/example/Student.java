//package org.example;
//
//public class Student implements Cloneable{
//     String name;
//    private int age;
//
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//
//
//    public Student() {
//
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//
//    public String display(){
//
//        String value = "Name is " + this.name + " and age is " + this.age;
//
//        return value;
//    }
//
//    public Object clone()throws CloneNotSupportedException{
//        Student copy = (Student) super.clone();
//        return copy;
//
//    }
//}
