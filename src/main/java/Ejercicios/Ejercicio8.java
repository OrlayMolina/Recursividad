package Ejercicios;

/* 8. Escribir un método recursivo que reciba un vector y un número entero b; que calcule
la suma de los elementos del array a mayores que b.
 */

public class Ejercicio8 {

    public static int sumaElementosArray(int[] array, int numero, int indice){
            /*0            7*/
        if(indice >= array.length){
            return 0;
              /* 7             10*/
        }if(array[indice] > numero){
            return array[indice] + sumaElementosArray(array, numero, indice+1);
        }
        return sumaElementosArray(array, numero, indice+1);
    }

    public static void main(String[] args) {

        int[] array = {7, 8, 9, 10, 11, 12, 15};
        int n = 10;
        int index = 0;
        System.out.println("la suma de los elementos del array mayores a "+
                n + " es: " + sumaElementosArray(array, n, index));


    }
}
