
/**
 * Write a description of class Ejecutable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import  java.lang.Math;
import java.util.Scanner;
public class Ejecutable
{
    
    public static void main(String args[]){
        Scanner lector=new Scanner(System.in);
        double Lado1;        
        double Lado2;
        double Lado3;
        double AreaTriangulo;
        double PerimetroTriangulo;
        
        
        System.out.print("\f");
       
        System.out.println("Programa que calcula el área y el perimetro de un triangulo");
        
        System.out.println("\nColoque la magnitud del lado 1:"); 
        Lado1 = Double.parseDouble(lector.next());
        
        System.out.println("\nColoque la magnitud del lado 2:"); 
        Lado2 = Double.parseDouble(lector.next());
        
        System.out.println("\nColoque la magnitud del lado 3:"); 
        Lado3 = Double.parseDouble(lector.next());
        
        Triangulo mTriangulo = new Triangulo();
        mTriangulo.setLado1(Lado1);
        mTriangulo.setLado2(Lado2);
        mTriangulo.setLado3(Lado3);
        
        System.out.println("\nEl perimetro del triangulo es de magnitud " + mTriangulo.getCalcularPerimetro());
        System.out.println("\nEl área del triangulo es de magnitud " + mTriangulo.getCalcularArea()); 
         
      }
}
