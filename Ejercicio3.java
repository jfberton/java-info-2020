import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        scan.close();

        if (nota >= 93 && nota <= 100) {
            System.out.println("Excelente!");
        } else {
            if (nota >= 85 && nota <= 92) {
                System.out.println("Sobresaliente");
            } else {
                if (nota >= 75 && nota <= 84) {
                    System.out.println("Distinguido");
                } else {
                    if (nota >= 60 && nota <= 74) {
                        System.out.println("Aprobado");
                    } else {
                        System.out.println("Desaprobado");
                    }
                }
            }
        }
    }
}
