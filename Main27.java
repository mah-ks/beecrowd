import java.io.IOException;
import java.util.Scanner;
 

public class Main27 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
       
       while (scanner.hasNext()) {
            long a = scanner.nextLong(); 
            long b = scanner.nextLong(); 
            long resultado = a ^ b;

           
            System.out.println(Long.toUnsignedString(resultado & 0xFFFFFFFFL));
        }
        scanner.close();
       
 
    }
 
}