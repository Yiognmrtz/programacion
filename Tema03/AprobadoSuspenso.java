import java.util.Scanner;

public class AprobadoSuspenso {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la nota del primer control: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Introduce la nota del segundo control: ");
        double nota2 = teclado.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Has aprobado.");
            System.out.println("Tu nota es: " + media);
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = teclado.next();

            if (recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("Has aprobado.");
                System.out.println("Tu nota es: 5");
            } else {
                System.out.println("No has aprobado.");
                System.out.println("Tu nota es: " + media);
            }
        }

        teclado.close();
    }
}