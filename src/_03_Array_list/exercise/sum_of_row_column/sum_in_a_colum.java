package _03_Array_list.exercise.sum_of_row_column;

public class sum_in_a_colum {
    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = a.length;
        int cols = a[0].length;

        //sum row
        for (int i = 0; i < rows; i++) {
            int sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow += a[i][j];
            }
            System.out.println("sum of row " + (i + 1) + " is " + sumRow);
        }
//sum column
        for (int i = 0; i < cols; i++) {
            int sumCol = 0;
            for (int j = 0; j < rows; j++) {
                sumCol = sumCol + a[j][j];
            }
            System.out.println("sum of colums " + (i + 1) + " is " + sumCol);
        }

    }
}
