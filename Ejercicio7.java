/**
 * Ejercicio7
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al sistema");
        String texto = "Hola";
        ImprimirVariasVeces(texto, 4);
    }

    private static void ImprimirVariasVeces(String texto, int veces) {
        for (int j = 0; j < veces; j++) {
            System.out.println(texto);
        }
    }

}