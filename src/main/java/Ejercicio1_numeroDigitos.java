public class Ejercicio1_numeroDigitos {

    public static void main(String[] args) {
        int n = 123456;
        int resultado = 0;
        resultado = calcularCifras(n);
        System.out.println("El resultados: " + resultado);
    }

    /**
     *  1. Cantidad de cifras de un número:
     *     Hallar la cantidad de cifras de un número entero. Parámetro: n (número entero)
     * @param n número
     * @return
     */
    private static int calcularCifras(int n) {

        if(n < 10){
            return 1;
        }else {
            n = n/10;
            return calcularCifras(n)+1;
        }
    }
}
