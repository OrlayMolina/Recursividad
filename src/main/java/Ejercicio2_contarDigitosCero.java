public class Ejercicio2_contarDigitosCero {

    public static void main(String[] args) {
        int[] arreglo = {2,0,0,6,0};
        int indice = 0;
        int resultado = 0;
        resultado = contarDigitosCero(arreglo, indice);
        System.out.println("Hay "+ resultado + " ceros en el arreglo.");
    }

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
