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
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        
        //color = correct answer
        if(x <= 350){
            color = Color.red;
        }
        else{
            color = Color.green;
        }
    }
}
