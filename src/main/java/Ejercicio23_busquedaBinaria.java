
/*
    La búsqueda binaria implica que un array esté ordenado, y el algoritmo consiste
    en dividir el array por su elemento medio en dos subarrays más pequeños, y comparar
    el elemento con el del centro. Si coinciden, la búsqueda se termina. Si el elemento
    es menor, debe estar (si está) en el primer subarray, y si es mayor está en el segundo.
    Escriba un método recursivo de búsqueda binaria.
 */
public class Ejercicio23_busquedaBinaria {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10, 12, 14};

        System.out.println("Indices");
        creacionArray(array);
    }

    /**
     * Método auxiliar que permite identificar sí la cantidad de elementos que hay
     * en el array es par o impar.
     * @param array
     * @return
     */
    public static boolean arrayPar(int[] array){
        if(array.length % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void creacionArray(int[] array){
        if(arrayPar(array)){
            int indices = (array.length-1)/2;
            int[] array1;
            int[] array2;
        }
    }
}
