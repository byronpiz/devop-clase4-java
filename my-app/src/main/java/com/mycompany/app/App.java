package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static  void main( String[] args )
    {
        System.out.println( "Hello byron!" );
    }
  public static int suma(int a,int b){
    return a+b;
  }
   public static String triangulo(int a,int b,int c){
     if(a+b>c&&b+c>a&&a+c>b){   
      if(c==b&&b==a){
        return "Triangulo Equilatero";
      }
      if(c==b||b==a||c==a){
        return "Triangulo Isosceles";
      }
       if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
         return "Triangulo Pitagorico";
       }
       return  "Triangulo Escaleno";
     }
    return "Esto no es un triagulo";
     
  }
}
