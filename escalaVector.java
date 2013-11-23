/**Esta clase escala un vector de n elementos de forma iterativa
 * @author Francisco Madueño Chulian
 * @version 1.0 3/11/2013
 */

import java.util.Random;
import java.util.Date;
import java.text.*;

public class escalaVector{
   /**Tamaño del vector*/
   public int n = 10000000;
   /**Vector de enteros*/
   public int[] vector = new int[n];
   
   /**Constructor, contruye un vector de n enteros aleatorios*/
   public escalaVector(){
      Random rm = new Random();
      for(int i = 0; i < n; ++i){
	     vector[i] = rm.nextInt(2);
	  }
   }
   
   /**Metodo que se encarga de escalar el vector*/
   public void escalar(int k){
      for(int i = 0; i < n; ++i){
	     vector[i] *= k;
	  }
   }
   
   public static void main(String[] args){
      escalaVector evec = new escalaVector();
      
      Date d = new Date();
      DateFormat df = new SimpleDateFormat("HH:mm:ss:SSS");
      long inicCronom = System.currentTimeMillis(); //se prepara el cronometro
      d.setTime(inicCronom);
      
      evec.escalar(20);
      
      long finCronom = System.currentTimeMillis(); //se para el cronometro
      d.setTime(finCronom);
      System.out.println("Acabando trabajo a las " + df.format(d) + " tras " + (finCronom - inicCronom) + " milisegundos");
   }
   
}
