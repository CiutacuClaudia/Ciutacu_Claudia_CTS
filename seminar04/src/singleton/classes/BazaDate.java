package singleton.classes;


//Eager initialization - este creata la inceput o instanta chiar daca nu e folosita
public class BazaDate {

    private int dimensiuneDate;
    private int numarTabele;
    private String denumireBazaDate;

    public static BazaDate instanta = new BazaDate(100, 5, "Baza de date");

    private BazaDate(int dimensiuneDate, int numarTabele, String denumireBazaDate) {
        this.dimensiuneDate = dimensiuneDate;
        this.numarTabele = numarTabele;
        this.denumireBazaDate = denumireBazaDate;
    }

    public void setDimensiuneDate(int dimensiuneDate) {
        this.dimensiuneDate = dimensiuneDate;
    }

    private BazaDate() {

    }

    public static BazaDate getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        return "BazaDate{" +
                "dimensiuneDate=" + dimensiuneDate +
                ", numarTabele=" + numarTabele +
                ", denumireBazaDate='" + denumireBazaDate + '\'' +
                '}';
    }
}
