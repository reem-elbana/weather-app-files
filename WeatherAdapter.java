/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
public class WeatherAdapter implements WeatherAPI {
    private WeatherDataFetcher fetcher;

    public WeatherAdapter(WeatherDataFetcher fetcher) {
        this.fetcher = fetcher;
    }

    @Override
    public String getWeather() {
        return fetcher.fetchWeatherData();
    }
}

