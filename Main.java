import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroCaso = 1;

        while (true) {
            int quantidadeBolinha = entrada.nextInt();
            int quantidadeConsulta = entrada.nextInt();

            if (quantidadeBolinha == 0 && quantidadeConsulta == 0) break;

            int[] bolinhas = new int[quantidadeBolinha];
            for (int i = 0; i < quantidadeBolinha; i++) {
                bolinhas[i] = entrada.nextInt();
            }
            Arrays.sort(bolinhas); 

            System.out.println("CASE# " + numeroCaso + ":");

            for (int i = 0; i < quantidadeConsulta; i++) {
                int consulta = entrada.nextInt();
                int posicao = buscaPrimeiraPosicao(bolinhas, consulta);

                if (posicao != -1) {
                    System.out.println(consulta + "  found at " + (posicao + 1));
                } else {
                    System.out.println(consulta + " not found");
                }
            }

            numeroCaso++;
        }

        entrada.close();
    }

    public static int buscaPrimeiraPosicao(int[] vetor, int valorProcurado) {
        int inicio = 0, fim = vetor.length - 1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valorProcurado) {
                resultado = meio;
                fim = meio - 1; 
            } else if (vetor[meio] < valorProcurado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return resultado;
    }
}