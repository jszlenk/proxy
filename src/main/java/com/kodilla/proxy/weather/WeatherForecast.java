package com.kodilla.proxy.weather;

public class WeatherForecast implements WeatherI {
    private String weather;

    public WeatherForecast() throws InterruptedException {
        refreshData();
    }

    public String getWeather() {
        return weather;
    }

    public void refreshData() throws InterruptedException {
        System.out.println("Refreshing weather data...");
        Thread.sleep(5000);
        weather = "Sunny, 25°C";
        System.out.println("Weather data refreshed.");
    }
}
