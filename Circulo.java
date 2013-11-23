
import java.lang.Math;

public class Circulo{
   static final double pi = 3.14;
   private double diametro;
   private double altura;
   
   Circulo(double diam, double alt){
      diametro = diam;
      altura = alt;
   }
   
   public double area(){
      double generatriz = Math.pow(Math.pow(diametro/2, 2) + Math.pow(altura, 2), 1/2);
      double area = pi * (diametro/2) * ((diametro/2) + generatriz);
      
      return area;   
   }
   
   public static void main(String[] args){
      Circulo c = new Circulo(14.2, 20);
      System.out.println(c.area());
   }
}
