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
        System.out.println(tabla);
    }
}
