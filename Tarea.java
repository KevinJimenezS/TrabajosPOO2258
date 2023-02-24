//JIMENEZ SALUD KEVIN 2258
//PROGRAMACION ORIENTADA A OBJETOS


import java.util.Scanner;

public class Tarea {

    public static void main(String[]args) {
        System.out.println(" Escribe un Nombre, Tu Profesión y Nacionalidad: ");
        Scanner teclado = new Scanner(System.in);
        String carrera = teclado.nextLine();
        System.out.println("---------------------------------------");

        String[] separado = carrera.trim().split(" ");
        System.out.println("----------- Separado -------------");
        for (int i = 0; i < separado.length; i++) {
            if (i == 0) {
                System.out.println("Nombre: " + separado[i]);
            }
            if (i == 1) {
                System.out.println("Profesion: " + separado[i]);
            }
            if (i == 2) {
                System.out.println("Nacionalidad: " + separado[i]);
            }

        }


    }
}
