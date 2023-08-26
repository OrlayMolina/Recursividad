public class Ejercicio5_numeroApariciones {

    public static void main(String[] args) {
        int[] array = {5, 6, 7, 5, 1, 5};
        int indexInicio = 0;
        int resultado = 0;
        int numeroBuscado = 5;
        resultado = numeroApariciones(array, indexInicio, array.length - 1, numeroBuscado);
        System.out.println("El número "+ numeroBuscado + " aparece " + resultado + " veces en el array.");

    }

    /**
     * 5 .Recorra el arreglo desde la primera posición hasta la última posición y retorne el número de veces
     *    que se repite el elemento.  Parámetros: vector[] (arreglo en el cual se encuentran los elementos),
     *    inicio (es el inicio del vector), fin (es el fin del vector), elem (es el número a buscar dentro del arreglo)
     * @param array
     * @param indexInicio
     * @param fin
     * @param numeroBuscado
     * @return
     */
    private static int numeroApariciones(int[] array, int indexInicio, int fin, int numeroBuscado) {

        if(indexInicio > fin){
            return 0;
        }else {
            if(array[indexInicio] == numeroBuscado){
                return 1 + numeroApariciones(array, ++indexInicio, fin, numeroBuscado);
            }else {
                return numeroApariciones(array, ++indexInicio, fin, numeroBuscado);
            }
        }
    }
}
