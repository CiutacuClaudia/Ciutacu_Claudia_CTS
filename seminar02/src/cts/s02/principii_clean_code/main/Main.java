package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.readers.AngajatReader;
import cts.s02.principii_clean_code.clase.readers.AplicantReader;

public class Main {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        try {
            AplicantReader aplicantReader = new AngajatReader();
            listaAngajati = aplicantReader.readAplicants("angajati.txt");
            for(Aplicant aplicant:listaAngajati)
                System.out.println(aplicant.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}