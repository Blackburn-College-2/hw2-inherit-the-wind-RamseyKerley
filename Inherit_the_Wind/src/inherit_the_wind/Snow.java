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
public class Snow extends Percipitation {
    
   public Snow( double amount,String s){
       super(s, amount*10);
   }
    
    
     @Override
    public String toString() {
        return "It snowed this much: " + super.toString();

    }
    
    
}
