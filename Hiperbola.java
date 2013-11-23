/**La clase Hiperbola está formada por dos doubles, que representan los valores a y b de las hiperbolas
 * @author Francisco Madueño Chulian
 * @version 1.0 24/10/2013
 */
 
public class Hiperbola{
   /**Valores de la hiperbola*/
   private double a, b, c;
   
   /**Constructor, recibe dos doubles*/
   public Hiperbola(double p1, double p2, double p3){
      a = p1;
      b = p2;
      c = p3;
   }
   
   /**Metodos observadores
    * @return double
    */
   public double getA(){return a;}
   public double getB(){return b;}
   public double getC(){return c;}
   /**Metodos modificadores
    * @param double
    */
   public void setA(double p){a = p;}
   public void setB(double p){b = p;}
   public void setC(double p){c = p;}
   /**Este método comprueba si un punto dado pertenece a la hiperbola
    * @param double, double
    * @return boolean
    */
   public boolean pertenece(double x, double y){
      if((Math.pow(x,2)/Math.pow(a,2)) - (Math.pow(y,2)/Math.pow(b,2)) == 1) return true;
      return false;
   }
}
