package Viznyk;

public class Main {
    public static void main(final String[] args) {
        final Task11.Driver[] drivers = new Task11.Driver[2];

        drivers[0] = new Task11.Driver("Імʼян", "Прізвищенкович");
        drivers[1] = new Task11.Driver("Імʼяна", "Призвищенківна");

        final Task11.Taxi taxiCar = new Task11.Taxi("ЗАЗ", 5, drivers);

        System.out.println(taxiCar);
    }
}