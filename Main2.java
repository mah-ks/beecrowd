import java.io.IOException;
import java.util.Scanner;
 

public class Main2 {
 
    public static void main(String[] args) throws IOException {
       
       Scanner scanner = new Scanner (System.in);
       
       int A = scanner.nextInt();
       int B = scanner.nextInt();
       int X = A + B;
       
       System.out.println ("X = " + X);
       scanner.close();
     
 
    }
 
}