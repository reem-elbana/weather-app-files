/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
public class WeatherDataProxy implements WeatherDataService {
    private WeatherDataServiceImpl weatherService;
    private String cachedData;

    public WeatherDataProxy() {
        this.weatherService = new WeatherDataServiceImpl();
    }

    @Override
    public String getWeather() {
        if (cachedData == null) {
            cachedData = weatherService.getWeather();
        }
        return cachedData;
    }
}

