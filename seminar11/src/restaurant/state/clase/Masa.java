package restaurant.state.clase;

public class Masa {

    private int numar;
    private IStare stare;

    public Masa(int numar) {
        this.numar = numar;
        stare = new StareLibera();
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }

    public int getNumar() {
        return numar;
    }

    public IStare getStare() {
        return stare;
    }

    public void ocupaMasa() {
        IStare stare = new StareOcupata();
        stare.modificaStarea(this);
    }

    public void rezevaMasa() {
        IStare stare = new StareRezervata();
        stare.modificaStarea(this);
    }

    public void elibereazaMasa() {
        IStare stare = new StareLibera();
        stare.modificaStarea(this);
    }

    public void anuleazaRezervare(){
        IStare stare = new StareLibera();
        stare.modificaStarea(this);
    }
}
