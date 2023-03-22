package clase;

public class Zebra extends Animal{
    public Zebra(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println("Zebra: " + super.getName() +
                ", varsta: " + super.getAge() +
                " este hranit de: " + zooKeeperName);
    }
}
