import java.io.IOException;
import java.util.Scanner;


public class Main18 {
 
    public static void main(String[] args) throws IOException {
        
         Scanner scanner = new Scanner(System.in);
        int horas = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        double quantidade = horas * velocidadeMedia;
        double gastos = quantidade / 12; 
      

        System.out.printf("%.3f\n", gastos);
              scanner.close();
 
 
    }
 
}