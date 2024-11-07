package es.santander.ascender.proyecto03;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculadora calc = new Calculadora();
        calc.presentarTablaMultiplicar(8,20);
        int[] tabla = calc.calcularTablaMultiplicar(8, 10);
        //ystem.out.println(tabla);
        int[] arrayOriginal = calc.generarArrayIncremental(99, true);
        int[] arrayRevertido = calc.revertirArrayIncremental(arrayOriginal, true);

        System.out.println(arrayRevertido);
        }
    }

