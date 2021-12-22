
package attempt2perceptron;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author j.head
 */
public class Random {
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
