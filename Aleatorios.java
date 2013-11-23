import java.lang.Math;
import java.util.Scanner;

public class Aleatorios{
   
   public static void main(String[] args){
      System.out.println("Introduce una longitud para la secuencia: ");
      Scanner sc = new Scanner(System.in);
      int tam = sc.nextInt();
     
      for(int i = 0; i < tam; ++i){
	     System.out.print(" " + Math.random() + " ");
	  }
   }
}
