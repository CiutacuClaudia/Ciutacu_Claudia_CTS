package prototype.main;

import prototype.model.ContBancar;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> documents = new HashMap<>();
        documents.put("CI", 2);
        documents.put("adeverinta", 6);
        ContBancar contBancar = new ContBancar("Andrei", documents, 8);
        ContBancar contBancarCopie= (ContBancar) contBancar.cloneaza();
        System.out.println(contBancar==contBancarCopie);
        System.out.println(contBancar);
        System.out.println(contBancarCopie);
    }
}
