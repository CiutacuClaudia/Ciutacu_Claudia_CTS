package transport.strategy.clase;

public class PlataCardBancar implements TipPlata{
    @Override
    public void plateste(double pret) {
        System.out.println("Plata biletului s-a efectuat prin card bancar in valoare de " + pret);
    }
}
