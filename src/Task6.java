/*
Написати програму для обчислення множення матриць
 */
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
            int m, n, p, q, sum = 0, c, d, k;

            Scanner in = new Scanner(System.in);
            System.out.println("К-сть рядків першої матриці:");
            m = in.nextInt();
            System.out.println("К-сть стовпців першої матриці:");
            n = in.nextInt();

            int[][] first = new int[m][n];

            System.out.println("Елементи першої матриці:");

            for (c = 0; c < m; c++)
                for (d = 0; d < n; d++)
                    first[c][d] = in.nextInt();

            System.out.println("К-сть рядків другої матриці:");
            p = in.nextInt();
            System.out.println("К-сть стовпців другої матриці:");
            q = in.nextInt();

            if (n != p)
                System.out.println("К-сть стовпців першої матриці != к-сті рядків другої");
            else {
                int[][] second = new int[p][q];
                int[][] multiply = new int[m][q];

                System.out.println("Елементи другої матриці:");

                for (c = 0; c < p; c++)
                    for (d = 0; d < q; d++)
                        second[c][d] = in.nextInt();

                for (c = 0; c < m; c++) {
                    for (d = 0; d < q; d++) {
                        for (k = 0; k < p; k++) {
                            sum = sum + first[c][k] * second[k][d];
                        }

                        multiply[c][d] = sum;
                        sum = 0;
                    }
                }

                System.out.println("Добуток:");

                for (c = 0; c < m; c++) {
                    for (d = 0; d < q; d++)
                        System.out.print(multiply[c][d] + "\t");

                    System.out.print("\n");
                }
            }
        }

    }
