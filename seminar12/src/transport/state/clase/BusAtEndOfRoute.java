package transport.state.clase;

public class BusAtEndOfRoute implements  IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusInRoute || bus.getState() instanceof BusInService){
            System.out.println("Autobuzul " + bus.getLicensePlate() + " a ajuns la capat de linie.");
            bus.setState(this);
        }
        else{
            System.out.println("Autobuzul " + bus.getLicensePlate() + " nu poate ajunge la capat de linie");
        }
    }
}
