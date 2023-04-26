package spital.decorator.model;

public abstract class DecoratorAbstract implements FurnizareRezultat {
    private FurnizareRezultat rezultatPeHartie;

    @Override
    public void printeazaRezultat(String diagnostic) {
        rezultatPeHartie.printeazaRezultat(diagnostic);
    }

    public DecoratorAbstract(FurnizareRezultat rezultatPeHartie) {
        this.rezultatPeHartie =  rezultatPeHartie;
    }

    public abstract void afisareOnline(String diagnostic);
}
