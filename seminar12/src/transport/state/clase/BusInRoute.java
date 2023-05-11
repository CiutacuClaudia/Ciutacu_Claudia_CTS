package transport.state.clase;

public class BusInRoute implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute){
            System.out.println("Autobuzul " + bus.getLicensePlate() + " pleaca intr-o cursa nou.");
            bus.setState(this);
        }
        else{
            System.out.println("Autobuzul " + bus.getLicensePlate() + " nu poate ajunge la capat de linie");
        }
    }
}
