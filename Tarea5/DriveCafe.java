package Tarea5;

public class DriveCafe {
    public static void main(String[] args) {
        boolean Recursos = true;

        System.out.println("");
        System.out.println("Ciclo Continuo De Servicios");
        System.out.println("");
        MaquinaCafe CafeMaq = new MaquinaCafe();
        System.out.println(CafeMaq);
        System.out.println("");

        while (Recursos){
            CafeMaq.prepararAmericano();
            CafeMaq.prepararExpreso();
            CafeMaq.prepararCapuchino();
            CafeMaq.recursos();
            Recursos = (CafeMaq.getAguaMl() >= 100 && CafeMaq.getCafeGr() >= 15 && CafeMaq.getCremaMl() >= 70 && CafeMaq.getVasosP() >= 1);
        }
        System.out.println("NO HAY RECURSOS PARA UN CAFE");
    }
}