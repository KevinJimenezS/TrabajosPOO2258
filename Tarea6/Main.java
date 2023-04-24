package Tarea6;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("El area es: " + cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("El area del circulo: " + circulo.calcularArea());
        AlumnoDeportistaArtista ADA = new AlumnoDeportistaArtista();
        ADA.setNombre("Juan");
        ADA.setArte("Guitarra");
        ADA.setDesporte("Futboll");
        System.out.println(ADA);
        ADA.ensayar("OLEO");
        ADA.entrenar();
        ADA.presentarCom("CDMX SAN FELIPE");
    }


}
