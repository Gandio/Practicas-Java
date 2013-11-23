import java.util.Random;
import java.util.Date;
import java.text.*;

/**La clase UsaprodMatConcurrente se encarga de probar la clase prodMatConcurrente
 * @author Francisco Madueño Chulian
 * @version 1.0 10/11/2013
 */

public class UsaprodMatConcurrente{
   public static void main(String[] args) throws InterruptedException{
      int tam = 1500;
      Random rm = new Random();
      int[][] matriz_1 = new int[tam][tam];
      int[][] matriz_2 = new int[tam][tam];
      
      for(int i = 0; i < tam; ++i){
	     for(int j = 0; j < tam; ++j){
	        matriz_1[i][j] = rm.nextInt();
	        matriz_2[i][j] = rm.nextInt();
	     }
	  }
	  
	  prodMatConcurrente[] vec_hilo = new prodMatConcurrente[tam];
	  
	  for(int i = 0; i < tam; ++i){
	     vec_hilo[i] = new prodMatConcurrente(i, tam, matriz_1, matriz_2);
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
