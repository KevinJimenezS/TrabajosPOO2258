package Tarea7;

public class Motocicleta implements Vehiculo{
    private int centimetrosCub;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimetrosCub, String marca) {
        this.centimetrosCub = centimetrosCub;
        this.marca = marca;
    }

    public int getCentimetrosCub() {
        return centimetrosCub;
    }

    public void setCentimetrosCub(int centimetrosCub) {
        this.centimetrosCub = centimetrosCub;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimetrosCub=" + centimetrosCub +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void Caballito(){
        System.out.println("Haciendo caballito para ser pro jaja");

    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la poderosa " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la poderosa " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la poderosa de "+ this.centimetrosCub+ " CC");

    }

    @Override
    public void frenar(){
        System.out.println("Frenando con la poderosa de "+ this.centimetrosCub+ " CC");

    }
}
