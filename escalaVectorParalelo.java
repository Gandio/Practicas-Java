/**Esta clase escala un vector de n elementos de forma concurrente
 * @author Francisco Madueño Chulian
 * @version 1.0 3/11/2013
 */

import java.util.Random;
import java.util.Date;
import java.text.*;

public class escalaVectorParalelo extends Thread{
  /**Vector de enteros*/
  public static int[] vector;
  /**Valor de escalado*/
  public static int k = 2000;
  /**Limites de los hilos que escalen*/
  public int lim_inf, lim_sup;
  
  /**Contructor de la clase escalaVector Paralelo*/
  public escalaVectorParalelo(int linf, int lsup, int[] v){
	  vector = v;
	  lim_inf = linf;
	  lim_sup = lsup;
   }
   /**Sobrecarga del metodo run de la clase Thread*/
   public void run(){
      for(int i = lim_inf; i < lim_sup; ++i){
	     vector[i] *= k;
	  }   
   }
   
   public static void main(String[] args)throws Exception{
      int tam = 100000000;
      int[] vector = new int[tam];
      Random rm = new Random();
      
      for(int i = 0; i < tam; ++i){
	     vector[i] = rm.nextInt(2);
	  }
      
      int nNucleos = Runtime.getRuntime().availableProcessors();
      int l_inf = 0;
      int l_sup = tam/nNucleos;
      int bloque = l_sup;
      escalaVectorParalelo[] vec_hilo = new escalaVectorParalelo[nNucleos];
      
      for(int i = 0; i < nNucleos; ++i){
	     vec_hilo[i] = new escalaVectorParalelo(l_inf, l_sup, vector);
	     l_inf = l_sup;
	     l_sup += bloque;
	  }
	  
	  Date d = new Date();
      DateFormat df = new SimpleDateFormat("HH:mm:ss:SSS");
      long inicCronom = System.currentTimeMillis(); //se prepara el cronometro
      d.setTime(inicCronom);
	  
	  for(int i = 0; i < nNucleos;  ++i){
	     vec_hilo[i].start();
	  }
	  
	  for(int i = 0; i < nNucleos;  ++i){
	     vec_hilo[i].join();
	  }
	  
	  long finCronom = System.currentTimeMillis(); //se para el cronometro
      d.setTime(finCronom);
      System.out.println("Acabando trabajo a las " + df.format(d) + " tras " + (finCronom - inicCronom) + " milisegundos");
   }

}
