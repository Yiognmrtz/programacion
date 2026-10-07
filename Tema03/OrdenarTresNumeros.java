import java.util.Scanner;

public class OrdenarTresNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = sc.nextInt();

        int aux;

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

     
        if (a > c) {
            aux = a;
            a = c;
            c = aux;
        }

        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println("Números ordenados de menor a mayor:");
        System.out.println(a + " " + b + " " + c);

        sc.close();
    }
}