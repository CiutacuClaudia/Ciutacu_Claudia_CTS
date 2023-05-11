package transport.state.clase;

public class BusInService implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute){
            System.out.println("Autobuzul " + bus.getLicensePlate() + " este acum in service.");
            bus.setState(this);
        }
        else{
            System.out.println("Autobuzul " + bus.getLicensePlate() + " nu poate pleca in cursa noua.");
        }
    }
}
