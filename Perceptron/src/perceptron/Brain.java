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
    
    
}
