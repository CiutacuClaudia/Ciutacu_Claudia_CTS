package builder.main;

import builder.clase.ContBancar;
import builder.clase.ContBancarBuilder;
import builder.clase.ContBuilder;
import builder.clase.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder contBuilder= new ContBuilder();
        contBuilder.setCardAtasat(true).setNumeClient("Clau");
        ContBancar contBancar= contBuilder.build();

        ContBancar contBancar2= contBuilder.setNumeClient("Cata").setPrimesteSalariu(true).build();
        System.out.println(contBancar);
        System.out.println(contBancar2);

        IBuilder contBancarBuilder = new ContBancarBuilder();
        ContBancar contBancar1 = contBancarBuilder.setInternetBanking(true).setNumeClient("Ana").build();
        ContBancar contBancar3 = contBancarBuilder.setCardAtasat(true).setNumeClient("Gigi").build();
        System.out.println(contBancar1);
        System.out.println(contBancar3);
    }
}