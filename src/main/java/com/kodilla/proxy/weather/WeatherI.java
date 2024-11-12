package com.kodilla.proxy.weather;

public interface WeatherI {
    String getWeather() throws InterruptedException;
    void refreshData() throws InterruptedException;
}
