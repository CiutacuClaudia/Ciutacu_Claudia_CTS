package restaurant.adapter.bar;

public class SoftBar implements ISoftBar {

    private String denumire;
    private double totalPlata;

    public SoftBar(String denumire) {
        this.denumire = denumire;
      }

    @Override
    public void printeazaNotaBauturi(double valoare) {
        System.out.println("Barul: " + this.denumire +
                " a emis nota aferenta bauturilor consumtae in valoarea de " + valoare);
    }
}
