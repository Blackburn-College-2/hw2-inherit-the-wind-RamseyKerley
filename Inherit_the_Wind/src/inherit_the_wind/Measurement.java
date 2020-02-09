/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_the_wind;

/**
 *
 * @author ramsey.kerley
 */
public class Measurement {

    private double value;
    private String unit;

    public Measurement(double i, String s) {
        value = i;
        unit = s;

    }

    @Override
    public String toString() {
        return Math.floor(value) + " " + unit;

    }

}
