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
    Visuals visuals = new Visuals();
    public Brain(){
        System.out.println("visuals");
        
        
       // Visuals visuals = new Visuals();
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Random.randomDouble(-1, 1);
           // System.out.println(weights[i]);
        }
    }
    
    public int process(int input1, int input2, int bias){
        //weighted sum
        double product = ((weights[0] * input1) + (weights[1] * input2))  ;
        //display information
        int input[] = {input1, input2};
        int output = activationFunction(product);
        visuals.drawValues(weights, product, input, output);
        
      //  product += weights[1] * input2;
     //   System.out.println(product);
        return(output);
        
    }
    
    public int activationFunction(double product){
         if(product > 0){
             return 1;
         }else{
             return -1;
         }
    }
    
    public boolean train(int answer, Point input){
        double error = answer - input.guess;
        System.out.println("Answer = " + answer);
        System.out.println("Guess = " + input.guess);
        System.out.println("error = " + error);
        double [] inputs = {
          input.x, input.y  
        };
       
             weights[0] += error * inputs[0];
            // System.out.println("Weight " + weights[0]);
            // System.out.println("Weight2 " + weights[1]);
              weights[1] += error * inputs[1];
        
           
        if(error == 0){
            return true;
        } else{
            return false;
        }
        
    }
    
    
}
