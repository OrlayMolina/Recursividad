package Ejercicios;

public class Ejercicio2 {

    // 2. Imprimir palabra invertida con recursividad

    public static void imprimirInvertida(String palabra, int  indice){

        if (indice < 0){
            System.out.println("");
        }else{

            System.out.print(palabra.charAt(indice));
            imprimirInvertida(palabra, indice-1);
        }

    }

    public static void main(String[] args) {

        String palabra = "lanesrA y oírf ohcep aissuroB";
        imprimirInvertida(palabra, palabra.length()-1);

    }

}
