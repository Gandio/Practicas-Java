/**
 * Un objeto <code>Ack</code> permite realizar la funcion de Ackermann recursivamente y mostrar por pantalla el resultado
 *
 *@version 1.0 24/10/2013
 *@author Francisco Madueño Chulián
 */
import java.util.Scanner;

public class Ack {
	/**Devuelve el valor resultante de realizar la funcion de Ackermann con los valores introducidos por el usuario
	 *@param m		valor m de la funcion de Ackermann
	 *@param n 		valor n de la funcion de Ackermann
	 *@return 		resultado de la funcion de Ackermann con los valores m y n
	 *@see #resuelve_ack()
	 */
	public static int resuelve_ack(int m, int n){
	   if(m==0) return n+1;
	   else if(m>0 && n==0) return resuelve_ack(m-1,1);
	   else return resuelve_ack(m-1,resuelve_ack(m,n-1));
	}
    /**Pide al usuario dos enteros para seguidamente mostrar el resultado de aplicar Ackermann a dichos valores*/
    public static void main(String[] args) {
       System.out.println("Introduce dos enteros");
       
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       sc=new Scanner(System.in);
       int b=sc.nextInt();
       
       System.out.println("La solucion es: " + resuelve_ack(a,b));
    }
}
