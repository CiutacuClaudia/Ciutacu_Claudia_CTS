package banca.composite.main;

import banca.composite.clase.Filiala;
import banca.composite.clase.Sucursala;
import banca.composite.clase.UnitateBancara;

public class Main {
    public static void main(String[] args) {

        String indentare = " ";

        UnitateBancara sucursala1= new Sucursala("Sucursala 1 ", 10);
        UnitateBancara sucursala2= new Sucursala("Sucursala 2 ", 20);
        UnitateBancara agentie1= new Sucursala("Agentie 1 ", 12);
        UnitateBancara agentie2= new Sucursala("Agentie 2 ", 12);
        UnitateBancara filiala1= new Filiala("Filiala 1" , 15);
        UnitateBancara filiala2= new Filiala("Filiala 2" , 25);
        UnitateBancara filiala3= new Filiala("Filiala 3" , 35);

        sucursala1.adaugaUnitate(sucursala2);
        sucursala1.adaugaUnitate(agentie1);
        sucursala1.adaugaUnitate(filiala1);

        sucursala2.adaugaUnitate(agentie2);
        sucursala2.adaugaUnitate(filiala2);

        agentie1.adaugaUnitate(filiala3);

        sucursala1.printeazaDescriere(indentare);
    }
}