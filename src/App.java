import java.util.function.Supplier;

public class App {

    public static void main(String[] args) {
        runFibonacci();
    }

    public static void runFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int n = 47;

        long result1 = medirTiempo(() ->fibonacci.fibonacci(n));
        System.out.println("Fibonacci of " + n + " is: " + result1);

        long result2 = medirTiempo(() ->fibonacci.fibonacci(n));
        System.out.println("Fibonacci of " + n + " is: " + result2);

        long result3 = medirTiempo(() ->fibonacci.fibonacciBU(n));
        System.out.println("Fibonacci of " + n + " is: " + result3);

        long result4 = medirTiempo(() -> fibonacci.fibOptimizado(n));
        System.out.println("Fibonacci of " + n + " is: " + result4);
    }

    // Método genérico que mide tiempo de ejecución
    public static <T> T medirTiempo(Supplier<T> funcion) {
        long inicio = System.nanoTime();
        T resultado = funcion.get(); 
        long fin = System.nanoTime();

        long duracion = fin - inicio;
        System.out.println("Tiempo de ejecución: " + duracion + " nanosegundos");

        return resultado;
    }
}