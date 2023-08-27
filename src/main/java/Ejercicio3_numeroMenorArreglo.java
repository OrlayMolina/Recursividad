public class Ejercicio3_numeroMenorArreglo {

    public static void main(String[] args) {

        int[] vector = {8, 5, 5, 6, 2, 7};
        int indice = 0;
        int resultado = 0;
        resultado = numeroMenorArreglo(vector, indice, vector.length-1);
        System.out.println("El número menor del arreglo es: " + resultado);
    }

    // CORREGIR
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

        if( indice == i) {
            return vector[indice];
        }else {
            if (vector[indice] < vector[indice + 1]) {
                return vector[indice];
            } else {
                return numeroMenorArreglo(vector, indice + 1, i);
            }
        }

    }
}
