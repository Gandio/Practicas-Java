import java.util.Scanner;

public class desCesar{
   public static char descodificar(int n, char c){
      int aux = (int) c;
      int cod = aux - n%27;
      
      return (char) cod;
       
   }
   
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Introduce una cadena: ");
      String cadena = sc.nextLine();
      
      System.out.println("Introduce un numero: ");
      int valor = sc.nextInt();
      
      for(int i = 0; i < cadena.length(); ++i){
	     System.out.print(descodificar(valor, cadena.charAt(i)));   
	  }
      
   }
}
