package Lab7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String currentString = scanner.nextLine();

        System.out.println("Введите строку, которые хотите вставить");
        String newString = scanner.nextLine();

        System.out.println("Введите после какого символа вы хотите вставить подстроку");
        int number = scanner.nextInt();

        String secondPartCurrentString = currentString.substring(number);
        currentString = currentString.substring(0, number+1);

        currentString += newString + secondPartCurrentString;

        System.out.println(currentString);
    }
}