/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_the_wind;

import java.util.Random;

/**
 *
 * @author ramsey.kerley
 */
public class Day {

    public Random rand = new Random();
    private double temp = rand.nextInt(35);
    private Clouds cloud = new Clouds(rand.nextInt(4));
    private Percipitation rain = new Percipitation("cm", rand.nextInt(10));
    private Snow snow = new Snow(rand.nextInt(10), "cm");
    private Wind wind = new Wind(rand.nextInt(15), rand.nextInt(2));

    public Day() {
        System.out.println("Morning temp: " + temp + " C");
        System.out.println(cloud.toString());
        if (cloud.cLevel.equals("none")) {
            this.temp = temp + 6;
        } else if (cloud.cLevel.equals("Light")) {
            this.temp = temp + 3;
        } else if (cloud.cLevel.equals("Medium")) {
            this.temp = temp - 3;
        } else {
            this.temp = temp - 14;
        }
        
        
        System.out.println("Midday temp: " + temp + " C");
        
        if (temp >= 0) {
          System.out.println(rain.toString() + " in rain");
        } else {
           System.out.println(snow.toString());
        }
        System.out.println(wind.toString());

    }

    /**
     * this gets the temp
     *
     * @return the temp value
     */
    public double getTemp() {
        return this.temp;
    }

    /**
     * this is use to set the temp to a different temp
     *
     * @param t
     * @return the new temperature
     */
    public double setTemp(int t) {
        this.temp = t;
        return this.temp;
    }

    @Override
    public String toString() {
        Measurement day = new Measurement(temp, " C");
        return day.toString();

    }
}
