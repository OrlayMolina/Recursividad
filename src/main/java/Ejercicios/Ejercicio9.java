package Ejercicios;
/*9. Desarrolle un algoritmo que determine en un arreglo cual el elemento mayor del array
y en que posición esta.
 */
public class Ejercicio9 {

    public static void identificarMayor(int[] array, int valorMayor,int indiceMayor, int indice){

        if(indice >= array.length){
            System.out.println("El valor mayor en el arreglo es: " + valorMayor);
            System.out.println("El indice en donde se encuentra el valor es el indice: " + indiceMayor);
        }else{
            if(array[indice] > valorMayor){
                indiceMayor = indice;
                valorMayor = array[indice];
                identificarMayor(array, valorMayor, indiceMayor ,indice+1);
            }else{
                identificarMayor(array, valorMayor, indiceMayor ,indice+1);
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {1,6,7,8,5,12};
        int indice = 0;
        int indiceMayor = 0;
        int valorMayor = array[indiceMayor];

        identificarMayor(array, valorMayor, indiceMayor, indice);

    }
}
