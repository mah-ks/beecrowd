import java.io.IOException;
import java.util.Scanner;

 
public class Main9 {
 
    public static void main(String[] args) throws IOException {
        
         Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double recebePorHora = scanner.nextDouble();
        double SALARY  = horasTrabalhadas * recebePorHora;

         System.out.printf("NUMBER = %d\n", Number);
        System.out.printf("SALARY = U$ %.2f\n" , SALARY );
        scanner.close();
 
  
    }
 
}