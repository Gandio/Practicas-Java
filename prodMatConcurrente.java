
/**La clase prodMatConcurrente se encarga de multiplicar dos matrices de nxn concurrentemente
 * @author Francisco Madueño Chulian
 * @version 1.0 10/11/2013
 */
public class prodMatConcurrente extends Thread{
   /**Fila que multiplicará cada uno de los objetos que se creen*/
   private int fila;
   /**Dimensiones de la matriz*/
   private static int tam;
   /**Matrices que se multiplican*/
   private static int[][] matriz_1;
   private static int[][] matriz_2;
   /**Matriz resultado del producto*/
   private static int[][] resultado;
   
   /**Constructor de la clase prodMatConcurrente*/
   public prodMatConcurrente(int f, int n, int[][] m1, int[][] m2){
      fila = f;
      tam = n;
      matriz_1 = m1;
      matriz_2 = m2;
      
      resultado = new int[tam][tam];
   }
   
   /**Metodo run() de la clase Thread sobrecargado para que multiplique una la fila de una matriz por todas las columnas de otra y
    * rellene la matriz resultado*/
   public void run(){
      for(int i = 0; i < tam; ++i){
         resultado[i][fila] = 0;
         for(int k = 0; k < tam; ++k){ 
		    resultado[i][fila] += matriz_1[k][fila] * matriz_2[i][k];
		 }
      }
   }
}
