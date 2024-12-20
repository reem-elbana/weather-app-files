/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
public abstract class WeatherData {
    public abstract void displayData();
}

class TemperatureData extends WeatherData {
    @Override
    public void displayData() {
        System.out.println("Temperature: 22°C");
    }
}

class HumidityData extends WeatherData {
    @Override
    public void displayData() {
        System.out.println("Humidity: 60%");
    }
}

class WindSpeedData extends WeatherData {
    @Override
    public void displayData() {
        System.out.println("Wind Speed: 15 km/h");
    }
}
