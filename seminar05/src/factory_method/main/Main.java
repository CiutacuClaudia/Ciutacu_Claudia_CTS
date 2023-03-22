package factory_method.main;

import factory_method.FactoryBrancardier;
import factory_method.FactoryMedic;
import factory_method.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMedic factoryMedic = new FactoryMedic();
        FactoryBrancardier factoryBrancardier = new FactoryBrancardier();
        List<PersonalSpital> lista = new ArrayList<>();
        lista.add(factoryBrancardier.createPersonal("Vali"));
        lista.add(factoryMedic.createPersonal("Cata"));
        for (PersonalSpital personalSpital : lista) {
            personalSpital.afiseazaDescriere();
        }
    }
}

