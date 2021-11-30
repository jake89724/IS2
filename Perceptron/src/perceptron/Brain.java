/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perceptron;

/**
 *
 * @author j.head
 */
public class Brain {
    //error = answer - guess
    //weight = weight + (error*input)
    
    
    public double[] weights = new double[2];
    
    public Brain(){
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Random.randomDouble(-1, 1);
            System.out.println(weights[i]);
        }
    }
    
    public int process(int input1, int input2){
        //weighted sum
        double product = weights[0] * input1;
        product += weights[1] * input2;
     //   System.out.println(product);
        if(product >= 0){
            return 1;
        }
        return -1;
    }
    
    public void train(int answer, int guess, Point input){
        double error = answer - guess;
        System.out.println("Answer = " + answer);
        System.out.println("Guess = " + guess);
        System.out.println("error = " + error);
        double [] inputs = {
          input.x, input.y  
        };
    
             weights[0] += error * guess * 0.1;
             System.out.println("Weight " + weights[0]);
            weights[1] += error * input.y * 0.1;
        
           
        
        
    }
    
    
}
