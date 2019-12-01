package task.model;

import java.util.ArrayList;
import java.util.List;

public class TransportStopModel {

    int number;
    List<PassengerModel> passengerList;

    public TransportStopModel(int number, List<PassengerModel> passengerList) {
        this.number = number;
        this.passengerList = passengerList;
    }

    public TransportStopModel(int number) {
        this.number = number;
        passengerList = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public List<PassengerModel> getPassengerList() {
        return passengerList;
    }

    @Override
    public String toString() {
        return "TransportStopModel{" +
                "number=" + number +
                ", passengerList= \n" + passengerList +
                '}' + "\n";
    }
}
