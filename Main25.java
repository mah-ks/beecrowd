import java.io.IOException;
import java.util.Scanner;
 

public class Main25 {
    public static String criptografar(String linha){
     StringBuilder primeiraPassada = new StringBuilder();
        for(char c : linha.toCharArray()){
            if (Character.isLetter(c)){
                c +=3;
            }
             primeiraPassada.append(c);
        }

        StringBuilder segundaPassada = new StringBuilder(primeiraPassada).reverse();

        int metade = segundaPassada.length() / 2;
        for (int i = metade; i < segundaPassada.length(); i++) {
            char c = segundaPassada.charAt(i);
            c -= 1;
            segundaPassada.setCharAt(i, c);
        }

        return segundaPassada.toString();
    }
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine();
            String resultado = criptografar(linha);
            System.out.println(resultado);
        }

 
    }
 
}