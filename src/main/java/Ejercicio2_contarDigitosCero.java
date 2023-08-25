public class Ejercicio2_contarDigitosCero {

    public static void main(String[] args) {
        int[] arreglo = {0,0,0,6,0,0};
        int indice = 0;
        int resultado = 0;
        resultado = contarDigitosCero(arreglo, indice);
        System.out.println("Hay "+ resultado + " ceros en el arreglo.");
    }

    /**
     * 2. Contar ceros arreglo
     *    Contar la cantidad de ceros que se encuentran dentro de un arreglo unidimensional de enteros.
     *    Parámetros: int arreglo[], int n
     * @param arreglo
     * @param n número
     * @return
     */
    private static int contarDigitosCero(int[] arreglo, int n) {
        if(n > arreglo.length-1){
            return 0;
        }else {
            if( arreglo[n] == 0){
                return contarDigitosCero(arreglo, n+1) + 1;
            } else{
                return contarDigitosCero(arreglo, n+1);
            }
        }
        
    }
}
