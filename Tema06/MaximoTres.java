
import java.util.Scanner;

public class MaximoTres {

    // Funcion que devuelve el mayor de tres numeros
    public static int maximo(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Introduce el primer numero: ");
        num1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = teclado.nextInt();

        System.out.print("Introduce el tercer numero: ");
        num3 = teclado.nextInt();

        System.out.println("El numero mayor es: "
                + maximo(num1, num2, num3));

        teclado.close();
    }
}
