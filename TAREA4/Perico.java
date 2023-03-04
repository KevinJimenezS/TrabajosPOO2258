package TAREA4;

import java.awt.*;

public class Perico {

    private String Nombre;
    private String Especie;
    private String Sexo;
    private Color Color;
    private byte Edad;

    public Perico() {
    }


    public Perico(String nombre, String especie, String sexo, Color color, byte edad) {
        Nombre = nombre;
        Especie = especie;
        Sexo = sexo;
        Color = color;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String setSexo() {
        return Sexo;
    }

    public void setTamanio(String sexo) {
        Sexo = sexo;
    }

    public java.awt.Color getColor() {
        return Color;
    }

    public void setColor(java.awt.Color color) {
        Color = color;
    }

    public byte getEdad() {
        return Edad;
    }

    public void setEdad(byte edad) {
        this.Edad = edad;
    }

    @Override
    public String toString() {
        return "PERICO" + "\n" +
                "Nombre='" + Nombre + '\'' +  "\n" +
                "Especie= '" + Especie + '\'' +  "\n" +
                "Sexo= " + Sexo + "\n" +
                "Color= " + Color +  "\n" +
                "Edad= " + Edad + " Años" + "\n";

    }
    public boolean vuela() {
        System.out.println(Nombre + " Esta volando??");
    boolean resultado = Math.random() > 0.51;
    return resultado;
    }
    public boolean hablar(){
        System.out.println(Nombre + " Esta hablando??");
        boolean resultado1 = Math.random() > 0.51;
        return resultado1;
    }
    public String comer() {
        System.out.println(Nombre + " Que comio??");

        if (Math.random() > 0.51) {
            System.out.println("Comio Alpiste");

        } else {
            System.out.println("creo que comio Fruta");


        }

        return ("");
    }
}

