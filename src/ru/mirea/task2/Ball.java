package ru.mirea.task2;

public class Ball {
    private int radius;
    private String color;

    public Ball(int radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return getRadius();
    }
    public void setRadius(){
        this.radius = radius;
    }
    public String getColor(){
        return getColor();
    }
    public void setColor(){
        this.color = color;
    }
    public String toString(){
        return "Radius: " + this.radius + ", Color: " + this.color;
    }
}