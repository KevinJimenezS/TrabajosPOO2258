package TAREA4;

import java.awt.*;

public class PelotaDriver {

    public static void main(String[] args){
        Pelota ball = new Pelota("Void" , "Butilo" , "Fut 11" , Color.white , (byte) 5);
        System.out.println(ball);
        System.out.println(ball.rueda());
        System.out.println(ball.inflado());
        System.out.println(ball.juego());
    }
}

