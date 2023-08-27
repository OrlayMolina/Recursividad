import java.util.ArrayList;

public class Ejercicio17_filaMayorMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
                {1,6,4,5},
                {5,5,9,8},
                {7,9,3,4},
                {4,6,9,7}
        };
        ArrayList<Integer> sumatoriasFilas = new ArrayList<Integer>();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int sumaFila = 0;
        lista = determinarFilaMayor(matriz, 0, sumatoriasFilas);
        sumaFila = filaMayorLista(lista, 0, lista.size()-1);
        System.out.println("La fila cuya sumatoria es mayor dentro de la matriz es la fila " + sumaFila);

    }

    /**
     * 17. Retornar el número de la fila de la matriz cuya suma de todos sus elementos sea mayor.
     * @param matriz
     * @param fila
     * @param sumatorias
     * @return
     */
    private static ArrayList<Integer> determinarFilaMayor(int[][] matriz, int fila, ArrayList<Integer> sumatorias) {
        if (fila > matriz.length - 1) {
            return sumatorias;
        } else {
            int sumaFila = sumarFilaRecursivamente(matriz, fila, 0, 0);
            sumatorias.add(sumaFila);
            return determinarFilaMayor(matriz, fila + 1, sumatorias);
        }
    }

    /**
     * Método auxiliar para sumar una sola fila de la amtriz antes de hacer el .add()
     * @param matriz
     * @param fila
     * @param columna
     * @param sumaFila
     * @return
     */
    private static int sumarFilaRecursivamente(int[][] matriz, int fila, int columna, int sumaFila) {
        if (columna < matriz[fila].length) {
            sumaFila += matriz[fila][columna];
            return sumarFilaRecursivamente(matriz, fila, columna + 1, sumaFila);
        } else {
            return sumaFila;
        }
    }


    /** CORREGIR
     * Método auxiliar para tomar la fila con la mayor sumatoria
     * @param posiciones
     * @param inicial
     * @param fin
     */
    public static int filaMayorLista(ArrayList<Integer> posiciones, int inicial, int fin){

        if(inicial == fin){
            return inicial;
        }else {
            return inicial;
        }

    }

}
