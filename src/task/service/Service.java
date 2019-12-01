package task.service;

import task.model.BusModel;
import task.model.PassengerModel;
import task.model.TransportStopModel;
import task.util.OutPut;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Service {

    OutPut outPut = new OutPut();
    static List<TransportStopModel> transportStopList;
    static int numberNowStop;
    Lock lock = new ReentrantLock();
    static BusModel busModel;

    public Service(List<TransportStopModel> transportStopList, BusModel busModel) {
        this.transportStopList = transportStopList;
        this.busModel = busModel;

    }

    public Service() {
    }

    public void check() {
        for (TransportStopModel transportStopModel : transportStopList) {
            for (PassengerModel passengerModel : transportStopModel.getPassengerList()) {
                System.out.println(passengerModel.toString());
            }
        }
    }

}
