package manual;

import manual.Implement.CurrentConditionDisaplay;
import manual.Implement.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisaplay currentConditionDisaplay= new CurrentConditionDisaplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
