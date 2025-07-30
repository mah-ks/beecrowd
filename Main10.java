import java.io.IOException;
import java.util.Scanner;

 
public class Main10 {
 
    public static void main(String[] args) throws IOException {
        
         Scanner scanner = new Scanner(System.in);
        String Nome = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalDeVendas = scanner.nextDouble();
        double porcentagem = (totalDeVendas * 15) / 100;
        double TOTAL = porcentagem + salarioFixo;


        System.out.printf("TOTAL = R$ %.2f\n" , TOTAL );
        scanner.close();
 
    
 
    }
 
}