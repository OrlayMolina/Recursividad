package Ejercicios;

//  14. Recorrer una matriz

public class Ejercicio14 {
    public static void imprimirMatriz(int matriz[][], int x, int y) {

        if (x == matriz.length || y == matriz[x].length) {
            System.out.print(" ");
        } else {
            System.out.print(matriz[x][y] + "  ");
            if (y == matriz[x].length - 1) {
                x++;
                y = 0;
                System.out.println("\n");
            } else {
                y++;
            }
            imprimirMatriz(matriz, x, y);
        }
    }

    public static void main(String[] args) {
        int matriz [][] = {{1, 2, 3}, {4, 5, 6}, {7, 5, 5}};
        imprimirMatriz(matriz, 0, 0);
    }
}
