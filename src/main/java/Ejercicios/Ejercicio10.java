package Ejercicios;

/*Calcula la potencia de un numero de forma recursiva, tanto para exponentes
negativos como positivos.*/

import javax.swing.*;

public class Ejercicio10 {

    public static float calcularPotencia(int base, int exponente){

        if(exponente == 0){
            return 1;
        }else if (base == 0){
            return 0;
        }else if(exponente < 0){
            return 1 / (base * calcularPotencia(base, -exponente-1));
        }else{
            return base * calcularPotencia(base, exponente - 1);
        }

    }

    public static void main(String[] args) {

        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base que desea calcular: "));
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));
        System.out.println("El resultados es: " + calcularPotencia(base, exponente));

    }
}
