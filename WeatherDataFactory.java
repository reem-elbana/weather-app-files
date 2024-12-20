/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
public class WeatherDataFactory {
    public static WeatherData createWeatherData(String type) {
        switch (type) {
            case "Temperature":
                return new TemperatureData();
            case "Humidity":
                return new HumidityData();
            case "WindSpeed":
                return new WindSpeedData();
            default:
                return null;
        }
    }
}
