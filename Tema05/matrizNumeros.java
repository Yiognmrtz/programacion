 import java.util.Scanner;

public class matrizNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int filas;
        int columnas;

        System.out.println("Introduce el número de filas:");
        filas = teclado.nextInt();

        System.out.println("Introduce el número de columnas:");
        columnas = teclado.nextInt();

        for (int i = 1; i <= filas; i++) {

            for (int j = 1; j <= columnas; j++) {

                System.out.print(i * j + "\t");

            }

            System.out.println();
        }

        teclado.close();
    }
} 
