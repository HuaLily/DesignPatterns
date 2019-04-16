package manual.Implement;

import manual.Interface.Display;
import manual.Interface.Observer;

public class StatisticsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    @Override
    public void display() {
        System.out.println("StatisticsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }
}
