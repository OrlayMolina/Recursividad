import java.util.ArrayList;

public class Ejercicio20_ordenarArrayDescendente {

    public static void main(String[] args) {
        
        int[] array = {4,10,8,2,6,7};
        int inicio = 0;
        int menor = 20000;
        ordenarDescendente(array, menor, inicio);
        System.out.println("La lista ordenada es la siguiente: ");
        imprimirRecursivo(ordenarDescendente(array, inicio, menor), 0, array.length-1);
        
    }

    private static int[] ordenarDescendente(int[] array, int menor, int indice) {
        if (indice == array.length) {
            return array;
        } else {
            if (array[indice] <= menor) {
                return ordenarDescendente(array, array[indice], ++indice);
            } else {
                int auxiliar = array[indice];
                array[indice] = menor;
                menor = auxiliar;
                return ordenarDescendente(array, menor, ++indice);
            }
        }
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
