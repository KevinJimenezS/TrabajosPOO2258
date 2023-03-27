package Tarea5;

public class MaquinaCafe{
    private int AguaMl;
    private int CafeGr;
    private int CremaMl;
    private int VasosP;

    public MaquinaCafe() {
        this.AguaMl = 5000;
        this.CafeGr = 1000;
        this.CremaMl = 1500;
        this.VasosP = 50;
    }

    public MaquinaCafe(int agua, int cafe, int crema, int vasos) {
        this.AguaMl = agua;
        this.CafeGr = cafe;
        this.CremaMl = crema;
        this.VasosP = vasos;
    }

    public int getAguaMl() {
        return AguaMl;
    }

    public void setAguaMl(int agua) {
            this.AguaMl = agua;
    }

    public int getCafeGr() {
        return CafeGr;
    }

    public void setCafeGr(int cafe) {
            this.CafeGr = cafe;
    }

    public int getCremaMl() {
        return CremaMl;
    }

    public void setCremaMl(int crema) {
            this.CremaMl = crema;
    }

    public int getVasosP() {
        return VasosP;
    }

    public void setVasosP(int vasos) {
        this.VasosP = vasos;
    }
    @Override
    public String toString() {
        return "MaquinaDeCafe: " +
                "Agua= " + AguaMl + " ML" +
                ", Cafe= " + CafeGr + " GR" +
                ", Crema= " + CremaMl + " ML" +
                ", Vasos= " + VasosP + " Porciones";
    }
    public void prepararAmericano(){
        if (this.AguaMl >= 180 && this.CafeGr >= 15 && this.VasosP >= 1) {
            this.AguaMl -= 180;
            this.CafeGr -= 15;
            this.VasosP --;
            System.out.println("Sirviendo Americano...");
        } else {
            System.out.println("YA NO HAY CAFE americano");
        }
    }
    public void prepararExpreso(){
        if (this.AguaMl >= 120 && this.CafeGr >= 20 && this.VasosP >= 1) {
            this.AguaMl -= 120;
            this.CafeGr -= 20;
            this.VasosP --;
            System.out.println("Sirviendo Expreso...");
        } else {
            System.out.println("YA NO HAY CAFE EXPRESO");
        }
    }
    public void prepararCapuchino(){
        if (this.AguaMl >= 100 && this.CafeGr >= 14 && this.CremaMl >= 70 && this.VasosP >= 1) {
            this.AguaMl -= 180;
            this.CafeGr -= 14;
            this.CremaMl-= 70;
            this.VasosP --;
            System.out.println("Sirviendo Capuchino...");
            System.out.println("");
        } else {
            System.out.println("YA NO HAY CAFE CAPUCHINO");
            System.out.println("");
        }
    }
    public void recursos(){
        System.out.println("Cantidad de recursos actuales: ");
        System.out.println("Cantidad de Agua: " + this.AguaMl + " ML");
        System.out.println("Cantidad de Cafe: " + this.CafeGr + " GR");
        System.out.println("Cantidad de Crema: " + this.CremaMl + " ML");
        System.out.println("Cantidad de Vasos: " + this.VasosP + " Porciones");
        System.out.println("---------------------------------");
    }
}