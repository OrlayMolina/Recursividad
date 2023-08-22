package Evaluacion;

    // 3. Determinar si una matriz es simetrica o no

public class Ejercicio3 {

    public static boolean validarMatrizSimetrica(int[][]matriz, int fila, int columna){

        if (fila >= matriz.length) {
            return true;
        }else if (columna >= matriz[fila].length) {
            return validarMatrizSimetrica(matriz, fila + 1, 0);
        }else if (matriz[fila][columna] == matriz[columna][fila]) {
            return validarMatrizSimetrica(matriz, fila, columna + 1);
        } else {
            return false;
        }
    }

    public static void main( String[] args ) {
        int fila = 0;
        int columna = 0;
        int[][] matriz = {
                {3,4,12,5},
                {4,6,10,7},
                {12,10,12,9},
                {5,7,9,14}
        };
        if(validarMatrizSimetrica(matriz, fila, columna))
            System.out.println("La matriz es simetrica.");
        else
            System.out.println("La matriz no es simetrica.");
    }
}
