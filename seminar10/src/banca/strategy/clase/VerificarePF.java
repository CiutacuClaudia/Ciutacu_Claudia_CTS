package banca.strategy.clase;

public class VerificarePF implements  ModVerificare{
    @Override
    public void verifica() {
        System.out.println("Verifica buletinul persoanei fizice.");
    }
}
