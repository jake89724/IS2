
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
    public Visuals(){
       
        frame.setSize(600, 400);
        frame.setLocation(Problem.frame.getX() - frame.getWidth(), Problem.frame.getY() + 150);
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
        g.drawLine(50 + 75, 200 + 38, 250, 135 + 38);
        g.drawLine(250 + 75, 135 + 38, 450, 135 + 38);
        
       
        
        
        g.drawLine(0, 0, 00, 600); 
    }
}
