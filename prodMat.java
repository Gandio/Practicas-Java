import java.util.Random;
import java.util.Date;
import java.text.*;

/**La clase prodMat multiplica dos matrices de nxn elementos
 * @author Francisco Madueño Chulian
 * @version 1.0 9/11/2013
 */
public class prodMat{
   /**Dimension de las matrices*/	
   private int tam;
   /**Matrices de enteros*/
   private int[][] matriz_1;
   private int[][] matriz_2;
   
   /**Constructor de la clase prodMat, inicializa las matrices con números aleatorios*/
   public prodMat(int n){
      tam = n;
      matriz_1 = new int[tam][tam];
      matriz_2 = new int[tam][tam];
      Random rm = new Random();
      
      for(int i = 0; i < tam; ++i){
	     for(int j = 0; j < tam; ++j){
		    matriz_1[i][j] = rm.nextInt();
		    matriz_2[i][j] = rm.nextInt();
		 }
	  }
   }
   
   /**Metodo que multiplica ambas matrices*/
   public int[][] producto(){
      int[][] resultado = new int[tam][tam];
      
      for(int i = 0; i < tam; ++i){ 
         for(int j = 0; j < tam; ++j){
            resultado[i][j] = 0;
               for(int k = 0; k < tam; ++k){
                  resultado[i][j] += (matriz_1[i][k] * matriz_2[k][j]);
               }
         }
      }
	  
	  return resultado;
   }
   
   public static void main(String[] args){
      prodMat pm = new prodMat(1500);
      
      Date d = new Date();
      DateFormat df = new SimpleDateFormat("HH:mm:ss:SSS");
      long inicCronom = System.currentTimeMillis(); //se prepara el cronometro
      d.setTime(inicCronom);
      
      pm.producto();
      
      long finCronom = System.currentTimeMillis(); //se para el cronometro
      d.setTime(finCronom);
      System.out.println("Acabando trabajo a las " + df.format(d) + " tras " + (finCronom - inicCronom) + " milisegundos");
   }
}
