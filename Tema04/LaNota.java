
import java.util.Scanner;

public class LaNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] notas = new double[5];
        double suma = 0;
        double maximo, minimo;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }

        maximo = notas[0];
        minimo = notas[0];

        for (int i = 0; i < notas.length; i++) {
            double nota = notas[i];

            double alza = Math.ceil(nota * 10) / 10.0;
            double baja = Math.floor(nota * 10) / 10.0;
            int truncada = (int) nota;

            System.out.println("\nNota original: " + nota);
            System.out.printf("Redondeada al alza: %.1f%n", alza);
            System.out.printf("Redondeada a la baja: %.1f%n", baja);
            System.out.println("Truncada a las unidades: " + truncada);

            suma += nota;

            if (nota > maximo) {
                maximo = nota;
            }

            if (nota < minimo) {
                minimo = nota;
            }
        }
        
        double media = suma / notas.length;

        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.printf("Media: %.2f%n", media);
        System.out.println("Nota máxima: " + maximo);
        System.out.println("Nota mínima: " + minimo);

        teclado.close();
    }
}