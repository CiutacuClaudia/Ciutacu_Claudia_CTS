package restaurant.template.clase;

public abstract class IMasa {

    private int numar;

    public IMasa(int numar) {
        this.numar = numar;
    }

    public int getNumar() {
        return numar;
    }

    protected abstract void curataMasa();

    protected abstract void aseazaServetele();

    protected abstract void aseazaTacamuri();

    protected abstract void invitaPersoane();

    public final void ocupaMasa(){
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }
}
