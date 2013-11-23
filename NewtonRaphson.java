import java.util.Scanner;
import java.lang.Math;

public class NewtonRaphson{
   public static double funcion1(double x){
      if(x <= 0 && x >= 1) return 999.9;
      
      double res = x - (Math.cos(x) - Math.pow(x,3.0)) / (-1*Math.sin(x) - 3*Math.pow(x,2));
      
      return res;
   }
   public static double funcion2(double x){
      if(x <= 2 && x >= 3) return 999.9;
      
      double res = x -((x*x)-5) / (2*x);
      
      return res; 
   }	
   
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce una cantidad de iteraciones: ");
      int itera = sc.nextInt();
      
      System.out.println("Introduce una aproximación inicial: ");
      double aprox = sc.nextDouble();
      
      for(int i = 0; i < itera; ++i){
         System.out.print(" " + aprox + " ");
         aprox = funcion2(aprox);
      }
   }
}
