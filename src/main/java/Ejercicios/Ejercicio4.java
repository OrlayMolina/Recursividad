package Ejercicios;

import javax.swing.*;


// 4. Imprimir números pares

public class Ejercicio4 {

    public static void imprimirNumerosPares(int inicial, int finall){

        if(inicial > finall){
            System.out.println("");
        }else{
            if(inicial % 2 == 0){
                System.out.println(inicial);
                imprimirNumerosPares(inicial+1, finall);
            }else{
                imprimirNumerosPares(inicial+1, finall);
            }
        }
    }

    public static void main(String[] args) {
        int ini = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero inicial: "));
        int fin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero final: "));

        imprimirNumerosPares(ini, fin);
    }
}
