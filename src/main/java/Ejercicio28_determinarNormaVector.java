public class Ejercicio28_determinarNormaVector {

    public static void main(String[] args) {
        double[] vector = {3.0, 4.0, 5.0};
        double norma = calcularNorma(vector, vector.length - 1);
        System.out.println("La norma del vector es: " + norma);
    }

    /**
     * 28.  Escriba un método recursivo que retorne la norma de un vector (a) de tamaño n.
     *      La norma de un vector se calcula sacando la raíz cuadrada a la sumatoria de cada
     *      uno de sus elementos al cuadrado.
     * @param vector
     * @param indice
     * @return
     */
    private static double calcularNorma(double[] vector, int indice) {
        if (indice == 0) {
            return Math.sqrt(vector[0] * vector[0]);
        } else {
            double elementoActual = vector[indice];
            double normaRestante = calcularNorma(vector, indice - 1);
            return Math.sqrt(elementoActual * elementoActual + normaRestante * normaRestante);
        }
    }
}
