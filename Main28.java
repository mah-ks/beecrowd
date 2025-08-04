//import java.io.IOException;
import java.util.*;
 
public class Main28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 0) break;
 
            int[] x = new int[n];
            int[] y = new int[n];
            int minY = Integer.MAX_VALUE;
            int maxY = Integer.MIN_VALUE;
 
            for (int i = 0; i < n; i++) {
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
                if (y[i] < minY) minY = y[i];
                if (y[i] > maxY) maxY = y[i];
            }
 
            int resultado = 0;
 
            for (int a = minY + 1; a <= maxY - 1; a++) {
                List<int[]> pontos = new ArrayList<>();
 
                for (int i = 0; i < n; i++) {
                    if (y[i] == a - 1 || y[i] == a + 1) {
                        pontos.add(new int[]{x[i], y[i]});
                    }
                }
 
                pontos.sort((p1, p2) -> Integer.compare(p1[0], p2[0]));
 
                int melhor = 0;
 
                for (int i = 0; i < pontos.size(); i++) {
                    int esperado = pontos.get(i)[1];
                    int cont = 1;
 
                    for (int j = i + 1; j < pontos.size(); j++) {
                        if (pontos.get(j)[1] != esperado && pontos.get(j)[0] != pontos.get(j - 1)[0]) {
                            cont++;
                            esperado = pontos.get(j)[1];
                        }
                    }
 
                    if (cont > melhor) melhor = cont;
                }
 
                if (melhor > resultado) resultado = melhor;
            }
 
            System.out.println(resultado);
        }
    }
}