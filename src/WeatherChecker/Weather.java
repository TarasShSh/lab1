package WeatherChecker;

import java.util.Objects;

public class Weather {
    private int temperature;
    private String type;
    private int speedOfWind;

    public Weather() {
        this.temperature = 0;
        this.type = "Нема";
        this.speedOfWind = 0;
    }

    public Weather(final int temperature, final String type, final int speedOfWind) {
        this.temperature = temperature;
        this.type = type;
        this.speedOfWind = speedOfWind;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getType() {
        return type;
    }

    public int getSpeedOfWind() {
        return speedOfWind;
    }

    public void setTemperature(final int temperature) {
        this.temperature = temperature;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setSpeedOfWind(final int speedOfWind) {
        this.speedOfWind = speedOfWind;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Weather weather = (Weather) o;
        return temperature == weather.temperature && speedOfWind == weather.speedOfWind && Objects.equals(type, weather.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, type, speedOfWind);
    }

    @Override
    public String toString() {
        return  "Небодії: " + getType()  + '\n' +
                "Число на термометрі: " + getTemperature()       + '\n' +
                "Швидкість втрачених моментів (або вітру): " + getSpeedOfWind() + " м/с"+ '\n';
    }
}
