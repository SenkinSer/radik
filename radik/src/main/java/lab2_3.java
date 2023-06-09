import java.util.Scanner;

public class lab2_3{
    public static void main(String[] args) {
        System.out.println("Введите количество строк матрицы");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int m = in.nextInt();
        int[][] matr;
        matr = new int[n][m];
        System.out.println("Введите матрицу");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.println("Введите элемент матрицы:");
                matr[i][j]=in.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matr[i][j]+" ");
            }
            System.out.println();
        }
        int perElevent = matr[0][0];
        int nacopSum = 0;
        int nacopSum1 = 0;
        int flag = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(perElevent<=matr[i][j]){
                    nacopSum = nacopSum +1;
                    perElevent = matr[i][j];
                }
                else{
                    perElevent = matr[i][j];
                    if (flag==0){
                        nacopSum1 = nacopSum;
                    }
                    else{
                        if (nacopSum>nacopSum1){
                            nacopSum1 = nacopSum;
                        }
                        nacopSum = 1;
                    }
                }
            }
        }
        System.out.println("Количество элементов подряд:");
        System.out.println(nacopSum1);
    }
}