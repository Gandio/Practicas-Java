/**Clase que se encarga de usar la clase Hilo
 * @author Francisco Madueño Chulian
 * @version 1.0 30/10/2013
 */
public class usaHilo{
   /**Metodo main*/	
   public static void main(String[] args)throws Exception{
      Hilo a = new Hilo(true);
      Hilo b = new Hilo(false);
      
      a.start();
      b.start();
      
      a.join();
      b.join();
      
      System.out.println(b.getN());
   }
}
