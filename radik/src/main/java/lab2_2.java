import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива:");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[]arr;
        arr = new int[count];
        for (int i=0;i<count;i++){
            System.out.println("Введите "+i+" элемент");
            arr[i] = in.nextInt();
        }
        System.out.println("Массив:");
        for (int i=0;i<count;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Обратный массив:");
        for (int i=count-1;i>=0;i=i-1){
            System.out.print(arr[i]);
        }
    }
}
