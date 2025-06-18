public class Controller {
    /**
     *
     * @param numero1
     * @param numero2
     * @param resultado
     * @return
     */
    public static Datos obtenerDatosC(int numero1, int numero2, int resultado) {
        Datos datos = new Datos(numero1, numero2, resultado);
        Model model = new Model();
        return datos = model.obtenerDatos(numero1, numero2, resultado);


    }

    /**
     * Funcion para sumar valores
     * @param numero1
     * @param numero2
     * @param resultado
     * @return
     */

    public static int SumarC(int numero1, int numero2, int resultado){
        return Model.SumarM(numero1, numero2, resultado);
    }

    /**
     * Funcion para restar valores
     * @param numero1
     * @param numero2
     * @param resultado
     * @return
     */
    public static  int RestarC(int numero1, int numero2, int resultado){
        return Model.RestarM(numero1, numero2, resultado);
    }

    /**
     * Funcion para multiplicar valores
     * @param numero1
     * @param numero2
     * @param resultado
     * @return
     */
    public static int MultiplicarC(int numero1, int numero2, int resultado){
        return Model.MultiplicarM(numero1, numero2, resultado);
    }

    /**
     * Funcion para dividir valores
     * @param numero1
     * @param numero2
     * @param resultado
     * @return
     */
    public static boolean DivisionC(int numero1, int numero2, int resultado){
        return Model.DivisionM(numero1, numero2, resultado);
    }

}
