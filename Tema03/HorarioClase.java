import java.util.Scanner;

public class HorarioClase {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String dia = teclado.nextLine();

        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("A primera hora toca Lenguaje de marcas.");
                break;

            case "martes":
                System.out.println("A primera hora toca Programacion.");
                break;

            case "miércoles":
                System.out.println("A primera hora toca Inglés.");
                break;

            case "jueves":
                System.out.println("A primera hora toca Programación.");
                break;

            case "viernes":
                System.out.println("A primera hora toca Base de dataos.");
                break;

            default:
                System.out.println("El día introducido no es válido.");
        }

        teclado.close();
    }
}
