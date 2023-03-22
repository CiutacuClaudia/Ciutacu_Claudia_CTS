package clase;

public abstract class Animal {
    private String name;
    private int age;

    public abstract void eat(String zooKeeperName);

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
