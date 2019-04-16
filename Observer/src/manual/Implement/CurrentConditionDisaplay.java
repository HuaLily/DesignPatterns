package manual.Implement;

import manual.Interface.Display;
import manual.Interface.Observer;

public class CurrentConditionDisaplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    WeatherData weatherData;

    public CurrentConditionDisaplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisaplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}' );
    }
}
