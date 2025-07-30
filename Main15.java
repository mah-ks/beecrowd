import java.io.IOException;
 import java.util.Scanner;

public class Main15 {
 
    public static void main(String[] args) throws IOException {
 
 
  
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        double Y = scanner.nextDouble();
        double valorGasto = X / Y; 
      

        System.out.printf("%.3f km/l\n", valorGasto);
              scanner.close();
 
 
    }
 
}