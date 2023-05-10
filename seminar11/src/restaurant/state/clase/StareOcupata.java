package restaurant.state.clase;

public class StareOcupata implements IStare {
    @Override
    public void modificaStarea(Masa masa) {
        if (!(masa.getStare() instanceof StareOcupata)) {
            System.out.println("Masa e ocupata acum");
            masa.setStare(this);
        } else {
            System.out.println("Masa e deja ocupata");
        }
    }
}
