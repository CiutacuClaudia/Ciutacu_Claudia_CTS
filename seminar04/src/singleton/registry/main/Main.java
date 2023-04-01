package singleton.registry.main;

import singleton.registry.InstitutiePublica;

public class Main {

    public static void main(String[] args){
        InstitutiePublica politie=InstitutiePublica.getInstitutieOptimizat("Politie");
        InstitutiePublica pompieri=InstitutiePublica.getInstitutieOptimizat("Pompieri");
        InstitutiePublica politieLocala=InstitutiePublica.getInstitutieOptimizat("Politie");

        politie.setNumarAngajati(10);
        politieLocala.setNumarAngajati(20);
        pompieri.setNumarAngajati(5);

        System.out.println(politieLocala);
        System.out.println(politie);
        System.out.println(pompieri);
    }
}
