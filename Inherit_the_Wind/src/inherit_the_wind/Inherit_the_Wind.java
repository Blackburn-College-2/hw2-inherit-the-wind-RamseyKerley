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
public class Inherit_the_Wind {

    /**
     * 12 hours is the estimate
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Percipitation p = new Percipitation("cm(s)", 10);
        //Random rand = new Random();
        //System.out.println(rand.nextInt(2));
        System.out.println("Welcome to Weather-Tron. Here's your report: ");
        for(int i = 1 ; i <= 10; i++){
            System.out.println("Day " + i + " :");
            Day day = new Day(); 
        }
       
    }

}
