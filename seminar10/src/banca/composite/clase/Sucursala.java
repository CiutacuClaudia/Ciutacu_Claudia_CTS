package banca.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara {

    private String nume;
    private int numarAngajati;
    private List<UnitateBancara> lista;

    public Sucursala(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
        this.lista = new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        lista.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        lista.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return lista.get(index);
    }

    @Override
    public void printeazaDescriere(String indentare) {
        System.out.println(indentare + this.nume + " are " + this.numarAngajati + " numar angajati.");
        for (UnitateBancara unitateBancara : lista){
            unitateBancara.printeazaDescriere(indentare + "   ");
        }
    }
}
