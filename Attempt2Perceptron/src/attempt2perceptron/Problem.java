/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attempt2perceptron;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author j.head
 */
public class Problem extends JPanel implements KeyListener{
    JFrame frame = new JFrame("Perceptron");
    Graphics g;
    Point [] points = new Point[100];;
    public Perceptron perceptron;
    public Problem(){
        perceptron = new Perceptron();
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener(this);
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(Random.random(0, 800), Random.random(0, 800));
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        this.g = g;
        super.paintComponent(g);
        g.drawLine(400, 0, 400, 800);

        for(Point point: points){
            int inputs[] = {
              point.x, point.y  
            };
            point.guess(perceptron.guess(inputs));
            if(point.guess == 1){
                g.setColor(Color.red);
            }
            else{
                g.setColor(Color.green);
            }
            g.fillOval(point.x, point.y, 10, 10);
        }
        
        
        for (Point point: points) {
            int inputs[] = {
              point.x, point.y
            };
            perceptron.train(point, inputs );
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("pressed");
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
