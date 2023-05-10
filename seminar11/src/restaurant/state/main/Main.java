package restaurant.state.main;

import restaurant.state.clase.Masa;

public class Main {
    public static void main(String[] args) {

        Masa masa1= new Masa(1);
        masa1.ocupaMasa();
        masa1.ocupaMasa();
        masa1.rezevaMasa();
        masa1.elibereazaMasa();
    }
}
