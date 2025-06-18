public class Model {
    private  int numero1;
    private int numero2;
    private int resultado;

    /**
     *
     * @param numero1
     * @param numero2
     * @param resultado
     * @return
     */
    public Datos obtenerDatos(int numero1, int numero2, int resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
        return new Datos(numero1, numero2, resultado);
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public static int SumarM(int numero1, int numero2, int resultado){
        Datos datos = new Datos(numero1, numero2,resultado);
        resultado = numero1 + numero2;
        return resultado;
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public static int RestarM(int numero1, int numero2, int resultado){
        Datos datos = new Datos(numero1, numero2,resultado);
        resultado = numero1 - numero2;
        return resultado;
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public static int MultiplicarM(int numero1, int numero2, int resultado){
        Datos datos = new Datos(numero1, numero2,resultado);
        int multplicacion = numero1 * numero2;
        return multplicacion;
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public static boolean DivisionM(int numero1, int numero2, int resultado) {
        Datos datos = new Datos(numero1, numero2,resultado);


        if (numero2 != 0){
            resultado = (numero1 / numero2);
            System.out.println(resultado);

        } else {
            System.out.println("No se puede dividir por 0");
            return false;
        }


        return true;
    }


}
