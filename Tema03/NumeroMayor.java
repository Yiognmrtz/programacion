import java.util.Scanner;

public class NumeroMayor {
    public static void main (String [] args) {
    Scanner teclado = new Scanner (System.in);
    int a = 0, b = 0;

    System.out.print ("introduce el numero uno:");
    a = teclado.nextInt();
    System.out.print ("introduce el numero dos:");
    b = teclado.nextInt();

    if (a > b) {
        System.out.print("primer numero es mayor:");
    }
    else if (a < b) {
            System.out.println("segundo es mayor");
        }
        else {
  System.out.println("son iguales");
        }
        }
    } 

