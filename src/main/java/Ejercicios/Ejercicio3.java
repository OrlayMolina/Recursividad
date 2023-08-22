package Ejercicios;

import javax.swing.*;

public class Ejercicio3 {

    public static void multiplosCuatro(int numero){

        if(numero <= 0){
            System.out.println("");
        }else{
            if(numero % 4 == 0){
                System.out.print(numero + " ");
                multiplosCuatro(numero-1);
            }else{
                multiplosCuatro(numero-1);
            }
        }

    }

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero inicial: "));
        multiplosCuatro(numero);

    }

}
