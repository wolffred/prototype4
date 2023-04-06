//package org.example;
//
//public class Main  {
//    public static void main(String[] args) throws CloneNotSupportedException {
//
//        Student student1 = new Student("Bob", 21);
//        System.out.println("Student1: " + student1.display());
//        System.out.println("Student1: " + student1.hashCode());
//        System.out.println("");
//
//
//        //Shallow Copy
//        Student student2 = student1;
//        //student1.name = "Bib";
//        System.out.println("Student2: " + student2.display());
//        System.out.println("Student2: " + student2.hashCode());
//        System.out.println("");
//
//        System.out.println("Student1: " + student1.display());
//        System.out.println("Student1: " + student1.hashCode());
//        System.out.println("");
//
//
////        //Deep Copy
//        Student student3 = new Student();
//        student3.name = student1.name;
//        System.out.println("Student3: " + student3.display());
//        System.out.println("Student3: " + student3.hashCode());
//
//
////        //Cloning
//        Student student4 = (Student) student1.clone();
//        System.out.println("Student4: " + student4.display());
//        System.out.println("Student4: " + student4.hashCode());
//
//        Person person1 = (Person) student1.clone();
//        System.out.println(person1.toString());
//
//    }
//}