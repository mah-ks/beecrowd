import java.io.IOException;
import java.util.Scanner;
 

public class Main8 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
       int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        
        int Diferenca = A * B - C * D;
        System.out.printf("DIFERENCA = %d\n", Diferenca);
        scanner.close();

 
    }
 
}