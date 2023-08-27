import java.util.ArrayList;

public class Ejercicio14_numeroVecesElementoArray {

    public static void main(String[] args) {

        int[] array = {7,7,2,5,7};
        int inicial = 0;
        int numeroBuscado = 7;
        int resultado = 0;
        resultado = buscarElemento(array.length-1 , array, numeroBuscado, inicial);
        System.out.print("La cantidad de veces que el elemonto buscado esta en el array son: "  + resultado);

    }

    /**
     * 14.  Dado un vector de n enteros, el problema a resolver recursivamente consiste en contar
     *      el número  de veces que un valor dado aparece en dicho vector:
     * @param tamanio
     * @param array
     * @param numeroBuscado
     * @param inicio
     * @return
     */
    private static int buscarElemento(int tamanio, int[] array, int numeroBuscado, int inicio) {

        if(inicio > tamanio){
            return 0;
        }else {
            if(array[inicio] == numeroBuscado){
                return 1 + buscarElemento(tamanio, array, numeroBuscado, inicio+1);
            }else {
                return buscarElemento(tamanio, array, numeroBuscado, inicio+1);
            }
        }
    }

}
