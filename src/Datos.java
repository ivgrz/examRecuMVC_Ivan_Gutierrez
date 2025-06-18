public class Datos {
    private int numero1;
    private int numero2;
    private int resultado;


    public Datos(int numero1, int numero2,int resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;

    }

    @Override
    public String toString() {
        return "Datos{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                ",resultado=" + resultado +
                '}';
    }
}
