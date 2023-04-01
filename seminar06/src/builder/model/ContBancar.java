package builder.model;

public class ContBancar {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private String numeClient;
    private boolean internetBanking;

    protected ContBancar(boolean primesteSalariu, boolean cardAtasat, String numeClient, boolean internetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.cardAtasat = cardAtasat;
        this.numeClient = numeClient;
        this.internetBanking = internetBanking;
    }

    public boolean isPrimesteSalariu() {
        return primesteSalariu;
    }

    protected void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    public boolean isCardAtasat() {
        return cardAtasat;
    }

    protected void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public String getNumeClient() {
        return numeClient;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    protected void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("primesteSalariu=").append(primesteSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }
}
