package task.model;

import java.util.ArrayList;
import java.util.List;

public class BusModel {

    List<PassengerModel> passengerList = new ArrayList<>();

    public List<PassengerModel> getPassengerList() {
        return passengerList;
    }

    public void replaceToPassenger(List<PassengerModel> remainPassengerList) {
        passengerList.clear();
        for (PassengerModel passengerModel : remainPassengerList) {
            passengerList.add(passengerModel);
        }
    }
}
