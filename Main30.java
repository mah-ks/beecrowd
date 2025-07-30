import java.io.IOException;
 import java.util.Scanner;


public class Main30 {
    
    static int contador;
    public static int calcular(int n) {
        contador++;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcular(n - 1) + calcular(n - 2);
        }
    }
 
    public static void main(String[] args) throws IOException {
        
         Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt(); 
            contador = -1;
            int resultado = calcular(X);
            System.out.printf("fib(%d) = %d calls = %d%n", X, contador, resultado);
        }

        scanner.close();
 
       
 
    }
 
}