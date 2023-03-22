package factory_method;

public class FactoryMedic {
    public PersonalSpital createPersonal(String nume) {
        return new Medic(nume);
    }
}
