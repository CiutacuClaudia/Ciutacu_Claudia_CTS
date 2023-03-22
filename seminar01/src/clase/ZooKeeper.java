package clase;

public class ZooKeeper {
    private String zooKeeperName;

    public ZooKeeper(String zooKeeperName) {
        this.zooKeeperName = zooKeeperName;
    }

    public void feedAnimal(Animal animal) {
        if (animal != null) {
            animal.eat(this.zooKeeperName);
        }
    }

}
