/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
public class UserPreferencesManager {
    private static UserPreferencesManager instance;
    private String temperatureUnit = "Celsius";  // Default
    private String speedUnit = "km/h";          // Default

    private UserPreferencesManager() {}

    public static UserPreferencesManager getInstance() {
        if (instance == null) {
            instance = new UserPreferencesManager();
        }
        return instance;
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(String unit) {
        this.temperatureUnit = unit;
    }

    public String getSpeedUnit() {
        return speedUnit;
    }

    public void setSpeedUnit(String unit) {
        this.speedUnit = unit;
    }
}

