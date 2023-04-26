package spital.decorator.main;

import spital.decorator.model.DecoratorAbstract;
import spital.decorator.model.FurnizareRezultat;
import spital.decorator.model.RezultatOnline;
import spital.decorator.model.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {
        FurnizareRezultat rezultatPeHartie= new RezultatPeHartie();
        rezultatPeHartie.printeazaRezultat("Raceala");

        DecoratorAbstract decoratorAbstract= new RezultatOnline(rezultatPeHartie);
        decoratorAbstract.afisareOnline("Raceala");
        decoratorAbstract.printeazaRezultat("Raceala");
    }
}
