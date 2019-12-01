package task.controller;

import task.model.BusModel;
import task.service.OutOfBusService;
import task.service.RidingBusService;
import task.service.Service;

public class Controller {

    OutOfBusService outOfBusService = new OutOfBusService();
    Service service;
    RidingBusService ridingBusService;


    public void run() {
        service = new Service(outOfBusService.createBusStop(), new BusModel());
        //service.check();
        ridingBusService = new RidingBusService();
        Thread myThread1 = new Thread(ridingBusService);
        myThread1.start();
    }
}
