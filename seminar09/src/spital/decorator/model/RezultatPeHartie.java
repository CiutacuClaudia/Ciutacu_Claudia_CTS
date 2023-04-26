package spital.decorator.model;

public class RezultatPeHartie implements FurnizareRezultat {
    @Override
    public void printeazaRezultat(String diagnostic) {
        System.out.println("Hartie: " + diagnostic);
    }
}
