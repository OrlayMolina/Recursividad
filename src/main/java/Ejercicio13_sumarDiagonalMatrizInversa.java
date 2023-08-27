public class Ejercicio13_sumarDiagonalMatrizInversa {

    public static void main(String[] args) {
        int[][] matriz = {
                {7,6,7},
                {6,4,7},
                {9,3,4}
        };
        int sumaDiagonal = 0;
        sumaDiagonal = sumarDiagonalPrincipal(matriz, 0, 0);
            System.out.println("El resultado de la suma de la diagonal principal de la matriz es: " + sumaDiagonal);
    }

    // CORREGIR
    /**
     * 13.  Programar un algoritmo recursivo que permita sumar la diagonal principal de una matriz.
     *      Filas y columnas avanzando.
     *      Parámetros( matriz, i, j)
     * @param matriz
     * @param fila
     * @param columna
     * @return
     */
    private static int sumarDiagonalPrincipal(int[][] matriz, int fila, int columna) {

        if(fila > matriz.length-1 || columna > matriz[fila].length-1){
            return 0;
        }else{
            return matriz[fila][columna] + sumarDiagonalPrincipal(matriz, ++fila, ++columna);
        }
    }
}
