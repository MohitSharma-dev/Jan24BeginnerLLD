package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void removeObserver(Observer o) {
        System.out.println("Observer removed");
        observers.remove(o);
    }

    @Override
    public void registerObserver(Observer o) {
        System.out.println("New Observer registered");
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        // do if something else is required to be done before notifying

        notifyObservers();
    }

    public void setMeasurements(Float temperature, Float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

// whenever a change happens : notifyObservers
