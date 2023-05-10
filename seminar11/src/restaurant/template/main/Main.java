package restaurant.template.main;

import restaurant.template.clase.IMasa;
import restaurant.template.clase.Masa;
import restaurant.template.clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        IMasa masa = new Masa(1);
        masa.ocupaMasa();

        IMasa masa2 = new MasaRezervata(2, 10);
        masa2.ocupaMasa();

    }
}
