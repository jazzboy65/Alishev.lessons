package Lessons; //Многомерные массивы

public class Lesson13 {
    public static void main(String[] args) {
        /**
         * 1,2,3,4,5,0,-2 - одномерный массив
         *
         * 156 - многомерный массив
         * 376 - к элементу 7 мы можем обратиться использую [1] (второй массив), [1] (второй элемент массива)
         * 268
         */
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);

        int[] number1 = new int[5];
        String[][] strings = new String[2][3];
        strings[0][1] = "Привет";
        System.out.println(strings[0][1]);

        int[][] matrix2 = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
