package task.service;

import task.model.PassengerModel;
import task.model.TransportStopModel;
import java.util.ArrayList;
import java.util.List;

public class TakeAndOutPassengerService extends Service implements Runnable {


    List<PassengerModel> remainPassengerList = new ArrayList<>();

    @Override
    public void run() {
        lock.lock();
        remainPassengerList.clear();
        int countPassengerInto = 0;
        outPut.totalAmount(busModel.getPassengerList().size());
        if (busModel.getPassengerList().size() != 0) {
            int countPassengerOut = 0;
            for (PassengerModel passengerModel : busModel.getPassengerList()) {
                if (passengerModel.getPlaceOut() != numberNowStop) {
                    remainPassengerList.add(passengerModel);
                } else {
                    countPassengerOut++;
                }
            }
            outPut.quantityPassengerToOutOf(countPassengerOut);
            busModel.replaceToPassenger(remainPassengerList);
        }
        for (TransportStopModel transportStopModel : transportStopList) {
            if (transportStopModel.getNumber() == numberNowStop && transportStopList.size() != 0) {
                for (PassengerModel passengerModel : transportStopModel.getPassengerList()) {
                    busModel.getPassengerList().add(passengerModel);
                    countPassengerInto++;
                }
            }
        }
        outPut.quantityPassengerToInto(countPassengerInto);
        outPut.totalAmount(busModel.getPassengerList().size());
        lock.unlock();
    }
}
