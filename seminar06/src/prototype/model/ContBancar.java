package prototype.model;

import java.util.HashMap;
import java.util.Map;

public class ContBancar implements IContClonable {
    int suma;
    private String detinator;
    private Map<String, Integer> documents;
    private int numarFileDosar;

    public ContBancar(String detinator, Map<String, Integer> documents, int numarFileDosar){
        suma = 0;
        for (Integer file : documents.values()) {
            suma += file;
        }
        if (suma == numarFileDosar) {
            this.detinator = detinator;
            this.documents = documents;
            this.numarFileDosar = numarFileDosar;
        } else {
            throw new IllegalArgumentException("Numar incorect file");
        }
    }

    private ContBancar() {
        this.documents = null;
    }

    @Override
    public IContClonable cloneaza() {
        ContBancar contCopie = new ContBancar();
        contCopie.detinator = this.detinator;
        contCopie.numarFileDosar = this.numarFileDosar;
        contCopie.documents = new HashMap<>();
        for (String key : this.documents.keySet()) {
            contCopie.documents.put(key, this.documents.get(key));
        }
        return contCopie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("suma=").append(suma);
        sb.append(", detinator='").append(detinator).append('\'');
        sb.append(", documents=").append(documents);
        sb.append(", numarFileDosar=").append(numarFileDosar);
        sb.append('}');
        return sb.toString();
    }
}
