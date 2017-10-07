package basicexamples;

/**
 * Created by asus1 on 5.10.2017.
 */
public class Tranzpoze {
    public static void main(String[] args) {

        int[][] matris = new int[4][6];
        int[][] matris2 = new int[6][4];
        int k = 0, l = 0, m = 0, n = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                matris[0][k] = i;
                k++;
            }
        }
        for (int j = 1; j <= 30; j++) {
            if (j % 5 == 0) {
                matris[1][l] = j;
                l++;
            }
        }
        for (int x = 100; x >= 50; x--) {
            if (x % 10 == 0) {
                matris[2][m] = x;
                m++;
            }
        }
        for (int y = 1; y < 7; y++) {
            matris[3][n] = (int) Math.pow(2, y);
            n++;
        }

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris2[j][i] = matris[i][j];
            }
            System.out.println();
        }

        for (int a = 0; a < matris2.length; a++) {
            for (int b = 0; b < matris2[0].length; b++) {
                System.out.print(matris2[a][b] + " ");
            }
            System.out.println();
        }
    }
}
