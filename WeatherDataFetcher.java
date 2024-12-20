/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
public class WeatherDataFetcher {
    private static WeatherDataFetcher instance;

    private WeatherDataFetcher() {
        // Private constructor to prevent instantiation
    }

    public static WeatherDataFetcher getInstance() {
        if (instance == null) {
            instance = new WeatherDataFetcher();
        }
        return instance;
    }

    public String fetchWeatherData() {
        // Simulated external API call
        return "Weather Data: 22°C, 60% humidity, 15 km/h wind speed";
    }
}

