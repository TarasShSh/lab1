/*
Транспонувати матрицю n X m.
 */
public class Task5 {

    public static void main(String[] args) {
        // Task 5
        int[][] nMatrix = {{1, 2}, {3, 4}, {5, 6}};
        int[][] mMatrix = Task5.tMatrix(nMatrix);
        System.out.println(mMatrix[0][0]);
        Task5.PrintArray(mMatrix);
    }

    public static void PrintArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static int[][] tMatrix(int[][] arr) {
        int[][] tempArr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                tempArr[j][i] = arr[i][j];
        return tempArr;
    }

}
