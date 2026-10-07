import java.util.Scanner;

public class NumeroMenor{
    public static void main (String[] args) {
         Scanner teclado = new Scanner(System.in);
         int a = 0, b = 0, c = 0;
         System.out.print ("introduce el primer numero:");
            a = teclado.nextInt();
         System.out.print ("introduce el segundo numero:");
             b = teclado.nextInt();
         System.out.print ("introduce el tercer numero:");
             c = teclado.nextInt();

         if (a < b && a < c) {
            System.out.println("El menor es:" + a);
         }

         else if (b < a && b < c) {
            System.out.println("El menor es :" + b);

         }

         else {System.out.println ("El menor es:" + c);
            
         }

         }
        }
