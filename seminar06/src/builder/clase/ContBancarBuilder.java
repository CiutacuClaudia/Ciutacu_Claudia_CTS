package builder.clase;

public class ContBancarBuilder implements IBuilder{

    private boolean primesteSalariu;
    private boolean cardAtasat;
    private String numeClient;
    private boolean internetBanking;

    public IBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    public IBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public IBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public IBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancar build(){
        ContBancar contBancar= new ContBancar(this.primesteSalariu, this.cardAtasat,this.numeClient,this.internetBanking);
        return contBancar;
    }
    public ContBancarBuilder(){
        this.cardAtasat=false;
        this.numeClient="anonim";
        this.primesteSalariu=false;
        this.internetBanking=false;
    }
}
