package banca.composite.clase;

public class Filiala implements UnitateBancara{

    private String nume;
    private int numarAngajati;

    public Filiala(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();

    }

    @Override
    public UnitateBancara getUnitate(int index) {
        throw new RuntimeException();
    }

    @Override
    public void printeazaDescriere(String indentare) {
        System.out.println(indentare + "Filiala " + this.nume + " are " + this.numarAngajati + " numar angajati.");
    }
}
