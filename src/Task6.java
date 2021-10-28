/*
Написати програму для обчислення множення матриць
 */
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
            int m, n, p, q, sum = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("К-сть рядків першої матриці:");
            m = in.nextInt();
            System.out.println("К-сть стовпців першої матриці:");
            n = in.nextInt();
            int[][] first = new int[m][n];
            System.out.println("Елементи першої матриці:");

            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++) {
                    first[i][j] = in.nextInt();
                }
            }
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

                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < q; j++) {
                        second[i][j] = in.nextInt();
                    }
                }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < q; j++) {
                        for (int k = 0; k < p; k++) {
                            sum = sum + first[i][k] * second[k][j];
                        }

                        multiply[i][j] = sum;
                        sum = 0;
                    }
                }

                System.out.println("Добуток:");

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < q; j++) {
                        System.out.print(multiply[i][j] + "\t");
                    }
                    System.out.print("\n");
                }
            }
        }

    }
