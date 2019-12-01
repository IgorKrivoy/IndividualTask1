package task.service;

import task.model.PassengerModel;
import task.model.TransportStopModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutOfBusService {

    public List<TransportStopModel> createBusStop() {
        List<TransportStopModel> transportStopList = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            if (i != 5) {
                transportStopList.add(new TransportStopModel(i, createPassenger(i)));
            } else {
                transportStopList.add(new TransportStopModel(i));
            }
        }
        return transportStopList;
    }

    public List<PassengerModel> createPassenger(int placeInto) {
        List<PassengerModel> passengerList = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            int diff = 5 - placeInto;
            Random r = new Random();
            int placeOut = r.nextInt(diff + 1);
            placeOut +=placeInto;
            if(placeOut == placeInto) {placeOut++;}
            passengerList.add(new PassengerModel(placeInto, placeOut));
        }
        return passengerList;
    }
}
