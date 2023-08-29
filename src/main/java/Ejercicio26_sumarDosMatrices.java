public class Ejercicio26_sumarDosMatrices {

    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3},
                {8,4,3},
                {5,6,8}
        };
        int[][] matriz2 = {
                {1,6,5},
                {3,4,5},
                {8,1,9}
        };
        int[][] matrizRespuesta;
        matrizRespuesta = sumarMatrizRecursiva(matriz, matriz2,0,0);
        imprimirMatrizRecursiva(matrizRespuesta, 0, 0);
    }

    /**
     * 26.  Sumar dos matrices.
     * @param matriz
     * @param matriz2
     * @param fila
     * @param columna
     * @return
     */
    private static int[][] sumarMatrizRecursiva(int[][] matriz, int[][] matriz2, int fila, int columna) {
        if(fila > matriz.length-1 || columna > matriz[columna].length-1){
            return matriz;
        }else{
            matriz[fila][columna] += matriz2[fila][columna];
            if(columna == matriz[columna].length-1){
                //siguiente fila
                ++fila;
                //Reinicio columna
                columna = 0;
                return sumarMatrizRecursiva(matriz,matriz2,fila,columna);
            }else{
                ++columna;
                return sumarMatrizRecursiva(matriz,matriz2,fila,columna);
            }

        }
    }

    /**
     * 8.   Recorrer una matriz de forma recursiva.
     * @param matriz
     * @param fila
     * @param columna
     */
    private static void imprimirMatrizRecursiva(int[][] matriz, int fila, int columna) {
        //fila - columna
        if(fila > matriz.length-1 || columna > matriz[columna].length-1){
            System.out.print("");
        }else{
            System.out.print(matriz[fila][columna] + " ");
            if(columna == matriz[columna].length-1){
                //siguiente fila
                ++fila;
                //Reinicio columna
                columna = 0;
                //salto de linea
                System.out.println("");
            }else{
                ++columna;
            }
            imprimirMatrizRecursiva(matriz, fila, columna);
        }
    }
}
