/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
public abstract class WeatherAlert {
    public abstract void triggerAlert();
}

class StormAlert extends WeatherAlert {
    @Override
    public void triggerAlert() {
        System.out.println("Alert: Storm is coming!");
    }
}

class HeatwaveAlert extends WeatherAlert {
    @Override
    public void triggerAlert() {
        System.out.println("Alert: Heatwave is expected!");
    }
}

