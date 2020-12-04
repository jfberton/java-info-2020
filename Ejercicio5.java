import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();
        for (int i = 0; i <= 9; i++) {
            System.out.println(numero + " x " + (i + 1) + " = " + numero * (i + 1));
        }
    }
}
