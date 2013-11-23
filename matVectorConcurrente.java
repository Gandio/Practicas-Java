import java.util.Random;
import java.util.Date;
import java.text.*;

/**La clase matVectorConcurrente multiplica una matriz de nxn con un vector de n elementos de forma concurrente
 * @author Francisco Madueño Chulian
 * @version 1.0 9/11/2013
 */ 
public class matVectorConcurrente extends Thread{
   /**Fila que va a procesar un hilo*/
   private int fila;
   /**Dimensiones de la matriz y el vector*/
   private static int tam;
   /**Vector de n elementos enteros*/
   private static int[] vector;
   /**Matriz de nxn elementos enteros*/
   private static int[][] matriz;
   /**Vector solución*/
   private static int[] vec_res;
   
   /**Constructor de la clase matVectorConcurrente*/
   public matVectorConcurrente(int f, int n, int[] v, int[][] m){
      fila = f;
      tam = n;
      vector = v;
      matriz = m;
      vec_res = new int[tam];
   }
   
   /**Sobrecarga del metodo run() de la clase Thread, multiplica cada fila de la matriz por el vector*/ 
   public void run(){
	  vec_res[fila] = 0; 
      for(int i = 0; i < tam; ++i){
	     vec_res[fila] += vector[i] * matriz[i][fila];
	  }
   }
   
   public static void main(String[] args) throws InterruptedException{
      int tam = 12000;
      int[] vector = new int[tam];
      int[][] matriz = new int[tam][tam];
      Random rm = new Random();
      
      for(int i = 0; i < tam; ++i){
	     for(int j = 0; j < tam; ++j){
	        matriz[i][j] = rm.nextInt();
	     }
	     vector[i] = rm.nextInt();	  
	  }
      
      matVectorConcurrente[] vec_hilo = new matVectorConcurrente[tam];
      
	  for(int i = 0; i < tam; ++i){
	     vec_hilo[i] = new matVectorConcurrente(i, tam, vector, matriz);
	  }
	  
	  Date d = new Date();
      DateFormat df = new SimpleDateFormat("HH:mm:ss:SSS");
      long inicCronom = System.currentTimeMillis(); //se prepara el cronometro
      d.setTime(inicCronom);
	  
	  
	  for(int i = 0; i < tam; ++i){
	     vec_hilo[i].start();
	  }
	  
	  long finCronom = System.currentTimeMillis(); //se para el cronometro
      d.setTime(finCronom);
      System.out.println("Acabando trabajo a las " + df.format(d) + " tras " + (finCronom - inicCronom) + " milisegundos");
	  
	  for(int i = 0; i < tam; ++i){
	     vec_hilo[i].join();
	  }      
	  
   }
}
