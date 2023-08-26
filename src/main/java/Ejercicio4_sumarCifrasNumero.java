public class Ejercicio4_sumarCifrasNumero {

    public static void main(String[] args) {

        int numero = 24;
        int resultado= 0;
        resultado = sumarCifras(numero);
        System.out.println("La suma de las cifras del numero "+ numero + " es: " + resultado);
    }

    /**
     * 4. Suma de cifras
     *    Sume las cifras de un número. Parámetros: int n
     * @param numero
     * @return
     */
    private static int sumarCifras(int numero) {

        if(numero < 10){
            return numero;
        }else {
            int suma = numero % 10;
            return suma + sumarCifras(numero/10);
        }
    }
}
