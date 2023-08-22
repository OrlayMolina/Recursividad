package Ejercicios;

public class Ejercicio1 {

    // 1. Ejercicio de recursividad para imprimir los números de forma ascendente de n a n.

    public static void imprimirRecursivo(int numeroInicial, int numeroFinal){

        if(numeroInicial == numeroFinal){
            System.out.println(numeroFinal);
        }else{
            System.out.println(numeroInicial);
            imprimirRecursivo(numeroInicial+1, numeroFinal);

        }

    }

    public static void main(String[] args) {

        int n1 =5;
        int n2 =15;
        imprimirRecursivo(n1, n2);

    }
}
