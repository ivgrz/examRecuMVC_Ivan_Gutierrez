public class Datos {
    /**
     * Recopilacion de todos los datos que se usaran en el programa
     */
    private int numero1;
    private int numero2;
    private int resultado;


    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public Datos(int numero1, int numero2, int resultado) {
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
