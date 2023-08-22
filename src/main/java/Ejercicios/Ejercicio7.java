package Ejercicios;

// 7. Determinar cuantos elementos repetidos de un valor hay en un array

public class Ejercicio7 {

    public static int contarElementos(int[] array, int elemento, int index){
        if(index >= array.length){
            return 0;
        } if(array[index] == elemento){
            return 1 + contarElementos(array, elemento, index+1);
        }else {
            return contarElementos(array, elemento, index+1);
        }
    }

    public static void main(String[] args) {

        int[] array = {5, 6, 5, 5, 9, 11};
        int n = 14;
        System.out.println(contarElementos(array, n, 0));


    }
}
