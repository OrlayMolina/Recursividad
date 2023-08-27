import javax.swing.*;

public class Ejercicio27_numeroPerfecto {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a validar: "));
        if(determinarPerfecto(numero))
            System.out.println("El número es perfecto.");
        else
            System.out.println("El número no es perfecto.");
    }

    /**
     * 27.  Haga un programa que diga si un número es o no perfecto. Un número N es perfecto
     *      si la suma de sus divisores (excluido el propio N) es N. por ejemplo 28 es perfecto,
     *      pues sus divisores  (excluido el 28) son 1,2,4,7 y 14 su suma da 28.
     * @param numero
     * @return
     */
    public static boolean determinarPerfecto(int  numero) {
        int divisor = 1;
        int sumatoria =sumaDivisores(numero, divisor);
        if( sumatoria == numero ) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método auxiliar para poder obtener la suma de los divisores de un número
     * @param numero
     * @param divisor
     * @return
     */
    public static int sumaDivisores(int numero, int divisor) {
        if (divisor > (numero/2)){
            return 0;
        }else{
            if(numero % divisor == 0){
                return divisor + sumaDivisores(numero, divisor+1);
            }else{
                return 0 + sumaDivisores(numero, divisor+1);
            }
        }

    }

}
