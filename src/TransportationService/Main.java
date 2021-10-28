package TransportationService;

public class Main {
    public static void main(final String[] args) {
        final Task11.Driver[] drivers = new Task11.Driver[2];

        drivers[0] = new Task11.Driver("Імʼян", "Прізвищенко");
        drivers[1] = new Task11.Driver("Імʼяна", "Прізвищів");

        final Task11.Taxi taxiCar = new Task11.Taxi("ЗАЗ", 5, drivers);

        System.out.println(taxiCar);
    }
}