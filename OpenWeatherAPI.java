/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
public class OpenWeatherAPI implements WeatherAPI {
    @Override
    public String getWeather() {
        return "Weather from OpenWeather API: 22°C";
    }
}

