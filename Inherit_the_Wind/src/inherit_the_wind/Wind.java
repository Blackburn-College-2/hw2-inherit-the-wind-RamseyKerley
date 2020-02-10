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
public class Wind {
    
    private double speed;
    private String[] direction = new String[]{"North", "South"} ;
    public String chosenDirection;
    
    public Wind(double speed, int d){
        this.speed = speed;
        this.chosenDirection = direction[d];
    }
    
    
      @Override
    public String toString() {
          Measurement wind = new Measurement(speed, "km(s)");
        return "Wind: " + wind.toString() + chosenDirection;

    }
}
