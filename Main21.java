import java.io.IOException;
import java.util.Scanner;
 
public class Main21 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        int ano = idade / 365;
        int mes = (idade % 365)/30;
        int dia = idade % 365 - 30 * mes;
        
         System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);
        

 
    }
 
}