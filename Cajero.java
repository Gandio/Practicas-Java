/**
 *
 * @author Francisco Madueño Chualián 
 * @version 1.00 12/11/03
 *
 *Un objeto <code>Cajero</code> define un cajero como un trio tipocajero/nVueltas/cb, donde tipocajero y nVueltas son <code>int</code>
 *y cb es <code>Cuenta_Banca</code>
 */
public class Cajero implements Runnable{
  /** El tipo de cajero, si es de tipo 0 ingresará dinero en la cuenta, si es de tipo 1 sacará dinero*/
  private int tipocajero;
  /** Numero de veces que queremos que el hilo se ejecute*/
  private int nVueltas;
  /**Cuenta vinculada al cajero, será de donde saquemos o ingresemos dinero*/
  private static Cuenta_Banca cb;
  
  /**Crea un cajero con un tipo de cajero, un número de vueltas y asociado a una cuenta ya existente
   * @see Cajero#Cajero(int, int, Cuenta_Banca)
   */
  public Cajero(int tipocajero, int nVueltas, Cuenta_Banca cb){
  	super();
  	this.tipocajero=tipocajero;
  	this.nVueltas=nVueltas;
  	this.cb=cb;
  }
  /**Sobrecargamos el metodo run() de la clase Thread para que en caso de que el tipo de cajero sea 1 resta 10 al dinero que haya en el
   *cajero y si el tipo de cajero es 0 suma 10 al saldo de dicha cuenta
   *see %run()
   */
  @Override
  public void run(){
  	switch(tipocajero){
  	   case 0: for(int i=0; i<nVueltas; i++) cb.Deposito(10.0); break;
  	   case 1: for(int i=0; i<nVueltas; i++) cb.Reintegro(10.0); break; 
    }
  }
}