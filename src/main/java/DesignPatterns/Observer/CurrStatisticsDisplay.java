package DesignPatterns.Observer;

public class CurrStatisticsDisplay implements Display , Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrStatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Current Statistics : ");
        System.out.println("Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
