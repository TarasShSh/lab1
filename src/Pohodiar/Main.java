package Pohodiar;

public class Main {
    public static void main(final String[] args) {
        final Task10.Den[] week = new Task10.Den[7];

        week[0] = new Task10.Den(11, "Дощовито", 2,"Понеділок");
        week[1] = new Task10.Den(14, "Сонячнезно", 3, "Вівторок");
        week[2] = new Task10.Den(16, "Хмаринно", 1, "Середа");
        week[3] = new Task10.Den(7, "Хмаринно", 5, "Четвер");
        week[4] = new Task10.Den(9, "Дощовито", 2,  "Пʼятниця");
        week[5] = new Task10.Den(5, "Дощовито", 8,  "Субота");
        week[6] = new Task10.Den(2, "Сніжно", 1, "Неділя");

        for (Task10.Den day : week) {
            System.out.println(day);
        }
    }
}