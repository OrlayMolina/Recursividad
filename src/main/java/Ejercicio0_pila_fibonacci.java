public class Ejercicio0_pila_fibonacci {

    public static void main(String[] args) {
        int n = 5;
        int resultado = fib(n);
    }

    public static int fib(int n) {
       if(n<=1)
           return n;
       else

           return fib(n-1) + fib(n -2);

    }
}
