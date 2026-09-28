import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas: ");
        int horas = teclado.nextDouble();

        int sueldo = 12 * 'horas';

        System.out.println("sueldo: " );

        teclado.close();
    }
}
