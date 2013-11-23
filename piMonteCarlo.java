import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class piMonteCarlo{
   public static boolean diana(double x, double y, double radio){
      double distancia = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
      if(distancia <= radio) return true;
      
      return false;
   }
   
   public static void main(String[] args){
      System.out.println("Introduce el numero de disparos a realizar: ");
      Scanner sc = new Scanner(System.in);
      double disparos = sc.nextDouble();
      
      double cont = 0.0;
   
      for(double i = 0; i < disparos; ++i){
         Random rm = new Random();
         double x = rm.nextDouble();
         double y = rm.nextDouble();
         
         if(diana(x,y,1.0)) cont++;
      }
      
      System.out.println(cont);
      System.out.println("El numero pi vale: " + (cont/disparos) * 4);
   }
}
