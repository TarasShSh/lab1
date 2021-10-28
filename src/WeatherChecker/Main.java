package WeatherChecker;

public class Main {
    public static void main(final String[] args) {
        final Day[] week = new Day[7];

        week[0] = new Day(11, "Дощовито", 2,"Понеділок");
        week[1] = new Day(14, "Сонячнезно", 3, "Вівторок");
        week[2] = new Day(16, "Хмаринно", 1, "Середа");
        week[3] = new Day(7, "Хмаринно", 5, "Четвер");
        week[4] = new Day(9, "Дощовито", 2,  "Пʼятниця");
        week[5] = new Day(5, "Дощовито", 8,  "Субота");
        week[6] = new Day(2, "Сніжно", 1, "Неділя");

        for (Day day : week) {
            System.out.println(day);
        }
    }
}