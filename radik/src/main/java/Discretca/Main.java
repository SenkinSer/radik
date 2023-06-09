package Discretca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[7][7];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
        //1-я строка матрицы
        matrix[0][1] = 4;
        matrix[0][2] = 8;
        // 2-я строка матрицы
        matrix[1][2] = 3;
        matrix[1][4] = 10;
        matrix[1][5] = 12;
        //3-я строка матрицы
        matrix[2][3] = 3;
        matrix[2][4] = 8;
        //4-я строка матрицы
        matrix[3][4] = 2;
        //5-я строка матрицы
        matrix[4][5] = 3;
        //6-я строка матрицы
        matrix[5][6] = 4;
        printMatrix(matrix);
        int min = 9999;
        int jnow = 0;
        int jmin = 0;
        int sum = 0;
        String result = "x1 ";
        while (true) {
            if (jmin < 6) {
                    sum = sum + findMinNumberInLine(matrix[jmin]);
                    jnow = findNextLine(matrix[jmin],jmin);
                    matrix =changeMatrixLine(matrix,jmin,jnow);
                    jmin = jnow;
                    result =result + "x"+(jmin+1)+" ";
            } else {
                break;
            }
        }
        System.out.println("Длина = "+sum);
        System.out.println("Пройденные вершины "+result);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int findNextLine(int[] line, int jmin) {
        int min = 999;
        for (int j = 0; j < line.length; j++) {
            if (line[j] != 0) {
                if (line[j] < min) {
                    min = line[j];
                    jmin = j;
                }
            }
        }
        return jmin;
    }

    public static int findMinNumberInLine(int[] line) {
        int min = 999;
        for (int j = 0; j < line.length; j++) {
            if (line[j] != 0) {
                if (line[j] < min) {
                    min = line[j];
                }
            }
        }
        return min;
    }

    public static int[][] changeMatrixLine(int[][] matrix, int jmin,int jnow) {
        for (int i = 0; i < matrix[jmin].length; i++) {
            matrix[jmin][i] = 999;
        }
        for (int i = 0; i < matrix[jmin].length; i++) {
            matrix[i][jnow] = 999;
        }
        return matrix;
    }
}
