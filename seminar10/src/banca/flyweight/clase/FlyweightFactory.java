package banca.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, IClientBanca> mapCont;

    public FlyweightFactory(){
        this.mapCont=new HashMap<>();
    }

    public IClientBanca getDetinator(String nume, String numarTelefon, String adresa){
        if(!mapCont.containsKey(nume)){
            IClientBanca client= new Detinator(nume, numarTelefon, adresa);
            mapCont.put(nume, client);
            return client;
        }
        return mapCont.get(nume);
    }
}
