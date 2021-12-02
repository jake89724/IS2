
package perceptron;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author j.head
 */
public class Visuals extends JPanel  {
    //JPanel panel = new JPanel();
    Graphics g;
     JFrame frame = new JFrame("Perceptron");
     boolean value = false;
     double weight[];
     int input[];
     int output;
     double sum;
    public Visuals(){
       
        frame.setSize(600, 400);
        frame.setLocation(Problem.frame.getX() + frame.getWidth() + 100, Problem.frame.getY() + 150);
        frame.setVisible(true);
        frame.add(this);
        //System.out.println("here");
    }
    
    @Override
    public void paintComponent(Graphics g) {
        this.g = g;
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4));
        g2.setFont(new Font("Times New Roman", 12, 24)); 
        g2.drawString("X1", 75, 45);// top input x
        g2.drawString("X2", 75, 195);// top input x
        g2.drawString("Neuron", 250, 125); // over neuron
        g2.drawString("Output", 450, 125); // output text
        g.drawOval(50, 50, 75, 75); // top input
        g.drawOval(50, 200, 75, 75); // bottom input
        g.drawOval(250, 135, 75, 75); // neuron
        g.drawOval(450, 135, 75, 75); // output
        g2.setStroke(new BasicStroke(2));
        g.drawLine(50 + 75, 50 + 38, 250, 135 + 38); // top to N
        g.drawLine(50 + 75, 200 + 38, 250, 135 + 38); // bottom to n
        g.drawLine(250 + 75, 135 + 38, 450, 135 + 38); // n to o
        
        if(value){
            g2.setFont(new Font("Times New Roman", 12, 16));
            g2.drawString(weight[0] + "", 150, 90);//top weight
            g2.drawString(weight[1] + "", 150, 250);
            g2.drawString(sum + "", 260, 175);
            g2.drawString(input[0] + "", 75, 85);
            g2.drawString(input[1] + "", 75, 235);
            g2.drawString(output + "", 475, 175);
        }
        
        
      
    }
    
    
    
    public void drawValues(double weight[], double sum, int input[], int output){
        this.weight = weight;
        this.sum = sum;
        this.input = input;
        this.output = output;
        value = true;
        repaint();
    }
}
