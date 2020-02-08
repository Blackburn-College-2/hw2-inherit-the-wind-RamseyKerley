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
    
    public Random rand =  new Random();
    private double temp = rand.nextInt(35) + 1;
    
    
    
    
      @Override
    public String toString() {
        return "(s)";

    }
}
