/**
 * Un triangulo es un poligono de tres lados, el vector que los representa tiene una dimension de 3
 * @version 1.0 30/10/2013
 */
public class Triangulo extends Poligono{
   /**Vector de puntos de solo 3 elementos*/
   private Punto[] tria_=new Punto[3];
   /**Crea un triangulo con un vector de puntos
    *@see Triangulo#Triangulo(Punto[])
    */
   public Triangulo(Punto[] puntos){
   	super(puntos);
   	for(int i=0; i<3; i++)
   		tria_[i]=puntos[i];
   	}
   	
   /**Devuelve el perimetro de un triangulo
    *@return perimetro de un triangulo
    *@see #perimetro()
    */
   public double perimetro(){
   	double res=tria_[0].distancia(tria_[1])+tria_[0].distancia(tria_[2])+tria_[1].distancia(tria_[2]);
   	
   	return res;
   }
   /**Devuelve el area de un triangulo
    *@return area
    *@see #area()
    */
   public double area(){
   	double semiper=perimetro()/2;
   	double res;
   	res=Math.sqrt(semiper*(semiper-tria_[0].distancia(tria_[1]))*(semiper-tria_[0].distancia(tria_[2]))*(semiper-tria_[1].distancia(tria_[2])));
   	
   	return res;
   }
}
