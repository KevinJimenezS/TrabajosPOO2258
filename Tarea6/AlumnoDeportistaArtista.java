package Tarea6;

public class AlumnoDeportistaArtista extends Alumno implements Deportista, Artista{
    private int idActExtra;
    private String Desporte;
    private String Arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numeroCU, String carrera, double promedio, int idActExtra, String desporte, String arte) {
        super(nombre, edad, numeroCU, carrera, promedio);
        this.idActExtra = idActExtra;
        Desporte = desporte;
        Arte = arte;
    }

    public int getIdActExtra() {
        return idActExtra;
    }

    public void setIdActExtra(int idActExtra) {
        this.idActExtra = idActExtra;
    }

    public String getDesporte() {
        return Desporte;
    }

    public void setDesporte(String desporte) {
        Desporte = desporte;
    }

    public String getArte() {
        return Arte;
    }

    public void setArte(String arte) {
        Arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "idActExtra=" + idActExtra +
                ", Desporte='" + Desporte + '\'' +
                ", Arte='" + Arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String disciplina) {
        System.out.println("El alumno esta ensayando " + this.Arte);
        return 2;
    }

    @Override
    public boolean PresentarObra() {
        System.out.println(getNombre()+" Esta presentando su obra");
        return true;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre()+" Esta entrenando el deporte "+ this.Desporte);
        return 2;
    }

    @Override
    public boolean presentarCom(String ubicacion) {
        System.out.println(getNombre()+" Esta en competencia del deporte "+ Desporte);
        return false;
    }
}
