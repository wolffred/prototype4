public class ShallowCopy {

    public static void main(String [] args){

        Manager manager1 = new Manager("Bob" , 45, "Manager" );

        Manager manager2 = manager1;
        System.out.println("manager1 " + manager1.display()  + " and hashcode is " + manager1.hashCode());
        System.out.println("manager2 " + manager2.display()  + " and hashcode is " + manager2.hashCode());
        System.out.println("");

        manager2.setName("Thomas");
        System.out.println("Same Object, Different References");
        System.out.println("manager1 " + manager1.display()  + " and hashcode is " + manager1.hashCode());
        System.out.println("manager2 " + manager2.display()  + " and hashcode is " + manager2.hashCode());

    }
}
