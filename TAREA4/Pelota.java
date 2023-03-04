package TAREA4;

import java.awt.*;

public class Pelota {

        private String Marca;
        private String Material;
        private String Tipo;
        private java.awt.Color Color;
        private byte Tamaño;

        public Pelota() {
        }

    public Pelota(String marca, String material, String tipo, java.awt.Color color, byte tamaño) {
        Marca = marca;
        Material = material;
        Tipo = tipo;
        Color = color;
        Tamaño = tamaño;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public java.awt.Color getColor() {
        return Color;
    }

    public void setColor(java.awt.Color color) {
        Color = color;
    }

    public byte getTamaño() {
        return Tamaño;
    }

    public void setTamaño(byte tamaño) {
        Tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "PELOTA" + "\n" +
                "Marca='" + Marca + '\n' +
                "Material='" + Material + '\n' +
                "Tipo='" + Tipo + '\n' +
                "Color=" + Color + "\n" +
                "Tamaño= Numero " + Tamaño + "\n";

    }



        public boolean rueda() {
            System.out.println("El balon "+Marca + " Esta rodando??");
            boolean resultado = Math.random() > 0.51;
            return resultado;
        }
        public boolean inflado(){
            System.out.println("El balon " + Marca + " Esta inflado??");
            boolean resultado1 = Math.random() > 0.51;
            return resultado1;
        }
        public String juego() {
            System.out.println("El balon de " + Marca + " Se uso para jugar??");

            if (Math.random() > 0.51) {
                System.out.println("No se uso");

            } else {
                System.out.println("Si se habia usado");


            }

            return ("");
        }
    }



