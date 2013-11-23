/**La clase Hilo se representa como un entero que almacena valores y un booleano que indica que tipo de hilo se lanza
 * @author Francisco Madueño Chulian
 * @version 1.0 30/10/2013
 */ 
public class Hilo extends Thread{
   public static int n = 0;
   public boolean inc;
   
   /**Contructor de la clase Hilo*/
   public Hilo(boolean b){inc = b;}
   
   /**Sobrecarga del metodo run de la clase Thread que funciona de la siguente forma*/
   public void run(){
      if(inc){
	     for(int i = 0; i < 1000; ++i){
	        n++;
	     }
	  }else{
	     for(int i = 0; i < 1000; ++i){
		    n--;
		 }
	  }
   }
   
   /**Metodo observador
    * @return entero
    */
   public int getN(){return n;}
}
