/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perceptron;

import java.awt.Color;

/**
 *
 * @author j.head
 */
public class Point {
    Color color;
    int x;
    int y;
    int answer;
    int guess;
    Brain brain;
    public Point(int x, int y){
        brain = new Brain();
        this.x = x;
        this.y = y;
        
        //color = correct answer
        if(x <= 350){
            color = Color.blue;
            answer = -1;
        }
        else{
            color = Color.pink;
            answer = 1;
        }
    }
    
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
        if(x <= 350){
            color = Color.blue;
            answer = -1;
        }
        else{
            color = Color.pink;
            answer = 1;
        }
    }
    
    public void guess(int guess){
          this.guess = guess;
    }
}
