package es.santander.ascender.proyecto03;

public class Calculadora {
    public long sumar(long sumando1, long sumando2) {

        return sumando1 + sumando2;
    }

    public long restar(long restando, long minuendo) {

        return restando - minuendo;
    }

    public long multiplicar(long factor1, long factor2) {

        return factor1 * factor2;
    }

    public double dividir(long dividendo, long divisor) {

        if (divisor != 0) {

            return (double) dividendo / divisor;
        }

        return 0d;

        // try {
        // return (double) dividendo / divisor;
        // } catch (Exception e) {
        // System.out.println("Error . No se puede dividir por cero.");
        // }

    }

    public int presentarTablaMultiplicar(int numero, int limite) {

        int ultimoValor = 0;

        for (int i = 0; i <= limite; i++) {

            ultimoValor = numero*i;
            System.out.println(numero + " x " + i + " = " + ultimoValor);

        }

        return ultimoValor; // a los efectos de test

    }

    public int[] calcularTablaMultiplicar(int numero, int limite) {

        int[] resultados = new int[limite+1];

        for (int i = 0; i <= limite; i++) {

            int ultimoValor = numero*i;
            System.out.println(numero + " x " + i + " = " + ultimoValor);
            resultados[i] = ultimoValor;

        }

        return resultados;
    }

}
