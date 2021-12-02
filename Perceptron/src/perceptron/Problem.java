/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perceptron;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author j.head
 */
public class Problem extends JPanel implements KeyListener{
    
    Brain brain;
    Graphics g;
    public static int counter;
    public static JFrame frame = new JFrame();
    public static Point[] points = new Point[100];
    public Problem(){
        System.out.println("problem");
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(Random.random(0, 700), Random.random(0, 700));
        }
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        Dimension size = Toolkit. getDefaultToolkit(). getScreenSize();
        
        frame.setLocation((int)size.getWidth()/2 - frame.getWidth(), (int)size.getHeight()/2 - frame.getHeight()/2);
        
        frame.setVisible(true);
        frame.add(this);
        frame.addKeyListener(this);
        brain = new Brain();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        this.g = g;
        super.paintComponent(g);
        g.drawLine(350, 0, 350, 700);
        g.drawLine(0, 0, 730, 700);
        //main loop through all points
        for (int i = 0; i < points.length; i++) {
            
            int guess = brain.process(points[i].x, points[i].y, 2);
            if(guess == 1){
                g.setColor(Color.red);
            }
            else{
                g.setColor(Color.green);
            }
            points[i].guess(guess);
            
            //train /////////////////////////////////////////////////////////
           // double error = points[i].answer - guess;
            //brain.train(points[i].answer, guess, points[i]);
           // error = points[i].x * error;
            
           // g.setColor(points[i].color);
            //g.setColor(points[i].color);
            if(points[i].answer == 1){
                if(points[i].x >= 350){
              //  g.setColor(Color.DARK_GRAY);
            }
                
            } else{
                 if(points[i].x < 350){
                   //  g.setColor(Color.black);
                 }
            }
            
            g.fillOval(points[i].x, points[i].y, 10, 10);
        }
        
        
        
             for(Point point: points){
            //guess inside if point
             boolean right = brain.train(point.answer, point);
             System.out.println("Train");
             
             if(!right){
                 counter++;
                // point.color = Color.BLACK;
                 g.setColor(Color.black);
                 g.fillOval(point.x, point.y, 10, 10);
                 
             }
        }
        
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("typed");
        for(Point point: points){
            //guess inside if point
             boolean right = brain.train(point.answer, point);
             
             System.out.println("Train");
             
             if(!right){
                 counter++;
                // point.color = Color.BLACK;
                 g.setColor(Color.black);
                 g.fillOval(point.x, point.y, 10, 10);
                 
             }
             int guess = brain.process(point.x, point.y, 2);
             point.guess(guess);
             
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    

    
    
}
