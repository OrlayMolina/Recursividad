package Evaluacion;

    // 1. Determinar numero perfecto

import javax.swing.*;

public class Ejercicio1 {

    public static boolean validarPerfecto(int  numero) {
        int divisor = 1;
        int sumatoria = sumatoriaDivisores(numero, divisor);
        if( sumatoria == numero ) {
            return true;
        }else{
            return false;
        }
    }

    public static int sumatoriaDivisores(int numero, int divisor) {
        if (divisor > (numero/2)){
            return 0;
        }else{
            if(numero % divisor == 0){
                return divisor + sumatoriaDivisores(numero, divisor+1);
            }else{
                return 0 + sumatoriaDivisores(numero, divisor+1);
            }
        }

    }

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a validar: "));
        if(validarPerfecto(numero))
            System.out.println("El número es perfecto.");
        else
            System.out.println("El número no es perfecto.");
    }
}
