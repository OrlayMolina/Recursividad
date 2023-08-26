public class Ejercicio6_recorrerArray {

    public static void main(String[] args) {

        int[] array = {4,2,3,4,9};
        int indiceInicial = 0;
        imprimirRecursivo(array, indiceInicial, array.length-1);

    }

    /**
     * 6. Recorrer un array de forma recursiva
     * @param array
     * @param inicial
     * @param fin
     */
    public static void imprimirRecursivo(int[] array, int inicial, int fin){

        if(inicial == fin){
            System.out.print(array[inicial]);
        }else{
            System.out.print(array[inicial]+ " , ");
            imprimirRecursivo(array, inicial+1, fin);

        }

    }

}
