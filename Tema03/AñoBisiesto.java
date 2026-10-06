import java.util.Scanner;

public class AñoBisiesto{
    public static void main (String[] args) {
         Scanner teclado = new Scanner(System.in);
     int ano = 0;
     System.out.print ("introduce el año:");
    ano = teclado.nextInt();
if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
    System.out.println("Es bisiesto");
} else {
    System.out.println("No es bisiesto");
}
    }
}