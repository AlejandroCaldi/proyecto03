package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private final Calculadora cut = new Calculadora();

    @Test
    public void testSumar() {
        long esperado = 35;
        long prueba = cut.sumar(15, 20);
        assertEquals(esperado, prueba, "Debe dar " + esperado + " pero da " + prueba);
    }

    @Test
    public void testRestar() {
        long esperado = -5;
        long prueba = cut.restar(15, 20);
        assertEquals(esperado, prueba, "Debe dar " + esperado + " pero da " + prueba);
    }

    @Test
    public void testMultiplicar() {
        long esperado = 300;
        long prueba = cut.multiplicar(15, 20);
        assertEquals(esperado, prueba, "Debe dar " + esperado + "pero da " + prueba);
    }

    @Test
    public void testDividir() {
        double esperado = 0.75;
        double prueba = cut.dividir(15, 20);
        assertEquals(esperado, prueba, "Debe dar " + esperado + "pero da " + prueba);
    }

    @Test
    public void testDividirCero() {
        try {
            double esperado = 0;
            double prueba = cut.dividir(15, 0);
            // fail("Es imposible que el código pase por aquí");
            assertEquals(esperado, prueba, "Debe dar " + esperado + "pero da " + prueba);

        } catch (Exception e) {
            System.out.println("Error: " + e);

        }

    }

    @Test
    public void testPresentarTablaMultiplicar() {
        int esperado = 1200;
        int prueba = cut.presentarTablaMultiplicar(6, 200);
        assertEquals(esperado, prueba, "Debe dar " + esperado + "pero da " + prueba);

    }
}
