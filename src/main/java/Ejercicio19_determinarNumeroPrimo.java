public class Ejercicio19_determinarNumeroPrimo {

    public static void main(String[] args) {

        int numero = 29;
        if (validarPrimoRecursivo(numero,--numero))
            System.out.println("El número es primo.");
        else
            System.out.println("El número no es primo");
    }

    /**
     * 19. Determinar si un número es primo.
     * @param numero
     * @param indice
     * @return
     */
    public static boolean validarPrimoRecursivo(int numero, int indice){

        if(numero < 3){
            return true;
        }else if(indice < 2){
            return true;
        }else if(numero % indice == 0){
            return false;
        }else{
            return validarPrimoRecursivo(numero, indice-1);
        }

    }
}
