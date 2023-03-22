package factory_method;

public class FactoryAsistent implements Factory{
    public PersonalSpital createPersonal(String nume){
        return new Asistent(nume);
    }
}
