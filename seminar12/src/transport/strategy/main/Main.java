package transport.strategy.main;

import transport.strategy.clase.Calator;
import transport.strategy.clase.PlataCardBancar;
import transport.strategy.clase.PlataCardTransport;
import transport.strategy.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator= new Calator("Claudia");
        calator.platesteBilet(3);
        calator.setMetodaPlata(new PlataSMS());
        calator.platesteBilet(23);
        calator.setMetodaPlata(new PlataCardBancar());
        calator.platesteBilet(25);
        calator.setMetodaPlata(new PlataCardTransport());
        calator.platesteBilet(25);
    }
}
