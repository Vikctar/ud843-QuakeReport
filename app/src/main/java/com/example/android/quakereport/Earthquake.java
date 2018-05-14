package com.example.android.quakereport;

public class Earthquake {

    /**
     * Earthquake magnitude
     */
    private String magnitude;

    /**
     * City in which the earthquake was felt
     */
    private String city;

    /**
     * Date the earthquake was recorded
     */
    private String date;


    /**
     * Create a new Earthquake object
     *
     * @param magnitude of the earthquake
     * @param city      where the earthquake occurred
     * @param date      when the earthquake was recorded
     */
    public Earthquake(String magnitude, String city, String date) {
        this.magnitude = magnitude;
        this.city = city;
        this.date = date;
    }

    /**
     * Get the magnitude
     *
     * @return magnitude
     */
    public String getMagnitude() {
        return magnitude;
    }

    /**
     * Get the city
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Get date
     *
     * @return date
     */
    public String getDate() {
        return date;
    }
}
