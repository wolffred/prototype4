public class DeepCopy {

    public static void main(String [] args){

        Manager manager1 = new Manager("Bob" , 45, "Manager" );


        Manager manager3 = new Manager();
        manager3.name = manager1.name;
        manager3.age = manager1.age;


        System.out.println("manager1 " + manager1.display()  + " and hashcode is " + manager1.hashCode());
        System.out.println("manager3 " + manager3.display()  + " and hashcode is " + manager3.hashCode());

    }
}
