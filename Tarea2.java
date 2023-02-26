import java.util.Scanner;
    public class Tarea2 {
        public static void main(String[] args) {

        int Num;
        boolean comparar = false;

        Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un Texto: ");
        String input = sc.nextLine();
            System.out.println("Tecleaste: " + input);
        Integer[] Numero = new Integer[input.length()];

        for (int i = 0; i < input.length() - 1 ; i++)
        {
            Numero[i] = (int)input.charAt(i);
            Num = Numero[i] + 1;
            if(Num == (int)input.charAt(i + 1))
            {
                comparar = true;
            }else{
                comparar = false;
            }
        }
        System.out.println("Tu secuensia es... " + comparar);
    }
}

