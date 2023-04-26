package spital.facade.main;

import spital.facade.model.Facade;

public class Main {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.interneazaPacient("Claudia");
        facade.interneazaPacient("Catalin");
        facade.interneazaPacient("Vali");
        facade.interneazaPacient("Coti");
        facade.interneazaPacient("Coti");

    }
}