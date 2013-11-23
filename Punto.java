/**
 * Un objeto <code>Punto</code> define a un punto como una pareja x/y, donde tanto x como y son <code>int</code>
 * @version 1.0 30/10/2013
 */
public class Punto {
	/**Define las coordenadas de un punto en un espacio de dos dimensiones*/
	private double x_, y_;
	/**Crea un nuevo punto con las coordenadas x,y introducidas por el usuario
	 *@see Punto#Punto(int,int)
	 */
	public Punto(double x, double y){
	   x_=x;
	   y_=y;
	}
	/**Devuelve la coordenada x de un punto*/
	public double getX(){return x_;}
	/**Devuelve la coordenada y de un punto*/
	public double getY(){return y_;}
	/**Modifica la coordenada x de un punto
	 *@param x	Coordenada x de un punto
	 *@see setX(x)
	 */
	public void setX(double x){x_=x;}
	/**Modifica la coordenada y de un punto
	 *@param y 	Coordenada y de un punto
	 *@see setY(y)
	 */
	public void setY(double y){y_=y;}
	/**Comprueba si un punto es el origen de coordenadas (0,0)
	 *@return true y si es el origen de coordenadas, false si no lo es
	 *@see #esOrigen()
	 */
	public boolean esOrigen(){
	   if(x_==0 && y_==0) return true;
	   else return false;
	}
	/**Calcula la distancia entre dos puntos
	 *@param p	Punto con el que calculamos la distancia entre el actual y este
	 *@return distancia entre el punto p y el actual de tipo double
	 *@see #distancia(Punto)
	 */
	public double distancia(Punto p){
	   if(y_==0 && p.getY()==0) return Math.abs(x_)+Math.abs(p.getX());
	   else if(x_==0 && p.getX()==0) return Math.abs(y_)+Math.abs(p.getY());
	   else return Math.sqrt(Math.pow(x_-p.getX(),2.0)+Math.pow(y_-p.getY(),2.0));
	}
	/**Devuelve el cuadrante en el que se encuentra un punto
	 *@return un string diciendo en que cuadrante esta el punto
	 *@see #cuadrante()
	 */
	public String cuadrante(){
	   if(x_>0 && y_>0) return "primer cuadrante";
	   else if(x_<0 && y_>0) return "segundo cuadrante";
	   else if(x_<0 && y_<0) return "tercer cuadrante";
	   else return "cuarto cuadrante";
	}
	/**Devuelve las coordenadas de un punto en forma de string
	 *@return "Se trata del punto(x,y)"
	 *@see #toString()
	 */
	public String toString(){
	   String res;
	   res= "Se trata del punto (" + x_;
	   res+= ", " + y_;
	   res+= ")";
	   return res;
	}
}
