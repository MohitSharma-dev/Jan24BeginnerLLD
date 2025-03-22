package DesignPatterns.Observer;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrStatisticsDisplay currStatisticsDisplay = new CurrStatisticsDisplay(weatherData);

        weatherData.setMeasurements(98.6f, 40.0f , 52);
        weatherData.setMeasurements(98.6f, 42.0f , 52);

        weatherData.removeObserver(currStatisticsDisplay);

        weatherData.setMeasurements(98.6f, 42.0f , 52.9f);

    }
}
