public class Ejercicio11_sumarElementosMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {8,4,3},
                {5,6,8}
        };
        int resultado = 0;
        resultado = sumaMatrizRecursiva(matriz, 0, 0);
        System.out.println("La sumatoria de los elementos de la matriz es: " + resultado);
    }

    /**
     * 11.   Programar un algoritmo recursivo que permita sumar los elementos de una matriz.
     *       El recorrido tiene que ser retrocediendo en columnas y avanzando en las filas.
     *       Parámetros( matriz, i, j).
     * @param matriz
     * @param fila
     * @param columna
     */
    private static int sumaMatrizRecursiva(int[][] matriz, int fila, int columna) {
        if (fila > matriz.length - 1) {
            return 0;
        } else if (columna > matriz[fila].length - 1) {

            return sumaMatrizRecursiva(matriz, fila + 1, 0);
        } else {

            return matriz[fila][columna] + sumaMatrizRecursiva(matriz, fila, columna + 1);
        }
    }
}
