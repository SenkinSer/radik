package Discretca;
import java.util.ArrayList;
import java.util.List;

    public class Main2 {

        public static void printMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");

                }
                System.out.println();
            }
        }

        public static int[][] setNull(int[][] matrix, int position) {
            int[][] matrix1 = matrix;
            for (int i = 0; i < matrix1.length; i++) {
                matrix1[i][position] = 0;
            }
            return matrix1;
        }

        public static void main(String[] args) {
            int[][] matrix1 = {
                    {0,8,12,0,0,14},
                    {8,0,0,1,4,0},
                    {12,0,0,13,19,0},
                    {0,1,13,0,0,16},
                    {0,4,19,0,0,15},
                    {14,0,0,16,15,0}
            };

            System.out.println("Исходная матрица смежности:");
            printMatrix(matrix1);

            List<Integer> nodes = new ArrayList<>();
            nodes.add(0);
            List<List<Integer>> coordinate = new ArrayList<>();

            int L = 0;

            while (nodes.size() != matrix1.length) {
                int min = Integer.MAX_VALUE;
                int z = 0;
                int k = 0;
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix1.length; j++) {
                        if (nodes.contains(i)) {
                            if (matrix1[i][j] < min && matrix1[i][j] != 0) {
                                min = matrix1[i][j];
                                z = j;
                                k=i;

                            }
                        }
                    }
                }
                coordinate.add(List.of(k,z));
                nodes.add(z);
                matrix1 = setNull(matrix1,z);
                matrix1[z][k] =0 ;
                L+=min;

            }

            System.out.println("Порядок строк в которых находились минимальные значения:");
            System.out.println(nodes);
            System.out.println("Длина остового дерева:");
            System.out.println(L);
            System.out.println("Номера вершин остового дерева:");
            System.out.println(coordinate);
        }
    }
