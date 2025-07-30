import java.io.IOException;
import java.util.Scanner;

 

public class Main16 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        double X1 = scanner.nextDouble();
        double Y1 = scanner.nextDouble();
        double X2 = scanner.nextDouble();
        double Y2 = scanner.nextDouble();
        double distancia = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
      
        System.out.printf("%.4f\n", distancia);
              scanner.close();
 
 
    }
 
}