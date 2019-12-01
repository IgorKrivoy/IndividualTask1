package task.util;

public class OutPut {

    public void busComeToStop(int numberNowStop) {
        System.out.println("\nАвтобус прибыл на остновку №" + numberNowStop);
    }

    public void busGoingToNextStop() {
        System.out.println("Автобус выдвинулся к другой остановке");
    }

    public void totalAmount(int amount) {
        System.out.println("\t Общее кол-во пасажиров в автобусе:" + amount);
    }

    public void busGoingToAutoPark() {
        System.out.println("Автобус отправляется в автопарк");
    }

    public void tenSecondToGo() {
        System.out.println("10-ть секунд до отправления..");
    }

    public void quantityPassengerToOutOf(int quantity) {
        System.out.println("\t" + "\t" + quantity + " пасажиров вышло");
    }

    public void quantityPassengerToInto(int quantity) {
        System.out.println("\t" + "\t" + quantity + " пасажиров вошло");
    }
}
