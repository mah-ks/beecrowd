import java.io.IOException;
import java.util.*;
 

public class Main26 {
 
    public static void main(String[] args) throws IOException {
        
         Scanner scanner = new Scanner(System.in);
        int numeroDoCaso = 1;

        while (true) {
            int quantidadeDeMarmores = scanner.nextInt();
            int quantidadeDeConsultas = scanner.nextInt();

            if (quantidadeDeMarmores == 0 && quantidadeDeConsultas == 0) break;

            int[] rajuMarbles = new int[quantidadeDeMarmores];
            for (int i = 0; i < quantidadeDeMarmores; i++) {
                rajuMarbles[i] = scanner.nextInt();
            }

            Arrays.sort(rajuMarbles);

            System.out.println("CASE# " + numeroDoCaso + ":");

            for (int i = 0; i < quantidadeDeConsultas; i++) {
                int numeroConsultadoPorMeena = scanner.nextInt();

                int posicao = buscarPrimeiraPosicao(rajuMarbles, numeroConsultadoPorMeena);

                if (posicao != -1) {
                    System.out.println(numeroConsultadoPorMeena + " found at " + (posicao + 1));
                } else {
                    
                    System.out.println(numeroConsultadoPorMeena + " not found");
                }
            }

            numeroDoCaso++;
        }

        scanner.close();
    }
    public static int buscarPrimeiraPosicao(int[] marmores, int numeroProcurado) {
        int inicio = 0, fim = marmores.length - 1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (marmores[meio] == numeroProcurado) {
                resultado = meio;
                fim = meio - 1; 
            } else if (marmores[meio] < numeroProcurado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return resultado;
    }
}
 
        
    
 
