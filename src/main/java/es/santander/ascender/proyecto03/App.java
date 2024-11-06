package es.santander.ascender.proyecto03;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(15, 20);
        System.out.println(resultado);
        calc.presentarTablaMultiplicar(8,20);
    }
}
