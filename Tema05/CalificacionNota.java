
import java.util.Scanner;

public class CalificacionNota {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una nota:");
        double nota = teclado.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else if (nota >= 9) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        teclado.close();
    }
}
