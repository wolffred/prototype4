public class Clone {

    public static void main(String [] args){
        Supervisor supervisor = new Supervisor("Bob" , 45, "Supervisor" );

        Supervisor supervisor1 = supervisor.clone();
        System.out.println("supervisor " + supervisor.display()  + " and hashcode is " + supervisor.hashCode());
        System.out.println("supervisor1 " + supervisor1.display()  + " and hashcode is " + supervisor1.hashCode());
    }
}


