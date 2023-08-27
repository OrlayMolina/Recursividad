public class Ejercicio10_invertirPalabra {

    public static void main(String[] args) {

        String palabra = "aditrevnI arbalaP";
        imprimirInvertidaRecursivo(palabra, palabra.length()-1);
    }

    /**
     * 10.  Invertir una palabra de forma recursiva
     * @param palabra
     * @param indice
     */
    private static void imprimirInvertidaRecursivo(String palabra, int indice) {

        if (indice < 0){
            System.out.println("");
        }else{

            System.out.print(palabra.charAt(indice));
            imprimirInvertidaRecursivo(palabra, indice-1);
        }
    }
}
