import java.io.IOException;
import java.util.Scanner;


public class Main13 {
 
    public static void main(String[] args) throws IOException {
        
    
        Scanner scanner = new Scanner(System.in);
        double A= scanner.nextDouble();
        double B= scanner.nextDouble();
        double C= scanner.nextDouble();
        double triangulo = (A * C) / 2;
        double pi = 3.14159;
       double circulo = pi * (C * C);
        double trapezio = (A + B)/2 * C;
        double quadrado = B * B;
        double retangulo = A * B;


        System.out.printf("TRIANGULO: %.3f\n",triangulo);
        System.out.printf("CIRCULO: %.3f\n" ,circulo);
        System.out.printf("TRAPEZIO: %.3f\n" ,trapezio);
        System.out.printf("QUADRADO: %.3f\n" ,quadrado);
        System.out.printf("RETANGULO: %.3f\n",retangulo);
    
        scanner.close();
 
 
    }
 
}