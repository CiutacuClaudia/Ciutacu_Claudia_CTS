package transport.strategy.clase;

public class PlataSMS implements TipPlata {
    @Override
    public void plateste(double pret) {
        System.out.println("Plata biletului s-a efectuat prin sms in valoare de " + pret);
    }
}
