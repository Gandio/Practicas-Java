import java.util.Scanner;

public class Biblioteca{
   private static Libro[] registro = new Libro[100];
   
   public static void main(String[] args){
      System.out.println("------------- Menu ----------------");
      System.out.println("1 - Insertar libro");
      System.out.println("2 - Buscar libro");
      System.out.println("3 - Eliminar libro");
      System.out.println("4 - Salir");
      
      Scanner sc = new Scanner(System.in);
      int eleccion = sc.nextInt();
      int contador = 0;
      
      while(eleccion != 4){
	     switch(eleccion){
	        case 1:{
			   System.out.print("Introduce titulo: ");
			   String titulo = sc.nextLine();
			   System.out.print("Introduce nombre autor: ");
			   String autor = sc.nextLine();
			   System.out.print("Introduce año: ");
			   String year = sc.nextLine();
			   System.out.print("Introduce editorial: ");
			   String editorial = sc.nextLine();
			   System.out.print("Introduce isbn: ");
			   String isbn = sc.nextLine();
			   
			   registro[contador] = new Libro(titulo, autor, year, editorial, isbn);
			   contador++;
			   
			   System.out.println("------------- Menu ----------------");
               System.out.println("1 - Insertar libro");
               System.out.println("2 - Buscar libro");
               System.out.println("3 - Eliminar libro");
               System.out.println("4 - Salir");
      
               sc = new Scanner(System.in);
               eleccion = sc.nextInt();
			}break;
	        case 2:{
				System.out.println("Introduce criterio de busqueda: ");
				System.out.println("1- Isbn");
				System.out.println("2- Titulo");
				
				int busqueda = sc.nextInt();
				switch(busqueda){
				   case 1:{
				      System.out.println("Introduce el isbn");
				      String isbn = sc.nextLine();
				      
				      int i = 0;
				      while(isbn != registro[i].getIsbn()){i++;}
				      
				      System.out.println(registro[i].getTitulo() + " de " + registro[i].getAutor() + "editado por " + 
				                         registro[i].getEditorial() + " " + registro[i].getAño());
				      
				      System.out.println("------------- Menu ----------------");
                      System.out.println("1 - Insertar libro");
                      System.out.println("2 - Buscar libro");
                      System.out.println("3 - Eliminar libro");
                      System.out.println("4 - Salir");
      
                      sc = new Scanner(System.in);
                      eleccion = sc.nextInt();
				   }break;
				   case 2:{
				   	  System.out.println("Introduce el titulo");
				      String titulo = sc.nextLine();
				      
				      int i = 0;
				      while(titulo != registro[i].getTitulo()){i++;}
				      
				      System.out.println(registro[i].getTitulo() + " de " + registro[i].getAutor() + "editado por " + 
				                         registro[i].getEditorial() + " " + registro[i].getAño());
				      
				      System.out.println("------------- Menu ----------------");
                      System.out.println("1 - Insertar libro");
                      System.out.println("2 - Buscar libro");
                      System.out.println("3 - Eliminar libro");
                      System.out.println("4 - Salir");
      
                      sc = new Scanner(System.in);
                      eleccion = sc.nextInt();
				   }break;
				   
				   default: System.out.println("Opcion incorrecta"); break;
				}
		    }break;
		    
		    case 3:{
				System.out.println("Introduce isbn del libro para eliminarlo: ");
				String isbn = sc.nextLine();
				
				int i=0;
				while(isbn != registro[i].getIsbn()){i++;}
				
				if(i != contador){
				   for(int k = i; k <= contador; ++k){
				      registro[i] = registro[i+1];
				   }
			    }else{
				   System.out.println("Libro no encontrado");
				}
				
				contador--;
				System.out.println("------------- Menu ----------------");
                System.out.println("1 - Insertar libro");
                System.out.println("2 - Buscar libro");
                System.out.println("3 - Eliminar libro");
                System.out.println("4 - Salir");
      
                sc = new Scanner(System.in);
                eleccion = sc.nextInt();
			}break;
	        
	        default: break;
	     }
	  }
   }
}
