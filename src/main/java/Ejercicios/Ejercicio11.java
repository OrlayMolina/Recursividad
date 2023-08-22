package Ejercicios;

/*Escribir un método recursivo que implemente el algoritmo para determinar si una palabra o
frase es palíndroma o no.*/

import javax.swing.*;

public class Ejercicio11 {

    public static void validarPalindromo(String palabra, int indice){

        if(palabra.equals(imprimirInvertida(palabra, indice))){
            System.out.println("La palabra es un palindromo");
        }else{
            System.out.println("La palabra no es un palindromo");
        }

    }

    public static String imprimirInvertida(String palabra, int  indice){

        if (indice < 0){
            return "";
        }else{
            return palabra.charAt(indice)+imprimirInvertida(palabra, indice-1);
        }
    }

    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingrese la palabra: ");
        validarPalindromo(palabra, palabra.length()-1);

    }

}
