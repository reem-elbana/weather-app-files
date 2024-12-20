/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
public class WeatherAlertFactory {
    public static WeatherAlert createWeatherAlert(String alertType) {
        switch (alertType) {
            case "Storm":
                return new StormAlert();
            case "Heatwave":
                return new HeatwaveAlert();
            default:
                return null;
        }
    }
}

