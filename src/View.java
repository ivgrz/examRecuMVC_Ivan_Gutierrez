import java.util.Scanner;

public class View {
    Model model = new Model();


    public static void menu(){
        int opcion = 0;
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);

    do {
        System.out.println("Elige una operacion:");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        opcion = sc.nextInt();



        switch (opcion){
            case 1:
                System.out.println("Introduce el primer sumando:");
                numero1 = sc.nextInt();
                System.out.println("Introduce el segundo sumando:");
                numero2 = sc.nextInt();
                int resultadoS= Controller.SumarC(numero1, numero2, resultado );
                System.out.println(resultadoS);
                break;

            case 2:
                System.out.println("Introduce el minuendo:");
                numero1 = sc.nextInt();
                System.out.println("Introduce el sustraendo:");
                numero2 = sc.nextInt();
                int resultadoR = Controller.RestarC(numero1, numero2, resultado);
                System.out.println(resultadoR);
                break;
            case 3:
                System.out.println("Introduce el primer factor:");
                numero1 = sc.nextInt();
                System.out.println("Introduce el segundo factor:");
                numero2 = sc.nextInt();
                int Multiplicacion = Controller.MultiplicarC(numero1, numero2, resultado);
                System.out.println(Multiplicacion);
                break;
            case 4:
                System.out.println("Introducer el divisor:");
                numero1 = sc.nextInt();
                System.out.println("Introduce el dividendo: ");
                numero2 = sc.nextInt();
                boolean division = Controller.DivisionC(numero1, numero2, resultado);
                System.out.println(division);
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Introduce numero valido");


        }

    } while (opcion != 5);

        System.out.println("Saliendo del programa...");
        sc.close();

    }
}
