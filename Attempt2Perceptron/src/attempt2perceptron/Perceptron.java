/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attempt2perceptron;

/**
 *
 * @author j.head
 */
public class Perceptron {
    double weights[] = new double[2];
    public Perceptron(){
        // fill weights with random values
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Random.randomDouble(-1, 1);
        }
        System.out.println("Perceptron");
    }
    
    public int guess(int inputs[]){
        //weighted sum
        double number = 0;
        for (int i = 0; i < inputs.length; i++) {
            number += weights[i] * inputs[i];
        }
        return sign(number);
        
    }

    private int sign(double number) {
        if(number > 0) return 1;
        return -1;
    }
    
    public void train(Point point, int inputs[]){
        //supervised learning
        //answer - error
        int error = point.answer - point.guess;
        for (int i = 0; i < weights.length; i++) {
            weights[i] += error * inputs[i];
        }
    }
}
