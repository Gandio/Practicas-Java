import java.util.Scanner;

public class usaHiperbola{

   public static void main(String[] args){
      System.out.println("Introduce tres valores: ");
      Scanner sc = new Scanner(System.in);
      
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      
      Hiperbola h = new Hiperbola(a,b,c);
      
      System.out.println("Introduce un punto: ");
      
      double x = sc.nextDouble();
      double y = sc.nextDouble();
      
      if(h.pertenece(x,y)) System.out.println("El punto pertenece a la hiperbola");
      else System.out.println("Este punto no pertenece");
   }
}
