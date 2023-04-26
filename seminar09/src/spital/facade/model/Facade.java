package spital.facade.model;

public class Facade {

    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        this.medic.adaugarePacient(new Pacient("Claudia", 1));
        this.medic.adaugarePacient(new Pacient("Catalin", 6));
        this.medic.adaugarePacient(new Pacient("Coti", 6));
        this.salon = new Salon();
        this.salon.adaugarePatLiber(1);
        this.salon.adaugarePatLiber(2);
    }

    public void interneazaPacient(String numePacient) {
        if (this.medic.verificaTrimitere(this.medic.getPacient(numePacient))) {
            if (this.salon.verificarePaturiLibere()) {
                if (this.medic.getPacient(numePacient).getGravitate() > 4) {
                    this.salon.ocupaPat();
                    System.out.println("Pacientul " + numePacient + " este internat.");
                } else {
                    System.out.println("Pacientul nu este intr-o stare suficient de grava.");
                }
            } else {
                System.out.println("Nu exista paturi libere.");
            }
        } else {
            System.out.println("Trebuie sa aveti trimitere de la medic.");
        }
    }
}
