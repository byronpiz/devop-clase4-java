package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswersuma()
    {   
        assertTrue(  App.suma(1,2)==3 );
 
    }
    @Test
    public void shouldAnswer(){
              assertTrue( true );

    }
    @Test
    public void shouldTriangulo(){
              assertEquals("Esto no es un triagulo", App.triangulo(0,0,0) );
              assertEquals("Triangulo Isosceles", App.triangulo(2,2,3) );
              assertEquals("Triangulo Equilatero", App.triangulo(1,1,1) );
    }
    @Test
    public void shouldTrianguloEscaleno(){  
              assertEquals("Triangulo Escaleno", App.triangulo(7,5,6) );
   }
    @Test
    public void shouldTrianguloPitagorico(){
              assertEquals("Triangulo Pitagorico", App.triangulo(3,4,5) );
              assertEquals("Triangulo Pitagorico", App.triangulo(4,5,3) );
              assertEquals("Triangulo Pitagorico", App.triangulo(5,3,4) );     
    }
}
