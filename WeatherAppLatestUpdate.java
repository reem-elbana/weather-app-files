/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weather.app.latest.update;

/**
 *
 * @author reeme
 */
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class WeatherAppLatestUpdate {

    public static void main(String[] args) {
        // Mock weather database
         // Database connection details
        // Database connection details
        final String DB_URL = "jdbc:mysql://localhost:3306/weather_data"; // Replace with your database name
        final String DB_USER = "root"; // Default XAMPP username
        final String DB_PASSWORD = ""; // Default XAMPP password (leave blank if no password)

        // GUI Setup
        JFrame frame = new JFrame("Weather Monitoring System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // Input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));

        // City input
        JLabel cityLabel = new JLabel("Enter City: ");
        JTextField cityField = new JTextField();

        inputPanel.add(cityLabel);
        inputPanel.add(cityField);

        // Result label
        JLabel resultLabel = new JLabel("Weather Data: ");

        // Button to fetch weather data
        JButton fetchButton = new JButton("Fetch Weather");
        fetchButton.addActionListener(e -> {
            String cityName = cityField.getText().trim();
            if (cityName.isEmpty()) {
                resultLabel.setText("Please enter a city name.");
                return;
            }

            // Connect to the database and fetch data
            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String query = "SELECT temperature, humidity, wind_speed FROM weather_data WHERE city = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, cityName);
                    ResultSet resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()) {
                        String temperature = resultSet.getString("temperature");
                        String humidity = resultSet.getString("humidity");
                        String windSpeed = resultSet.getString("wind_speed");
                        resultLabel.setText("Weather Data: Temperature=" + temperature + ", Humidity=" + humidity + ", Wind Speed=" + windSpeed);
                    } else {
                        resultLabel.setText("Weather Data: City not found.");
                    }
                }
            } catch (SQLException ex) {
                resultLabel.setText("Database error: " + ex.getMessage());
                ex.printStackTrace();
            }
        });

        // Add components to the frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(fetchButton, BorderLayout.CENTER);
        frame.add(resultLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
