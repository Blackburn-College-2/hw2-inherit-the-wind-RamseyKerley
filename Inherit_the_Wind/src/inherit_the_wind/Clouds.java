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
public class Clouds {

    private String[] cloudLevel = new String[]{"none","Light", "Medium", "Heavy"};
    private String cLevel;
    
    public Clouds(int c){
        cLevel = cloudLevel[c];
    }
    
    
    
    @Override
    public String toString() {
        
        return "Clouds: " + cLevel;

    }
}
