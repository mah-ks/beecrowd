import java.io.IOException;
import java.util.Scanner;
 

public class Main3 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double N = 3.14159;
        double area = N * ( raio * raio);
        
        System.out.printf("A=%.4f\n", area);
        scanner.close();
       
    }
 
}