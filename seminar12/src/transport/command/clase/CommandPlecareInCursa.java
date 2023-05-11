package transport.command.clase;

public class CommandPlecareInCursa implements ICommand {

    private int numarLinie;
    private Automobil automobil;

    public CommandPlecareInCursa(int numarLinie, Automobil automobil) {
        this.automobil = automobil;
        this.numarLinie = numarLinie;
    }

    @Override
    public void execute() {
        automobil.plecareInCursa(this.numarLinie);
    }
}
