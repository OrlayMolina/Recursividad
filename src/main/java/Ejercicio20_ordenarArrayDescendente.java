import java.util.ArrayList;

public class Ejercicio20_ordenarArrayDescendente {

    public static void main(String[] args) {
        
        int[] array = {4,10,8,2,6,7};
        int inicio = 0;
        ordenarDescendente(array, inicio);
        System.out.println("La lista ordenada es la siguiente: ");
        imprimirRecursivo(ordenarDescendente(array, inicio), 0, array.length-1);
        
    }

    /**
     * 20. Ordenar un array de forma descendente recursivamente.
     * @param array
     * @param indice
     * @return
     */
    private static int[] ordenarDescendente(int[] array, int indice) {
        if (indice == array.length - 1) {
            return array;
        } else if (array[indice] < array[indice + 1]) {
            int auxiliar = array[indice];
            array[indice] = array[indice + 1];
            array[indice + 1] = auxiliar;
            if (indice > 0) {
                return ordenarDescendente(array, --indice);
            }
        }
        return ordenarDescendente(array, ++indice);
    }


    /**
     * Método auxiliar para solucionar el ejercicio
     * @param posiciones
     * @param inicial
     * @param fin
     */
    public static void imprimirRecursivo(int[] posiciones, int inicial, int fin){

        if(inicial == fin){
            System.out.print(posiciones[inicial]);
        }else{
            System.out.print(posiciones[inicial] + " , ");
            imprimirRecursivo(posiciones, inicial+1, fin);

        }

    }
}
