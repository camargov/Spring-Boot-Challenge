package com.example.restservice;

/* This class represents the weather for a certain zipcode. 
 * The weather information that is tracked includes daily highs
 * and lows, humidity, and wind for the next 14 days.
 */
public class Weather {
    private final String zipcode;
    private final double[] dailyHighs;
    private final double[] dailyLows;
    private final double[] humidity;
    private final int[] wind;

    /* Constructs a weather class with the given parameters.
     * 
     * @param zipcode       The zipcode of the area whose weather information is being tracked.
     * @param dailyHighs    The daily high temperatures (in fahrenheit) for the next 14 days.
     * @param dailyLows     The daily low temperatures (in fahrenheit) for the next 14 days.
     * @param humidity      The humidity (percentage) for the next 14 days.
     * @param wind          The wind speed (in mph) for the next 14 days.
     */
    public Weather(String zipcode, double[] dailyHighs, double[] dailyLows, double[] humidity, int[] wind) {
        this.zipcode = zipcode;
        this.dailyHighs = dailyHighs;
        this.dailyLows = dailyLows;
        this.humidity = humidity;
        this.wind = wind;
    }

    /* Constructs a weather class with the given zipcode and default parameters. */
    public Weather(String zipcode) {
        this.zipcode = zipcode;
        this.dailyHighs = new double[]{71.2, 73.4, 72.3, 75.0, 73.2, 71.1, 75.3, 73.4, 71.8, 70.4, 73.7, 71.5, 71.4, 73.2};
        this.dailyLows = new double[]{41.2, 43.4, 42.3, 55.0, 43.2, 41.1, 55.3, 33.4, 41.8, 30.4, 33.7, 41.5, 41.4, 43.2};
        this.humidity = new double[]{66.05, 66.05, 66.05, 70.74, 70.74, 70.74, 70.74, 70.68, 70.8, 70.4, 68.1, 68.5, 71.4, 70.2};
        this.wind = new int[]{9, 9, 7, 7, 7, 9, 9, 9, 10, 10, 9, 8, 9, 8};
    }

    /* Returns this zipcode */
    public String getZipcode() {
        return this.zipcode;
    }

    /* Returns this list of daily high temperatures */
    public double[] getDailyHighs() {
        // To return a copy of the given list of daily high temperatures
        double[] temp = {};
        for (int i = 0; i < this.dailyHighs.length; i++) {
            temp[i] = this.dailyHighs[i];
        }
        return temp;
    }

    /* Returns this list of daily low temperatures */
    public double[] getDailyLows() {
        // To return a copy of the given list of daily low temperatures
        double[] temp = {};
        for (int i = 0; i < this.dailyLows.length; i++) {
            temp[i] = this.dailyLows[i];
        }
        return temp;
    }

    /* Returns this list of humidity percentages */
    public double[] getHumidity() {
        // To return a copy of the given list of humidity percentages
        double[] temp = {};
        for (int i = 0; i < this.humidity.length; i++) {
            temp[i] = this.humidity[i];
        }
        return temp;
    }

    /* Returns this list of windspeed */
    public int[] getWind() {
        // To return a copy of the given list of daily high temperatures
        int[] temp = {};
        for (int i = 0; i < this.wind.length; i++) {
            temp[i] = this.wind[i];
        }
        return temp;
    }
    
}
