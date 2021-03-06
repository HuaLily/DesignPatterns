package manual.Implement;

import manual.Interface.Observer;
import manual.Interface.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    @Override
    public void notifyObservers() {
        for ( Observer obs : observers){
            obs.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        measurementChanged();
    }

    private void measurementChanged() {
        notifyObservers();
    }
}
