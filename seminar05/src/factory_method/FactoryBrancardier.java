package factory_method;

public class FactoryBrancardier {
    public PersonalSpital createPersonal(String nume) {
        return new Brancardier(nume);
    }
}
