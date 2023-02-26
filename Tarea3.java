import java.util.Scanner;

public class Tarea3 {

    public static void main(String[] args) {
        int a= 0;

        Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la secuencia del GATO: ");
        String gato = sc.nextLine();
            char [] letra = new char[gato.length()];
        for(int i = 0; i < letra.length; i++){
            letra[i]= gato.charAt(i);
        }
        System.out.println("Escribiste: " + gato);
            System.out.println("------------------");
        for(int i = 1; i <= 3; i++){
            System.out.println("|" + letra[a] + letra[a + 1] + letra[a + 2] + "|");
            a = a + 3;
        }
        System.out.println("------------------");
    }
}
