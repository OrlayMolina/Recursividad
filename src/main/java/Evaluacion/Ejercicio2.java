package Evaluacion;

    // 2. Determinar el promedio de la diagonal principal de una matriz (En dos funciones)

public class Ejercicio2 {


    public static int sumaDiagonal(int[][]matriz, int fila, int columna){
        if(fila <= matriz.length-1)
            if(columna <= matriz[fila].length-1)
                if(fila == columna){
                    return matriz[fila][columna] + sumaDiagonal(matriz, fila+1, columna+1);
                }else {
                    return 0;
                }
        return 0;
    }

    public static float promedioDiagonal(int[][]matriz, int fila, int columna){
        float promedio = (float)sumaDiagonal(matriz, fila, columna)/ matriz.length;
        return promedio;
    }

    public static void main( String[] args ) {
        int fila = 0;
        int columna = 0;
        int[][] matriz = {
                {3,9,12,4},
                {4,6,10,12},
                {4,7,12,11},
                {5,7,9,14}
        };
        System.out.println("El promedio es: " + promedioDiagonal(matriz, fila, columna));
    }
}
