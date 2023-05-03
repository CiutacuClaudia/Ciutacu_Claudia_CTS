package banca.strategy.main;

import banca.strategy.clase.Operator;
import banca.strategy.clase.VerificarePJ;

public class Main {
    public static void main(String[] args) {
        Operator operator= new Operator();
        operator.verificaClient();
        operator.setModVerificare(new VerificarePJ());
        operator.verificaClient();
    }
}
