import java.io.IOException;
import java.util.Scanner;
 

public class Main7 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double Media = (A * 2 + B * 3 + C * 5)/10;
        
        
    System.out.printf("MEDIA = %.1f\n", Media);
    scanner.close();
 
 
    }
 
}