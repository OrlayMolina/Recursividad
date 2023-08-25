public class Ejercicio1_numeroDigitos {

    public static void main(String[] args) {
        int n = 123456;
        int resultado = 0;
        resultado = calcularCifras(n);
        System.out.println("El resultados: " + resultado);
    }

    private static int calcularCifras(int n) {

        if(n < 10){
            return 1;
        }else {
            n = n/10;
            return calcularCifras(n)+1;
        }
    }
}
