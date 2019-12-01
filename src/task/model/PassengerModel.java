package task.model;

public class PassengerModel {

    private int placeInto;
    private int placeOut;

    public PassengerModel(int placeInto, int placeOut) {
        this.placeInto = placeInto;
        this.placeOut = placeOut;
    }

    public int getPlaceInto() {
        return placeInto;
    }

    public int getPlaceOut() {
        return placeOut;
    }

    @Override
    public String toString() {
        return "PassengerModel{" +
                "placeInto=" + placeInto +
                ", placeOut=" + placeOut +
                '}';
    }
}
