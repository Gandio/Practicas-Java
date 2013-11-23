/**
 * Un objeto <code>UsaTodo</code> permite usar todos los metodos de objetos Punto, Poligono y Triangulo 
 * @version 1.0 30/10/2013
 */
public class UsaTodo{
   
   public static void main(String[] args) {
   	Punto p1=new Punto(2.0, 6.0);
   	Punto p2=new Punto(-1.0,7.0);
   	Punto p3=new Punto(-6.0,-8.0);
   	Punto p4=new Punto(8.0,3.0);
   	Punto p5=new Punto(1.0,-7.0);
   	
   	System.out.println(p1.toString());
   	System.out.println("La distancia entre p3 y p5 es: " + p3.distancia(p5));
   	System.out.println("El punto p4 se encuentra en el " + p4.cuadrante());
   	
   	Punto[] pvector=new Punto[]{p1,p2,p3,p4,p5};
   	Poligono pol=new Poligono(pvector);
   	Triangulo tri=new Triangulo(pvector);
   	
   	Poligono[] vec_pol = new Poligono[2];
   	vec_pol[0] = pol;
   	vec_pol[1] = tri;
   	
   	System.out.println("Este poligono tiene: " + vec_pol[0].nlados() + " lados");
   	System.out.println("Su perimetro es: " + vec_pol[0].perimetro());
 
   	System.out.println("El area del triangulo es: " + tri.area());
   	System.out.println("El perimetro del triangulo es: " + vec_pol[1].perimetro());
   }
}
