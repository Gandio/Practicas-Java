import java.util.Arrays;

/**
 * Un objeto <code>Poligono</code> define a un poligono como un vector de puntos 
 * @version 1.0 30/10/2013
 */

public class Poligono{
   /**Vector donde se almacenan el conjunto de puntos que forman un poligono*/	
   private Punto[] p;
   /**Crea un nuevo poligono a partir de un vector de puntos dado por el usuario
    *@see Poligono#Poligono(Punto[])
    */
   public Poligono(Punto[] q){
      p=new Punto[q.length];
      p=Arrays.copyOf(q,q.length);
   }
   /**Devuelve el numero de lados de un poligono
    *@see #nlados()
    */
   public int nlados(){
      return p.length;
   }
   /**Calcula el perimetro de un poligono
    *@return perimetro de un poligono, double
    *@see #perimetro()
    */
   public double perimetro(){
      double res=0.0;
      int n=p.length;
      for(int i=0; i<n-1; i++){
         res+=p[i].distancia(p[i+1]);
      }
      res+=p[0].distancia(p[n-1]);
      return res;
   }
   /**Desplaza a un poligono en el plano a unidades horizontalmente y b unidades verticalmente
    *@param a	Desplaza la x de los puntos que forman el poligono a unidades
    *@param b 	Desplaza la y de los puntos que forman el poligono b unidades
    *@see #desplazamiento(double,double)
    */ 
   public void desplazamiento(double a, double b){
      for(int i=0; i<p.length; i++){
         p[i].setX(p[i].getX()+a);
         p[i].setY(p[i].getY()+b);
      }
   }
   /**Escala a un poligono a veces en el plano
    *@param a	Veces que se escala un poligono
    *@see #escalado(double)
    */
   public void escalado(double a){
      for(int i=0; i<p.length; i++){
         p[i].setX(p[i].getX()*a);
         p[i].setY(p[i].getY()*a);
      }
   }
}
