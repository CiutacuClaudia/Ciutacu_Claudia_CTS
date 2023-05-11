package transport.state.main;

import transport.state.clase.Bus;
import transport.state.clase.IBusState;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("GR99XMS");
        bus.getInService();
        bus.arriveAtTheEndOfRoute();
        bus.arriveAtTheEndOfRoute();
        bus.leaveForRoute();
        bus.getInService();
        bus.arriveAtTheEndOfRoute();
    }
}
