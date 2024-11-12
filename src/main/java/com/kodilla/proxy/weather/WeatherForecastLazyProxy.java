package com.kodilla.proxy.weather;

public class WeatherForecastLazyProxy implements WeatherI {
    private WeatherForecast realForecast;

    public String getWeather() throws InterruptedException {
        if (realForecast == null) {
            realForecast = new WeatherForecast();
        }
        return realForecast.getWeather();
    }

    public void refreshData() throws InterruptedException {
        if (realForecast == null) {
            realForecast = new WeatherForecast();
        }
        realForecast.refreshData();
    }
}
