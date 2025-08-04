import java.io.*;

import java.util.*;
 
public class Main24 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        int cidade = 1;
 
        while ((line = br.readLine()) != null) {

            int n = Integer.parseInt(line.trim());

            if (n == 0) break;
 
            int[] freqMoradores = new int[201];

            int totalPessoas = 0;

            int totalConsumo = 0;
 
            for (int i = 0; i < n; i++) {

                StringTokenizer st = new StringTokenizer(br.readLine());

                int moradores = Integer.parseInt(st.nextToken());

                int consumo = Integer.parseInt(st.nextToken());
 
                int consumoMedio = consumo / moradores;

                freqMoradores[consumoMedio] += moradores;
 
                totalPessoas += moradores;

                totalConsumo += consumo;

            }
 
            System.out.printf("Cidade# %d:\n", cidade++);
 
            for (int c = 0; c <= 200; c++) {

                if (freqMoradores[c] > 0) {

                    System.out.printf("%d-%d ", freqMoradores[c], c);

                }

            }

            System.out.println();
 
            double media = (double) totalConsumo / totalPessoas;
 
            double truncado = Math.floor(media * 100) / 100;
 
            System.out.printf(Locale.US, "Consumo medio: %.2f m3.\n", truncado);
 
            System.out.println(); 

        }

    }

}
 