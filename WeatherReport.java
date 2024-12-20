/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
public class WeatherReport {
    private String temperature;
    private String humidity;
    private String windSpeed;

    private WeatherReport(Builder builder) {
        this.temperature = builder.temperature;
        this.humidity = builder.humidity;
        this.windSpeed = builder.windSpeed;
    }

    public static class Builder {
        private String temperature;
        private String humidity;
        private String windSpeed;

        public Builder setTemperature(String temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder setHumidity(String humidity) {
            this.humidity = humidity;
            return this;
        }

        public Builder setWindSpeed(String windSpeed) {
            this.windSpeed = windSpeed;
            return this;
        }

        public WeatherReport build() {
            return new WeatherReport(this);
        }
    }

    @Override
    public String toString() {
        return "Weather Report: Temperature=" + temperature + ", Humidity=" + humidity + ", Wind Speed=" + windSpeed;
    }
}

