package transport.state.clase;

public class Bus {

    private IBusState state;
    private String licensePlate;

    public Bus(String licensePlate) {
        this.state = new BusAtEndOfRoute();
        this.licensePlate = licensePlate;
    }

    public IBusState getState() {
        return state;
    }

    protected void setState(IBusState state) {
        this.state = state;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void leaveForRoute(){
        IBusState route = new BusInRoute();
        route.changeState(this);
    }

    public void getInService(){
        IBusState service= new BusInService();
        service.changeState(this);
    }

    public void arriveAtTheEndOfRoute(){
        IBusState end = new BusAtEndOfRoute();
        end.changeState(this);
    }
}
