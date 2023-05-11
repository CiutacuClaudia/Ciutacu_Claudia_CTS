package transport.strategy.clase;

public class PlataCardTransport implements TipPlata{
    @Override
    public void plateste(double pret) {
        System.out.println("Plata biletului s-a efectuat prin card transport in valoare de " + pret);

    }
}
