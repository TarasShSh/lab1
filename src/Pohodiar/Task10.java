package Pohodiar;

import java.util.Objects;
/*
Реалізувати класи День і Погода. Створити ієрархію класів та використати
структуру даних "масив", щоб отримати календар погоди за тиждень.
Самостійно визначити та реалізувати необхідні методи, та додаткові класи

 */
public class Task10 {

    public static class Den {
        private final Pohoda pohoda = new Pohoda();
        private final String nameOfDay;

        public Den(final int temperature, final String typ, final int speedOfWind, final String nameOfDay) {
            this.pohoda.setTemperature(temperature);
            this.pohoda.setTyp(typ);
            this.pohoda.setSpeedOfWind(speedOfWind);
            this.nameOfDay = nameOfDay;
        }

        public Pohoda getPohoda() {
            return pohoda;
        }

        public String getNameOfDay() {
            return nameOfDay;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            final Den day = (Den) o;
            return Objects.equals(pohoda, day.pohoda) && Objects.equals(nameOfDay, day.nameOfDay);
        }

        @Override
        public int hashCode() {
            return Objects.hash(pohoda, nameOfDay);
        }

        @Override
        public String toString() {
            return "У календарі сьогодні: " + getNameOfDay() + '\n' +
                    getPohoda().toString() + '\n';
        }
    }


    public static class Pohoda {
        private int temperature;
        private String typ;
        private int speedOfWind;

        public Pohoda() {
            this.temperature = 0;
            this.typ = "Нема";
            this.speedOfWind = 0;
        }

        public Pohoda(final int temperature, final String typ, final int speedOfWind) {
            this.temperature = temperature;
            this.typ = typ;
            this.speedOfWind = speedOfWind;
        }

        public int getTemperature() {
            return temperature;
        }

        public String getTyp() {
            return typ;
        }

        public int getSpeedOfWind() {
            return speedOfWind;
        }

        public void setTemperature(final int temperature) {
            this.temperature = temperature;
        }

        public void setTyp(final String typ) {
            this.typ = typ;
        }

        public void setSpeedOfWind(final int speedOfWind) {
            this.speedOfWind = speedOfWind;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            final Pohoda pohoda = (Pohoda) o;
            return temperature == pohoda.temperature && speedOfWind == pohoda.speedOfWind && Objects.equals(typ, pohoda.typ);
        }

        @Override
        public int hashCode() {
            return Objects.hash(temperature, typ, speedOfWind);
        }

        @Override
        public String toString() {
            return  "Небодії: " + getTyp()  + '\n' +
                    "Числа на термометрі: " + getTemperature()       + '\n' +
                    "Швидкість втрачених літ або вітру: " + getSpeedOfWind() + " м/с"+ '\n';
        }
    }
}