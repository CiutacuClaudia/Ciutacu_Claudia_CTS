package spital.facade.model;

import java.util.ArrayList;
import java.util.List;

public class Medic {

    private List<Pacient> pacienti;

    public Medic() {
        this.pacienti = new ArrayList<>();
    }

    public void adaugarePacient(Pacient pacient) {
        this.pacienti.add(pacient);
    }

    public boolean verificaTrimitere(Pacient pacient) {
        return this.pacienti.contains(pacient);
    }

    public Pacient getPacient(String numePacient) {
        for (Pacient pacient : pacienti) {
            if (pacient.getNumePacient().equals(numePacient)) {
                return pacient;
            }
        }
        return null;
    }
}
