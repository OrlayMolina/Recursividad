public class Ejercicio16_determinarMatrizSimetrica {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 1, 2, 4},
                {1, 4, 5, 6},
                {2, 5, 8, 2},
                {4, 6, 2, 8}
        };
        boolean simetrica = false;
        simetrica = determinarSimetrica(matriz, 0, 0);
        if (simetrica) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }

    /**
     * 16.  Determinar si una matriz es o no simétrica (es cuadrada y sus elementos por encima
     *      de la diagonal son iguales a los elementos de por debajo en forma de espejo)
     *
     * @param matriz
     * @param fila
     * @param columna
     */
    private static boolean determinarSimetrica(int[][] matriz, int fila, int columna) {
        if (fila > matriz.length - 1) {
            return true;
        } else if (columna > matriz[fila].length - 1) {
            return determinarSimetrica(matriz, ++fila, 0);
        } else {
            if (matriz[fila][columna] != matriz[columna][fila]) {
                return false;
            }
            return determinarSimetrica(matriz, fila, ++columna);
        }

    }
}