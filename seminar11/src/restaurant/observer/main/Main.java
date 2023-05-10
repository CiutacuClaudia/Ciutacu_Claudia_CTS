package restaurant.observer.main;

import restaurant.observer.clase.Client;
import restaurant.observer.clase.IClient;
import restaurant.observer.clase.IRestaurant;
import restaurant.observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("Claudia");
        IClient client2 = new Client("Cata");
        IClient client3 = new Client("Coti");

        Restaurant restaurant = new Restaurant("Tratoria");

        restaurant.introduceOfertaNoua();

        restaurant.abonareClient(client1);

        restaurant.adaugaDiscount(5);

        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonareClient(client1);

        restaurant.introduceOfertaNoua();
    }
}