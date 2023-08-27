public class Ejercicio8_RecorrerMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3},
                {8,4,3},
                {5,6,8}
        };
        imprimirMatrizRecursiva(matriz, 0, 0);
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
