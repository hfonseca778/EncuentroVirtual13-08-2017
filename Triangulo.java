
/**
 * Calcular perimetro y área de un triangulo
 *
 * @author hfonseca778
 * @version 13-08-2017
 */
import  java.lang.Math;
import java.util.Scanner;
public class Triangulo
{
    private double Lado1 = 0;
    private double Lado2 = 0;
    private double Lado3 = 0;
    private double AreaTriangulo = 0;
    private double PerimetroTriangulo = 0;
    
        
     public void setLado1(double Lado1){
         this.Lado1 = Lado1;         
     }
     
     public double getLado1(){
         return this.Lado1;         
     }
     
     public void setLado2(double Lado2){
         this.Lado2 = Lado2;         
     }
     
     public double getLado2(){
         return this.Lado2;         
     }
     
     public void setLado3(double Lado3){
         this.Lado3 = Lado3;         
     }
     
     public double getLado3(){
         return this.Lado3;         
     }      
     
     public double getCalcularPerimetro(){
         PerimetroTriangulo = this.Lado1 + this.Lado2 + this.Lado3;
         return PerimetroTriangulo;
     }
     
     public double getCalcularArea(){
         double SubPerimetro = (this.Lado1 + this.Lado2 + this.Lado3)/2;
         double Seccion1 = SubPerimetro - Lado1;
         double Seccion2 = SubPerimetro - Lado2;
         double Seccion3 = SubPerimetro - Lado3;
         double Radical = SubPerimetro * Seccion1 * Seccion2 * Seccion3;
         AreaTriangulo = Math.sqrt(Radical);
         return AreaTriangulo;
     }
}

