import java.io.IOException;
import java.util.Scanner;
 

public class Main29 {
    public static int calcular(int a , int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for(int i = 0 ; i < N ; i++){
            int F1 = scanner.nextInt();
            int F2 = scanner.nextInt();
            System.out.println(calcular(F1,F2));
        }
            scanner.close();
        
    }
 
}