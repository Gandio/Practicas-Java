import java.util.Scanner;

public class usaComplejos{
   public static void main(String[] args){
      System.out.println("----------Menu -------------");
      System.out.println("1 - Suma");
      System.out.println("2 - Resta");
      System.out.println("3 - Modulo");
      System.out.println("4 - Producto");
      System.out.println("5 - Division");
      
      System.out.print("Introduzca una opción: ");
      
      Scanner sc = new Scanner(System.in);
      int eleccion = sc.nextInt();
      
      System.out.print("Introduzca un numero complejo: ");
      
      double x = sc.nextDouble();
      double y = sc.nextDouble();
      Complejos c1 = new Complejos(x,y);
	  
	  switch(eleccion){
         case 1:{ 
			 System.out.print("Introduzca otro numero complejo: ");
	         x = sc.nextDouble();
	         y = sc.nextDouble();
	         Complejos c2 = new Complejos(x,y);
			 Complejos cres = c1.suma(c2);
			 System.out.println(cres.getReal() + " " + cres.getImag() + "i");
		 }
         break;
         
         case 2:{ 
			 System.out.print("Introduzca otro numero complejo: ");
	         x = sc.nextDouble();
	         y = sc.nextDouble();
	         Complejos c2 = new Complejos(x,y);
			 Complejos cres = c1.resta(c2);
			 System.out.println(cres.getReal() + " " + cres.getImag() + "i");
		 }
         break;
         
         case 3:{ double res = c1.modulo();
                 System.out.println(res);
	     }
         break;
         
         case 4:{ 
			 System.out.print("Introduzca otro numero complejo: ");
	         x = sc.nextDouble();
	         y = sc.nextDouble();
	         Complejos c2 = new Complejos(x,y);
			 Complejos cres = c1.producto(c2);
			 System.out.println(cres.getReal() + " " + cres.getImag() + "i");
		 }
         break;
         
         case 5:{ 
			 System.out.print("Introduzca otro numero complejo: ");
	         x = sc.nextDouble();
	         y = sc.nextDouble();
	         Complejos c2 = new Complejos(x,y);
			 Complejos cres = c1.division(c2);
			 System.out.println(cres.getReal()+ " " + cres.getImag() + "i");
		 }
         break;
         
         default: System.out.println("Opción incorrecta...");
      }
   }
}
