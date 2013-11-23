/**La clase complejos se representa mediante un vector de double de dos elementos
 * @author Francisco Madueño Chulian
 * @version 1.0 24/10/2013
 */ 

public class Complejos{
   /**Vector de doubles de dos posiciones*/
   private double[] complejo = new double[2];
   
   /**Constructor recibe dos doubles*/
   public Complejos(double x, double y){
      complejo[0] = x;
      complejo[1] = y;
   }
   
   /**Metodos observadores
    * @return double
    */
   public double getReal(){return complejo[0];}
   public double getImag(){return complejo[1];}
   
   /**Suma de complejos
    * @return Complejos
    * @param Complejos
    */ 
   public Complejos suma(Complejos c){
      Complejos res = new Complejos(this.getReal()+c.getReal(), this.getImag()+c.getImag());
      return res;
   }
   
    /**Resta de complejos
    * @return Complejos
    * @param Complejos
    */
   public Complejos resta(Complejos c){
      Complejos res = new Complejos(this.getReal()-c.getReal(), this.getImag()-c.getImag());
      return res;
   }
   
   /**Modulo de complejo
    * @return double
    */
   public double modulo(){
      double res = Math.sqrt(Math.pow(this.getReal(), 2.0) + Math.pow(this.getImag(), 2.0));
      return res;
   }
   
    /**Producto de complejos
    * @return Complejos
    * @param Complejos
    */
   public Complejos producto(Complejos c){
      Complejos res = new Complejos((this.getReal()*c.getReal())-(this.getImag()*c.getImag()), 
                                    (this.getReal()*c.getImag())+(this.getImag()*c.getReal()));
      return res;
   }
   
    /**Division de complejos
    * @return Complejos
    * @param Complejos
    */
   public Complejos division(Complejos c){
      Complejos res = new Complejos((this.getReal()*c.getReal())+(this.getImag()*c.getImag()) / (Math.pow(c.getReal(),2) + Math.pow(c.getImag(),2)),
                                    (this.getImag()*c.getReal())-(this.getReal()*c.getImag()) / (Math.pow(c.getReal(),2) + Math.pow(c.getImag(),2)));
      return res;
   }
}
