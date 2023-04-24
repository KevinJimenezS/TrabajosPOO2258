package Tarea6;

public class Alumno extends Personal{
    private int numeroCU;
    private String carrera;
    private double promedio;

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    public Alumno(String nombre, int edad, int numeroCU, String carrera, double promedio) {
        super(nombre, edad);
        this.numeroCU = numeroCU;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumeroCU() {
        return numeroCU;
    }

    public void setNumeroCU(int numeroCU) {
        this.numeroCU = numeroCU;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numeroCU=" + numeroCU +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
