/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perceptron;

import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author j.head
 */
public class Random {
      /**
     * generates a random number
     * @param low the low number
     * @param high the high number
     * @return int between low and high
     */
    public static int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double number = (H - L + 1) * seed + L;
        return (int) number;
    }
    public static double randomDouble(double low, double high){
        double random = ThreadLocalRandom.current().nextDouble(low, high);
        return random;
    }
   
}
