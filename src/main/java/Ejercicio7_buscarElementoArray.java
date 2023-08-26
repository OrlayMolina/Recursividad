import java.util.ArrayList;

public class Ejercicio7_buscarElementoArray {

    public static void main(String[] args) {
        
        int[] array = {5,7,2,5,7};
        int inicial = 0;
        int numeroBuscado = 7;
        ArrayList<Integer> posiciones = new ArrayList<>();
        ArrayList<Integer> resultado = buscarElemento(array, inicial, array.length-1, numeroBuscado, posiciones);
        System.out.print("La(s) posición(es) del array en donde se encuentra el numero "+ numeroBuscado + " son: " );
        imprimirRecursivo(resultado, inicial, resultado.size()-1);

    }

    /**
     * 7. Buscar un elemento en un array de forma recursiva.
     * @param array
     * @param inicial
     * @param fin
     * @param numeroBuscado
     * @param posiciones
     * @return
     */
    private static ArrayList<Integer> buscarElemento(int[] array, int inicial, int fin, int numeroBuscado, ArrayList<Integer> posiciones) {

        if(inicial > fin){
            return posiciones;
        }else {
            if(array[inicial] == numeroBuscado){
                posiciones.add(inicial);
                return buscarElemento(array, inicial+1, fin, numeroBuscado,posiciones);
            }else {
                return buscarElemento(array, inicial+1, fin, numeroBuscado, posiciones);
            }
        }
    }

    /**
     * Método auxiliar para solucionar el ejercicio
     * @param posiciones
     * @param inicial
     * @param fin
     */
    public static void imprimirRecursivo(ArrayList<Integer> posiciones, int inicial, int fin){

        if(inicial == fin){
            System.out.print(posiciones.get(inicial));
        }else{
            System.out.print(posiciones.get(inicial) + " , ");
            imprimirRecursivo(posiciones, inicial+1, fin);

        }

    }
}
