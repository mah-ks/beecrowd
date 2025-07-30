import java.io.IOException;
import java.util.Scanner;
 

public class Main17 {
 
    public static void main(String[] args) throws IOException {
        
        
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();
        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");
        scanner.close();
 
 
    }
 
}