import java.io.IOException;
import java.util.Scanner;


public class Main12 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();
        double pi = 3.14159;
        double volume  =  (4.0 / 3 ) * pi * (R * R * R);


        System.out.printf("VOLUME = %.3f\n" , volume );
        scanner.close();
 
    }
 
}