import java.io.IOException;
import java.util.Scanner;

 

public class Main19 {
 
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        System.out.println(N);
        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int quantidade = N / nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            N %= nota;
        }

        scanner.close();
 
   
    }
 
}