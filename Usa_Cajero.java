/**
 *
 * @author Francisco Madueño Chualián 
 * @version 1.00 12/11/03
 *
 *Un objeto <code>Usa_Cajero</code> permite inicializar y usar objetos tipo <code>Cajero</code> y <code>Cuenta_Banca</code>
 */

public class Usa_Cajero{
   
   /**Imprime por pantalla el saldo que tiene una <code>Cuenta_Banca</code> tras utilizar varios <code>Cajeros</code>*/
   public static void main (String[] args) {
   	 
   	 Cuenta_Banca cuenta= new Cuenta_Banca(1234, 1000.0);
   	 Thread cajero1=new Thread(new Cajero(0,10000,cuenta));
     Thread cajero2=new Thread(new Cajero(1,10000,cuenta));
     
     cajero1.start();
     cajero2.start();
     
     try{cajero1.join();}catch(Exception e){};
     try{cajero2.join();}catch(Exception e){};
     
     System.out.println(cuenta.Saldo());
  }
}