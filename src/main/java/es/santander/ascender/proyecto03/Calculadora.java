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
    }

}
