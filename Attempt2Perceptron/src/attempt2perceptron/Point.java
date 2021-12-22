/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attempt2perceptron;

/**
 *
 * @author j.head
 */
public class Point {
    int x;
    int y;
    int answer;
    int guess;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        answer = -1;
        if(x > 400) answer = 1;
    }
    public void setLocation(int x, int y){
        System.out.println("set Location");
        this.x = x;
        this.y = y;
        answer = -1;
        if(x > 400) answer = 1;
    }
    public void guess(int guess){
        this.guess = guess;
    }
}
