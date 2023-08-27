public class Ejercicio29_determinarMayorArrayRetrocediendo {

    public static void main(String[] args) {

        int[] vector = {8, 5, 5, 16, 2, 7, 12, 7, 6, 9};
        int indice = 0;
        int resultado = 0;
        resultado = numeroMayorArreglo(vector, 0,vector.length-1);
        System.out.println("El número mayor del arreglo es: " + resultado);
    }

    /**
     * 29. Algoritmo recursivo que retorne el mayor de un arreglo de 10 elementos.
     *     Recorrido de derecha a izquierda. Parámetros: (arreglo, mayor, indice)
     * @param vector
     * @param mayor indice inicial
     * @param indice indice final
     * @return
     */
    private static int numeroMayorArreglo(int[] vector, int mayor, int indice) {

        if( indice < 0) {
            return mayor;
        }else {
            if (vector[indice] > mayor) {
                return numeroMayorArreglo(vector, vector[indice], --indice);
            } else {
                return numeroMayorArreglo(vector, mayor, --indice);
            }
        }

    }
}
