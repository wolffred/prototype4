public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Bob" , 45, "Manager" );
//        System.out.println("manager1 " + manager1.display()  + " and hashcode is " + manager1.hashCode());


          //Shallow Copy
        Manager manager2 = manager1;
//        System.out.println("manager1 " + manager1.display()  + " and hashcode is " + manager1.hashCode());
//        System.out.println("manager2 " + manager2.display()  + " and hashcode is " + manager2.hashCode());
//        System.out.println("");

//        manager2.setName("Bobo");
//        System.out.println("Same Object, Different References");
//        System.out.println("manager1 " + manager1.display()  + " and hashcode is " + manager1.hashCode());
//        System.out.println("manager2 " + manager2.display()  + " and hashcode is " + manager2.hashCode());


        //Deep Copy

//        Manager manager3 = new Manager();
//        manager3.name = manager1.name;
//        manager3.age = manager1.age;
//        manager3.setJob("man");
//
//        System.out.println("manager1 " + manager1.display()  + " and hashcode is " + manager1.hashCode());
//        System.out.println("manager3 " + manager3.display()  + " and hashcode is " + manager3.hashCode());


        //Cloning
        Supervisor supervisor = new Supervisor("Bob" , 45, "Supervisor" );
        Supervisor supervisor1 = supervisor.clone();
        System.out.println("supervisor " + supervisor.display()  + " and hashcode is " + supervisor.hashCode());
        System.out.println("supervisor1 " + supervisor1.display()  + " and hashcode is " + supervisor1.hashCode());

    }
}