/**Esta clase abstrae el concepto de Libro con cinco String, titulo, autor, año de publicación, editorial e isbn
 * @author Francisco Madueño Chulian
 * @version 1.0 24/10/2013
 */ 
public class Libro{
   /**Atributos de la clase libro*/
   private String titulo, autor, año, editorial, isbn;
   
   /**Constructor, recibe cinco variables de la clase String*/
   public Libro(String tit, String aut, String año, String edit, String id){
      titulo = tit;
      autor = aut;
      this.año = año;
      editorial = edit;
      isbn = id;
   }
   
   /**Metodos observadores
    * @return String
    */ 
   public String getTitulo(){return titulo;}
   public String getAutor(){return autor;}
   public String getAño(){return año;}
   public String getEditorial(){return editorial;}
   public String getIsbn(){return isbn;}
}
