/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perceptron;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author j.head
 */
public class Problem extends JPanel{
    Brain brain = new Brain();
    Graphics g;
    public static Point[] points = new Point[100];
    public Problem(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(this);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        this.g = g;
        super.paintComponent(g);
        g.drawLine(350, 0, 350, 700);
        //main loop through all points
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(Random.random(0, 700), Random.random(0, 700));
            int answer = brain.process(points[i].x, points[i].y);
            if(answer == 1){
                g.setColor(Color.red);
            }
            else{
                g.setColor(Color.green);
            }
            //g.setColor(points[i].color);
            g.fillOval(points[i].x, points[i].y, 10, 10);
        }
        
    }
    

    
    
}
