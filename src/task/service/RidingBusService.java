package task.service;

import task.model.TransportStopModel;

public class RidingBusService extends Service implements Runnable {

    TakeAndOutPassengerService takeAndOutPassengerService = new TakeAndOutPassengerService();

    @Override
    public void run() {
        for (TransportStopModel transportStopModel : transportStopList) {
            numberNowStop = transportStopModel.getNumber();
            outPut.busComeToStop(numberNowStop);
            outPut.tenSecondToGo();
            Thread myThread2 = new Thread(takeAndOutPassengerService);
            myThread2.start();
            try {
                Thread.sleep(10000);
                if(numberNowStop !=5) {
                    outPut.busGoingToNextStop();
                } else {
                    outPut.busGoingToAutoPark();
                }
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
