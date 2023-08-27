public class Ejercicio9_sumarDiagonalMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
                {7,6,7},
                {6,4,7},
                {9,3,4}
        };
        int sumaDiagonal = 0;
        sumaDiagonal = sumarDiagonalPrincipal(matriz, matriz.length-1, matriz[2].length-1);
        System.out.println("El resultado de la suma de la diagonal principal de la matriz es: " + sumaDiagonal);
    }


    /**
     * 9.   Sumar la diagonal de una matriz de forma recursiva.
     * @param matriz
     * @param fila
     * @param columna
     * @return
     */
    private static int sumarDiagonalPrincipal(int[][] matriz, int fila, int columna) {

        if(fila < matriz.length-1 || columna < matriz[fila].length-1){
            return 0;
        }else{
            return matriz[fila][columna] + sumarDiagonalPrincipal(matriz, --fila, --columna);
        }
    }
}
