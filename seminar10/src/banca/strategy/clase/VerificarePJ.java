package banca.strategy.clase;

public class VerificarePJ implements ModVerificare {
    @Override
    public void verifica() {
        System.out.println("Verifica persoana juridica la registrul comertului.");
    }
}
