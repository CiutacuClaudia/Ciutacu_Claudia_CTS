package main;

import clase.*;

public class Main {
    public static void main(String[] args) {

        ZooKeeper zooKeeper = new ZooKeeper("zooKeeper1");
        Zoo zoo = new Zoo("zoo1", zooKeeper);
        zoo.addAnimal(new Zebra("Zebruta", 2));
        zoo.addAnimal(new Lion("Simba", 4));
        zoo.addAnimal(new Maimuta("maimu", 5));
        zoo.feedAllAnimals();

    }
}