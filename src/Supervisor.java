

public class Supervisor extends Worker implements Prototype{

    public Supervisor(String name, int age, String job) {
        super(name, age, job);
    }

    public Supervisor() {

    }

    @Override
    public Supervisor clone() {
        return new Supervisor(this.name, this.age, this.getJob());
    }
}

