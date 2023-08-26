public class Ejercicio7_buscarElementoArray {

    public static void main(String[] args) {
        
        int[] array = {5,6,7,12,3};
        int inicial = 0;
        int numeroBuscado = 7;
        int resultado = 0;
        resultado = buscarElemento(array, inicial, array.length-1, numeroBuscado);
        System.out.println("El numero "+numeroBuscado + " esta en la posición  " + resultado + " del array.");
    }

    private static int buscarElemento(int[] array, int inicial, int i, int numeroBuscado) {
    }
}
