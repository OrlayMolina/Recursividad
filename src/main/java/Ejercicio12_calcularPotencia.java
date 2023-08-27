import javax.swing.*;

public class Ejercicio12_calcularPotencia {

    public static void main(String[] args) {

        int base = 2;
        int exponente = -3;
        System.out.println("El resultados es: " + calcularPotencia(base, exponente));

    }

    /**
     * 12.  Programar un algoritmo recursivo que permita calcular y retornar cualquier potencia
     *      para cualquier número. Por ejemplo base = 2 potencia = 3
     * @param base
     * @param exponente
     * @return
     */
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


}
