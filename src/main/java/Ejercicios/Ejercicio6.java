package Ejercicios;


// 6. Hallar la cantidad de cifras de un número entero

public class Ejercicio6 {

    public static int contarCifras(int numero){

        if(numero <= 0){
            return 0;
        }else {
            return 1 + contarCifras(numero/10);
        }

    }

    public static void main(String[] args) {

        int numero = 45000;
        System.out.println(contarCifras(numero));
    }

}
