public class Manager extends Worker implements Prototype{
    public Manager(String name, int age, String job) {
        super(name, age, job);
    }

    public Manager() {

    }

    @Override
    public Manager clone() {
        return new Manager(this.name, this.age, this.getJob());
    }
}
