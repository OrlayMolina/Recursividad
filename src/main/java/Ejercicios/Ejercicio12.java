package Ejercicios;

// Determinar si un número es primo.

import javax.swing.*;

public class Ejercicio12 {

    public static boolean validarPrimo(int numero, int indice){

        if(numero < 3){
            return true;
        }else if(indice < 2){
            return true;
        }else if(numero % indice == 0){
            return false;
        }else{
            return validarPrimo(numero, indice-1);
        }

    }

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a validar: " ));
        if (validarPrimo(numero,numero-1))
            System.out.println("El número es primo.");
        else
            System.out.println("El número no es primo");
    }

}
