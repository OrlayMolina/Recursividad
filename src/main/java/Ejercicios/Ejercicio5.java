package Ejercicios;

// 5. Escribir un método recursivo, para calcular el número de vocales de una cadena.

public class Ejercicio5 {

    public static int contarVocales(String palabra, int index){
            /*0           24*/
        if(index >= palabra.length()){
            return 0;
        }else{
            if(palabra.charAt(index) == 'a' || palabra.charAt(index) == 'e' ||
                    palabra.charAt(index) == 'i' || palabra.charAt(index) == 'o' || palabra.charAt(index) == 'u' ||
                    palabra.charAt(index) == 'A' || palabra.charAt(index) == 'E' || palabra.charAt(index) == 'I' ||
                    palabra.charAt(index) == 'O' || palabra.charAt(index) == 'U' ){
                return 1 + contarVocales(palabra, index+1);
            } else {
                return 0 + contarVocales(palabra, index+1);
            }
        }


    }

    public static void main(String[] args) {

        String palabra = "Universidad del Quindio";
        int index = 0;
        System.out.println(contarVocales(palabra, index));

    }

}
