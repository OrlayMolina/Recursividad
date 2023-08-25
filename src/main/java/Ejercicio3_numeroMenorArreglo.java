public class Ejercicio3_numeroMenorArreglo {

    public static void main(String[] args) {

        int[] vector = {5, 6, 7, 5, 2, 1};
        int indice = 0;
        int resultado = 0;
        resultado = numeroMenorArreglo(vector, indice, vector.length-1);
        System.out.println("El número menor del arreglo es: " + resultado);
    }

    /**
     * 3. Número menor arreglo
     *    El recorrido del arreglo se realiza de inicio a fin. El criterio de parada es cuando inicio y fin son iguales.
     *    Parámetros: vector[] (es el arreglo en el cual se encuentran los elementos), inicio (Es el inicio del arreglo),
     *    fin (Es el fin del arreglo y su valor es el tamaño del arreglo - 1).
     * @param vector
     * @param indice indice inicial
     * @param i indice final
     * @return
     */
    private static int numeroMenorArreglo(int[] vector, int indice, int i) {

        if(i == indice) {
            return 0;
        }else {
            return vector[indice];
        }

    }
}
