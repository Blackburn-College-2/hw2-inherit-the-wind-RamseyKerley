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
public class Percipitation extends Measurement {

    private double amount;

    Percipitation(String s, double amount) {
        super(amount, s);

    }

    @Override
    public String toString() {
        return "It percipitated this much: " + super.toString();

    }
}
