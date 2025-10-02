
package parcial1;
import java.util.Scanner;
import java.util.Random;

public class Parcial1 {
    public static int sumaDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10; 
            numero /= 10;        
        }
        return suma;
    }

  
    public static int invertirNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + (numero % 10); 
            numero /= 10; 
        }
        return invertido;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Cantidad de numeros a validar: ");
        int cantidad = entrada.nextInt();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(99999 - 100 + 1) + 100;
        }

        System.out.print("Numeros generados: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(numeros[i]);
            if (i < cantidad - 1) {
                System.out.print(", "); 
            }
        }
        System.out.println();

    
        System.out.println("Resultados:");
        for (int num : numeros) {
            int suma = sumaDigitos(num);
            int invertido = invertirNumero(num);
 
            boolean condicion1 = (suma % 2 == 0);
            boolean condicion2 = (invertido % 3 == 0);

            if (condicion1 && condicion2) {
                System.out.println(num + " -> Si (suma=" + suma + " par, invertido=" + invertido + " divisible entre 3)");
            } else {
                System.out.println(num + " -> No (suma=" + suma + (condicion1 ? " par" : " impar") +
                        ", invertido=" + invertido + (condicion2 ? " divisible entre 3" : " no divisible entre 3") + ")");
            }
        }
    }
}

