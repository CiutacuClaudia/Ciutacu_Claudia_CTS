package banca.flyweight.main;

import banca.flyweight.clase.Cont;
import banca.flyweight.clase.FlyweightFactory;
import banca.flyweight.clase.IClientBanca;

public class Main {

    public static void main(String[] args) {
        FlyweightFactory fabrica= new FlyweightFactory();
        Cont cont1= new Cont(23f, 1);
        Cont cont2= new Cont(2344f, 2);
        Cont cont3= new Cont(2332f, 3);

        IClientBanca detinator= fabrica.getDetinator("Vasile", "99202", "parc");
        detinator.descriere(cont1);

        fabrica.getDetinator("Alin", "0989", "strada").descriere(cont2);
        fabrica.getDetinator("Clau", "09765","ceva").descriere(cont3);
        fabrica.getDetinator("Alin", "0989", "strada").descriere(cont1);
    }
}
