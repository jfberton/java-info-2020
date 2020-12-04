import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        while (continuar == 1) {
            System.out.println("Ingrese un entero para imprimirlo:");
            int valor = scan.nextInt();
            System.out.println("El valor ingresado fue:" + valor);

            System.out.println("Desea continuar?, Ingrese 1 para contiuar");
            continuar = scan.nextInt();
        }

        System.out.println("Hasta luego ...");
        scan.close();
    }
}
