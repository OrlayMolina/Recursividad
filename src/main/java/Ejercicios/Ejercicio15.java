package Ejercicios;

import javax.swing.*;

/*Escribir un método recursivo que implemente el algoritmo para determinar si una palabra o
frase es palíndroma o no. En una sola función.*/

public class Ejercicio15 {

    public static boolean validarPalindromo(String palabra, int indiceInicial, int indiceFinal) {

        if (indiceInicial >= indiceFinal) {
            return true;
        }

        if (palabra.charAt(indiceInicial) == palabra.charAt(indiceFinal)) {
            return validarPalindromo(palabra, indiceInicial + 1, indiceFinal - 1);
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingrese una frase: ");
        int indiceInicial = 0;
        if(validarPalindromo(palabra, indiceInicial,palabra.length()-1)){
            System.out.println("La frase es palindromo");
        }else{
            System.out.println("La frase no es un palindromo");
        }
    }
}
