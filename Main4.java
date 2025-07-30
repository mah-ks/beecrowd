import java.io.IOException;
import java.util.Scanner;
 

public class Main4 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner (System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int soma = A + B;
        System.out.println("SOMA = " + soma);
        scanner.close();
 
       
 
    }
 
}