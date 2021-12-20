
package perceptron;

/**
 * 
 * @author j.head
 */
public class Brain {
    public double[] weights = new double[2];
  ///  Visuals visuals = new Visuals();//
    /**
     * constructor method of perceptron. sets weights
     */
    public Brain(){
        System.out.println("visuals");
       // Visuals visuals = new Visuals();
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Random.randomDouble(-1, 1);
           // System.out.println(weights[i]);
        }
    }
    /**
     * puts the inputs through
     * @param input1 x pos
     * @param input2 y pos
     * @param bias discard for now 
     * @return the perceptron educated guess
     */
    public int process(int input1, int input2, int bias){
        //weighted sum
        double product = ((weights[0] * input1) + (weights[1] * input2));
        //display information
        int input[] = {input1, input2};
        int output = activationFunction(product);
     //   visuals.drawValues(weights, product, input, output);//
        return(output);
    }
    /**
     * activation function (sigmoid)
     * @param product the weighted sum
     * @return 1 or -1 if product > 0
     */
    public int activationFunction(double product){
         if(product > 0){
             return 1;
         }else{
             return -1;
         }
    }
    /**
     * trains the perceptron
     * @param answer the correct answer, 1 or -1
     * @param input what the perceptron guessed
     * @return pointless, true if right, false if wrong
     */
    public boolean train(int answer, Point input){
        int error = answer - input.guess;
        System.out.println("Answer = " + answer);
        System.out.println("Guess = " + input.guess);
        System.out.println("error = " + error);
        double [] inputs = {
          input.x, input.y  
        };
        //w = w (error*inputs) : supervised learning
        weights[0] += error * inputs[0];
        weights[1] += error * inputs[1];
        //unessasary
        if(error == 0){
            return true;
        } else{
            return false;
        }
        
    }
    
    
}
