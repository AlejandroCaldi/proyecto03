package es.santander.ascender.proyecto03;


import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    @Test
    public void testSumar() {
        Calculadora cut = new Calculadora();

        long prueba = cut.sumar(15,20);
        
        assertTrue(prueba==35);
    } 

    @Test
    public void testRestar() {
        Calculadora cut = new Calculadora();

        long prueba = cut.restar(15,20);
        
        assertTrue(prueba==-5);
    } 
     

    @Test
    public void testMultiplicar() {
        Calculadora cut = new Calculadora();

        long prueba = cut.multiplicar(15,20);
        
        assertTrue(prueba==300);
    } 
     
    @Test
    public void testDividir() {
        Calculadora cut = new Calculadora();

        double prueba = cut.dividir(15,20);
        System.out.println(prueba);
        assertTrue(prueba==0.75);
    } 

}
