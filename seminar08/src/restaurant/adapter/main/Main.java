package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftRestaurant;

public class Main {

    public static void imprimare(ISoftRestaurant restaurant, double nota){
        restaurant.printeazaNota(nota);
    }
    public static void main(String[] args) {

        ISoftBar bar = new SoftBar("Restaurant 1");
        bar.printeazaNotaBauturi(200);

        ISoftRestaurant bucatarie= new Bucatarie("Claudia");
        bucatarie.printeazaNota(300);

//        Main.imprimare(bar, 300);  ---> ne cream adapter
        Main.imprimare(bucatarie, 500);

        AdapterRestaurant adapterRestaurant= new AdapterRestaurant("Restaurant 1");
        Main.imprimare(adapterRestaurant,400);

        AdapterObiecteRestaurant adapterObiecteRestaurant= new AdapterObiecteRestaurant(bar);
        imprimare(adapterObiecteRestaurant, 150);
    }
}