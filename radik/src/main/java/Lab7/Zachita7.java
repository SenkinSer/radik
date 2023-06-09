package Lab7;
import java.util.Scanner;
public class Zachita7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String currentString = scanner.nextLine();
        StringBuilder strBuilder= new StringBuilder(currentString);

        System.out.println("Введите строку, которые хотите вставить");
        String newString = scanner.nextLine();

        System.out.println("Введите после какого символа вы хотите вставить подстроку");
        int number = scanner.nextInt();
        strBuilder.insert(number+1,newString);
        System.out.println(strBuilder.toString());
    }
}