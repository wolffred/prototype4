

public class Supervisor implements Prototype{

    public String name;
    public int age;
    private String job;


    public Supervisor(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Supervisor() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String display() {

        String value = "Name is " + this.name + ", age is " + this.age + " job is " + this.job;

        return value;
    }

    public Supervisor clone() {
        return new Supervisor(this.name, this.age, this.getJob());
    }
}

