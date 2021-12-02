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
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        
        //color = correct answer
        if(x <= 350){
            color = Color.red;
            answer = -1;
        }
        else{
            color = Color.green;
            answer = 1;
        }
    }
    
    public void setLocation(int x, int y){
        this.x =x;
        this.y = y;
        if(y <= 350){
            color = Color.red;
            answer = -1;
        }
        else{
            color = Color.green;
            answer = 1;
        }
    }
    
    public void guess(int guess){
          this.guess = guess;
    }
}
