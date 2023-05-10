package restaurant.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {

    private String nume;
    private List<IClient> lista;

    public Restaurant(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        this.lista.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        this.lista.remove(client);
    }

    @Override
    public void notificareClient(String mesaj) {
        for (IClient client : this.lista) {
            client.primesteNotificare(mesaj);
        }
    }

    public void introduceOfertaNoua() {
        String mesaj = this.nume + " a introdus o oferta noua ";
        notificareClient(mesaj);
    }

    public void adaugaDiscount(int discount) {
        String mesaj = this.nume + " a oferit un discount de " + discount;
        notificareClient(mesaj);
    }
}
