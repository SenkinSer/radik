import java.util.Scanner;
public class laba2_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ch = new Scanner(System.in);
        System.out.println("Введите кол-во чисел");
        String uniqueSetString = "";
        String AllNumbersString = "0123456789";
        String number = "0";
        int flagWord = 0;
        int currentNumberString = 0;
        int nextNumberString = 0;
        int numberOfDigits = in.nextInt();
        int  nunberInQuestion = 1;
        while(nunberInQuestion<=numberOfDigits){
            uniqueSetString="";
            flagWord = 0 ;
            System.out.println("Введите "+nunberInQuestion+" число");
            String inputNumberString  = ch.nextLine();
            String[] arr = inputNumberString.split("");
            for (int i =0; i<inputNumberString.length();i++){
                if (AllNumbersString.indexOf(arr[i])==-1){
                    flagWord =1;
                }
            }
            if (flagWord==1){
                System.out.println("Введенно некорректное значение ");
                continue;
            }
            for (int i =0; i<inputNumberString.length();i++){
                if (uniqueSetString.indexOf(arr[i])==-1){
                    uniqueSetString = uniqueSetString + arr[i];
                }
            }
            if (nunberInQuestion==1){
                number = inputNumberString;
                currentNumberString = uniqueSetString.length();
            }
            else {
                nextNumberString = uniqueSetString.length();
                if (currentNumberString>nextNumberString){
                    currentNumberString = nextNumberString;
                    number = inputNumberString;
                }
            }
            nunberInQuestion = nunberInQuestion + 1;
        }
        System.out.println("Число "+ number);
        System.out.println("Количество различных символов "+ currentNumberString);
    }
}