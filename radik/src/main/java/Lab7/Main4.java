package Lab7;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        String str = "\tИнтерфейс – это граница между двумя функциональными объектами, требования к которой определяются стандартом; совокупность средств, методов и правил взаимодействия( управления, контроля)." +
                "Это совокупность некоторых абстрактных методов. Класс реализует интерфейс, таким образом наследуя абстрактные методы интерфейса." +
                "\t Как произвести объявление пакетов в Java произвести ? Для этого существует аннотации." +
                "\t Аннотации – это мега-теги, которые добавляются к коду и применяются к объявлению пакетов, классов, конструкторов, методов, полей, параметров и локальных переменных.";
        String[] arrayWords = str.split("");
        int imaxNowChar= 0;
        int iminNowChar = 0;
        int MaxCountNow = 0;
        int countOnChar=0;
        int count = 0;
        int imax=0;
        int imin=0;
        for (int i = 0; i < arrayWords.length; i++) {
            arrayWords[i] = arrayWords[i].toLowerCase();
        }
        for (int i = 0; i < arrayWords.length-1; i++) {
            for (int j =i+1; j < arrayWords.length; j++) {
                if (arrayWords[i].equals(arrayWords[j])) {
                        MaxCountNow = MaxCountNow+countOnChar;
                        countOnChar = 0;
                        iminNowChar = i;
                        imaxNowChar = j;
                } else {
                    countOnChar++;
                }
            }
            if(count<MaxCountNow) {
                count = MaxCountNow;
                imax = imaxNowChar+1;
                imin = iminNowChar;
            }
            MaxCountNow=0;
            countOnChar = 0;
        }
        System.out.print("Вычеркиваемая подстрока: ");
        System.out.println(str.substring(imin,imax));
        System.out.print("Полученная строка: ");
        System.out.println(str.replace(str.substring(imin,imax)," "));
    }
}
