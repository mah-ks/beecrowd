import java.util.Scanner;

public class Main23 {
 
    public static int mdc(int a, int b) {
        if (b == 0)
            return a;
        return mdc(b, a % b);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
 
        for (int i = 0; i < N; i++) {
            int n1 = sc.nextInt();
            sc.next();
            int d1 = sc.nextInt();
 
            String operador = sc.next();
 
            int n2 = sc.nextInt();
            sc.next();
            int d2 = sc.nextInt();
 
            int num = 0;
            int den = 0;
 
            switch (operador) {
                case "+":
                    num = n1 * d2 + n2 * d1;
                    den = d1 * d2;
                    break;
                case "-":
                    num = n1 * d2 - n2 * d1;
                    den = d1 * d2;
                    break;
                case "*":
                    num = n1 * n2;
                    den = d1 * d2;
                    break;
                case "/":
                    num = n1 * d2;
                    den = n2 * d1;
                    break;
            }
 
            int mdc = mdc(Math.abs(num), Math.abs(den));
            int numSimples = num / mdc;
            int denSimples = den / mdc;
 
            if (denSimples < 0) {
                numSimples *= -1;
                denSimples *= -1;
            }
 
            System.out.printf("%d/%d = %d/%d\n", num, den, numSimples, denSimples);
        }
 
        sc.close();
    }
}