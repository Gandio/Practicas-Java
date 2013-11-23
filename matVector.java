import java.util.Random;
import java.util.Date;
import java.text.*;

/**La clase matVector multiplica una matriz cuadrada de n x n con un vector de tamaño n
 * @author Francisco Madueño Chulian
 * @version 1.0 9/11/2013
 * */

public class matVector{
   /**Dimensiones del vector y la matriz*/	
   private int tam;
   /**Vector de enteros*/
   private int[] vector;
   /**Matriz de enteros*/
   private int[][] matriz;
   
   /**Constructor de la clase matVector, inicializa la matriz y el vector con número aleatorios*/
   public matVector(int n){
      tam = n;
      vector = new int[tam];
      matriz = new int[tam][tam];
      
      Random rm = new Random();
      
      for(int i = 0; i < tam; ++i){
	     vector[i] = rm.nextInt();
	  }
	  
	  for(int i = 0; i < tam; ++i){
	     for(int j = 0; j < tam; ++j){
	        matriz[i][j] = rm.nextInt();
	     }
	  }
   }
   
   /**Metodo que multiplica la matriz por el vector*/
   public int[] producto(){
      int[] resultado = new int[tam];
      int res = 0;
      for(int i = 0; i < tam; ++i){
	     for(int j = 0; j < tam; ++j){
			 res += vector[j] + matriz[i][j];
		    
		 }
		 resultado[i] = res;
		 res = 0;
	  }
	  
	  return resultado;
   }
   
   public static void main(String[] args){
      matVector mv = new matVector(12000);
      Date d = new Date();
      DateFormat df = new SimpleDateFormat("HH:mm:ss:SSS");
      long inicCronom = System.currentTimeMillis(); //se prepara el cronometro
      d.setTime(inicCronom);
      
      mv.producto();
      
      long finCronom = System.currentTimeMillis(); //se para el cronometro
      d.setTime(finCronom);
      System.out.println("Acabando trabajo a las " + df.format(d) + " tras " + (finCronom - inicCronom) + " milisegundos");
   }
}
