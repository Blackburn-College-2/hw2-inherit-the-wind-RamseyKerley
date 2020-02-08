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
    
    
    
    
    
    
    /**
     * this gets the temp 
     * @return the temp value 
     */
    public double getTemp(){
        return this.temp;
    }
    /**
     * this is use to set the temp to a different temp 
     * @param t
     * @return the new temperature
     */
    public double setTemp(int t){
        this.temp = t;
        return this.temp;
    }
    
    
      @Override
    public String toString() {
        return "(s)";

    }
}
