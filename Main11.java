import java.io.IOException;
import java.util.Scanner;

public class Main11 {
 
    public static void main(String[] args) throws IOException {
           Scanner scanner = new Scanner(System.in);
        int  codigoPeca1 = scanner.nextInt();
        int numerodepecas1 = scanner.nextInt();
        double valorUnitario1 = scanner.nextDouble();
        int  codigoPeca2 = scanner.nextInt();
        int numerodepecas2 = scanner.nextInt();
        double valorUnitario2 = scanner.nextDouble();
        double pago = (valorUnitario1 * numerodepecas1 + valorUnitario2 * numerodepecas2) ;


        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , pago );
        scanner.close();
 
       
 
    }
 
}