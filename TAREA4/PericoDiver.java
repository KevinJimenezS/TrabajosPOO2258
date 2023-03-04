package TAREA4;

import TAREA4.Perico;

import java.awt.*;

public class PericoDiver {

    public static void main(String[] args){
        Perico parakeet = new Perico("Camilo" , "Serrana Occidental" , "Masculino" , Color.green , (byte) 2);
        System.out.println(parakeet);
        System.out.println(parakeet.vuela());
        System.out.println(parakeet.hablar());
        System.out.println(parakeet.comer());
    }
}
