package ru.mirea.task2;
import ru.mirea.task2.Ball;
public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball(250, "blue");

        System.out.println(ball.getRadius());
        System.out.println(ball.toString());
    }
}
