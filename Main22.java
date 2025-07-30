import java.io.IOException;
import java.util.Scanner;

 
public class Main22 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        int valor = (int)(N * 100 + 0.5);
        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};
 
        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quatidade = valor / nota;
            System.out.printf("%d nota(s) de R$ %.2f\n", quatidade, nota / 100.0);
            valor %= nota;
        }
 
        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quatidade = valor / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", quatidade, moeda / 100.0);
            valor %= moeda;
        }

    }
 
}