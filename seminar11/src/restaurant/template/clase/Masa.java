package restaurant.template.clase;

public class Masa extends IMasa {
    public Masa(int numar) {
        super(numar);
    }

    @Override
    protected void curataMasa() {
        System.out.println("A fost curatata masa " + super.getNumar());
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Servetelele au fost puse pe masa " + super.getNumar());
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Tacamurile au fost asezate pe masa " + super.getNumar());
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Persoanele au fost invitate la masa " + super.getNumar());
    }
}
