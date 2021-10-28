package WeatherChecker;

import java.util.Objects;
/*
Реалізувати класи День і Погода. Створити ієрархію класів та використати
структуру даних "масив", щоб отримати календар погоди за тиждень.
Самостійно визначити та реалізувати необхідні методи, та додаткові класи

 */
    public class Day {
        private final Weather weather = new Weather();
        private final String nameOfDay;

        public Day(final int temperature, final String type, final int speedOfWind, final String nameOfDay) {
            this.weather.setTemperature(temperature);
            this.weather.setType(type);
            this.weather.setSpeedOfWind(speedOfWind);
            this.nameOfDay = nameOfDay;
        }

        public Weather getWeather() {
            return weather;
        }

        public String getNameOfDay() {
            return nameOfDay;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            final Day day = (Day) o;
            return Objects.equals(weather, day.weather) && Objects.equals(nameOfDay, day.nameOfDay);
        }

        @Override
        public int hashCode() {
            return Objects.hash(weather, nameOfDay);
        }

        @Override
        public String toString() {
            return "У календарі сьогодні: " + getNameOfDay() + '\n' +
                    getWeather().toString() + '\n';
        }
    }