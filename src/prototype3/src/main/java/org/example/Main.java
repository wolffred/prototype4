//package org.example;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Manager manager1 = new Manager("Bob" , 45, "Manager" );
//        //System.out.println(manager1.display()  + " " + manager1.hashCode());
//
//
//        //Shallow Copy
////        Manager manager2 = manager1;
////        System.out.println(manager2.display() + " " + manager2.hashCode());
////        System.out.println("");
////
////        manager2.setName("Bobo");
////        System.out.println("Same Object, Different References");
////        System.out.println(manager1.display() + " " + manager1.hashCode());
////        System.out.println(manager2.display() + " " + manager2.hashCode());
////
////
//        //Deep Copy
//
//        Manager manager3 = new Manager();
//        manager3.name = manager1.name;
//        manager3.age = manager1.age;
//        manager3.setJob("man");
//
//        System.out.println(manager1.display() + " " + manager1.hashCode());
//        System.out.println(manager3.display() + " " + manager3.hashCode());
////
////
////        //Cloning
////        Manager manager4 = manager1.clone();
////        System.out.println(manager4.display() + " " + manager4.hashCode());
//
//
//
//    }
//}