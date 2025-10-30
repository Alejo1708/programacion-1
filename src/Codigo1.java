import java.util.Scanner;
import java.util.Arrays;

public class Codigo1 {

    public static String[] invertir(String[] arreglo) {
        String[] invertido = new String[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese la cantidad de elementos del arreglo: ");
            int cantidad = entrada.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser un numero positivo mayor que cero.");
                return;
            }

            String[] arreglo = new String[cantidad];
            entrada.nextLine(); 

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingrese el elemento #" + (i + 1) + ": ");
                arreglo[i] = entrada.nextLine();
            }

            System.out.println("\nArreglo original: " + Arrays.toString(arreglo));
            String[] invertido = invertir(arreglo);
            System.out.println("Arreglo invertido: " + Arrays.toString(invertido));

        } catch (Exception e) {
            System.out.println("Error: ingrese un valor valido.");
        }
    }
}
