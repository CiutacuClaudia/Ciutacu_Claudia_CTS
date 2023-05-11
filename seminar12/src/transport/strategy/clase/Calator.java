package transport.strategy.clase;

public class Calator {

    private String nume;
    private TipPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        metodaPlata= new PlataCardTransport();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public TipPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(TipPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(double tarifPlatit){
        this.metodaPlata.plateste(tarifPlatit);
    }
}
