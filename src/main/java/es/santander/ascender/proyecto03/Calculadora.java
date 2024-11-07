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

    public int[] generarArrayIncremental(int valorMaximo, boolean imprimir) {

        int[] arrayGenerado = new int[valorMaximo+1];
        
        for (int i=0;i<=arrayGenerado.length-1;i++) {
            arrayGenerado[i] = i;
        }

        if (imprimir) {

            imprimirArray(arrayGenerado);
        }

        return arrayGenerado;

    }

    public int[] revertirArrayIncremental(int[] arrayInicial, boolean imprimir) {

        int[] arrayNuevo = new int[arrayInicial.length];

        int j = arrayInicial.length;
        for(int i = 0; i<=arrayInicial.length-1;i++) {

            arrayNuevo[i] = j - i;
        }

        if (imprimir) {

            imprimirArray(arrayNuevo);
        }

        return arrayNuevo;
    }

        public void imprimirArray(int[] arrayImprimir) {

            System.out.println("\n");
            System.out.print("[");
            for(int i=0; i<=arrayImprimir.length-1;i++) {

                if (i<arrayImprimir.length-1) {
                    System.out.print(arrayImprimir[i] + ",");
                } else {
                    System.out.print(arrayImprimir[i]);
                }

            }
            System.out.print("]");
            System.out.println("\n");
        }

}
