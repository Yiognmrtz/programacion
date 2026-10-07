import java.util.Scanner;

public class NumeroDivisible {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero:");
        int numero = teclado.nextInt();
        if   ((numero % 2 == 0) && (numero % 3 == 0)) {
            System.out.println("El número es divisible entre 2 y 3");
        }
        if((numero % 2 == 0) ^ (numero % 3 == 0)) {
            System.out.println("El número es divisible entre 2 o 3");
    }
}
}