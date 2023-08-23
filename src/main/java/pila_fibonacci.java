public class pila_fibonacci {

    public static void main(String[] args) {
        int n = 5;
        int resultado = fib(n);
        System.out.println(resultado);
    }

    public static int fib(int n) {
       if(n<=1)
           return n;
       else
           return fib(n-1) + fib(n -2);

    }
}
