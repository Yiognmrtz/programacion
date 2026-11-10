
import java.util.Scanner;

public class Biblioteca {

    // 1. Comprueba si un número es capicúa
    public static boolean esCapicua(int numero) {
        return numero == voltea(numero);
    }

    // 2. Calcula una potencia
    public static int potencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }

        return resultado;
    }

    // 3. Cuenta los dígitos de un número
    public static int digitos(int numero) {
        int contador = 0;

        if (numero == 0) {
            return 1;
        }

        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }

        return contador;
    }

    // 4. Da la vuelta a un número
    public static int voltea(int numero) {
        int resultado = 0;

        while (numero != 0) {
            int digito = numero % 10;
            resultado = resultado * 10 + digito;
            numero = numero / 10;
        }

        return resultado;
    }

    // 5. Quita n dígitos por detrás
    public static int quitaPorDetras(int numero, int n) {

        for (int i = 0; i < n; i++) {
            numero = numero / 10;
        }

        return numero;
    }

    // 6. Añade un dígito por delante
    public static int pegaPorDelante(int numero, int digito) {

        int posicion = (int) Math.pow(10, digitos(numero));

        return digito * posicion + numero;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n--- BIBLIOTECA MATEMATICA ---");
            System.out.println("1. Es capicua");
            System.out.println("2. Potencia");
            System.out.println("3. Contar digitos");
            System.out.println("4. Voltear numero");
            System.out.println("5. Quitar digitos por detras");
            System.out.println("6. Pegar digito por delante");
            System.out.println("0. Salir");

            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            int numero;
            int exponente;
            int n;
            int digito;

            switch (opcion) {

                case 1:
                    System.out.print("Introduce un numero: ");
                    numero = teclado.nextInt();

                    System.out.println("¿Es capicua? "
                            + esCapicua(numero));
                    break;

                case 2:
                    System.out.print("Introduce la base: ");
                    numero = teclado.nextInt();

                    System.out.print("Introduce el exponente: ");
                    exponente = teclado.nextInt();

                    System.out.println("Resultado: "
                            + potencia(numero, exponente));
                    break;

                case 3:
                    System.out.print("Introduce un numero: ");
                    numero = teclado.nextInt();

                    System.out.println("Tiene "
                            + digitos(numero) + " digitos");
                    break;

                case 4:
                    System.out.print("Introduce un numero: ");
                    numero = teclado.nextInt();

                    System.out.println("Numero invertido: "
                            + voltea(numero));
                    break;

                case 5:
                    System.out.print("Introduce un numero: ");
                    numero = teclado.nextInt();

                    System.out.print("¿Cuantos digitos quieres quitar? ");
                    n = teclado.nextInt();

                    System.out.println("Resultado: "
                            + quitaPorDetras(numero, n));
                    break;

                case 6:
                    System.out.print("Introduce un numero: ");
                    numero = teclado.nextInt();

                    System.out.print("Introduce el digito: ");
                    digito = teclado.nextInt();

                    System.out.println("Resultado: "
                            + pegaPorDelante(numero, digito));
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 0);

        teclado.close();
    }
}
