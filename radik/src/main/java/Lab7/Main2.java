package Lab7;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sentence sentence = new Sentence();
        String str = "\tИнтерфейс – это граница между двумя функциональными объектами, требования к которой определяются стандартом; совокупность средств, методов и правил взаимодействия( управления, контроля)." +
                "Это совокупность некоторых абстрактных методов. Класс реализует интерфейс, таким образом наследуя абстрактные методы интерфейса ?" +
                "\t Как произвести объявление пакетов в Java произвести ? Для этого существует аннотации." +
                "\t Аннотации – это мега-теги, которые добавляются к коду и применяются к объявлению пакетов, классов, конструкторов, методов, полей, параметров и локальных переменных ?";
        System.out.println("Введите количество символов числа");
        int countCharInWord = in.nextInt();
        str = str.replace(",", "").replace(":", "");

        String[] array = str.split("[?]");
        List<Sentence> arraySentenceQue = new ArrayList<>();

        sentence.findQue(arraySentenceQue,array);
        Set<String> correctWord = new TreeSet<>();
        correctWord = arraySentenceQue.get(0).findUniqueWord(arraySentenceQue,countCharInWord);
        System.out.println(correctWord);
    }
}

