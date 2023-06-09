import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class laba4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FirstGroup[] arrayStonersFirst = new FirstGroup[6];
        int StonesDecoration = 0;
        List<FirstGroup> list = new ArrayList<>();
        list.add(new FirstGroup("Алмаз", 60, 60));
        list.size();
        int countStonesForDecoration = 0;
        PreciousStones[] decoration = new PreciousStones[15];
        PreciousStones[] sortArrayDecoration = new PreciousStones[15];
        int lastAddFirstStones = 5;
        arrayStonersFirst[0] = new FirstGroup("Алмаз", 60, 60);
        arrayStonersFirst[1] = new FirstGroup("Изумруд", 70, 70);
        arrayStonersFirst[2] = new FirstGroup("Сапфир", 80, 80);
        arrayStonersFirst[3] = new FirstGroup("Рубин", 90, 90);
        arrayStonersFirst[4] = new FirstGroup("Бриллиант", 85, 85);
        secondGroup[] arrayStonesSecond = new secondGroup[6];
        int lastAddSecondStones = 5;
        arrayStonesSecond[0] = new secondGroup("Александрит", 40, 40);
        arrayStonesSecond[1] = new secondGroup("Опал", 45, 45);
        arrayStonesSecond[2] = new secondGroup("Жадеит", 47, 47);
        arrayStonesSecond[3] = new secondGroup("Жемчуг", 43, 43);
        arrayStonesSecond[4] = new secondGroup("Аметист", 55, 55);
        thirdGroup[] arrayStonesThird = new thirdGroup[6];
        int lastAddThirdStones = 5;
        arrayStonesThird[0] = new thirdGroup("Аквамарин", 22, 22);
        arrayStonesThird[1] = new thirdGroup("Шпинель", 25, 25);
        arrayStonesThird[2] = new thirdGroup("Демотоид", 28, 28);
        arrayStonesThird[3] = new thirdGroup("Родолит", 31, 31);
        arrayStonesThird[4] = new thirdGroup("Адуляр", 33, 33);
        int n;
        int t = 0;
        while (t != 1) {
            System.out.println("1:Добавить новый камень ");
            System.out.println("2:Собрать ожерелье ");
            System.out.println("3:Посчитать вес и стоимость ожерелья ");
            System.out.println("4:Найти камень заданому диапозону прозрачности");
            System.out.println("5:Сортировка камней входящих в ожерелье по ценности ");
            System.out.println("6: Завершить программу");
            n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Введите прозрачность камня (%)");
                    int TransparencyInputPerson = in.nextInt();
                    if ((TransparencyInputPerson < 40) && (TransparencyInputPerson > 20)) {
                        arrayStonesThird[lastAddThirdStones] = new thirdGroup();
                        arrayStonesThird[lastAddThirdStones].setNewPreciousStones(arrayStonesThird[lastAddThirdStones]);
                        arrayStonesThird[lastAddThirdStones].transparency = TransparencyInputPerson;
                        lastAddThirdStones += 1;
                    } else {
                        if ((TransparencyInputPerson > 40) && (TransparencyInputPerson < 60)) {
                            arrayStonesSecond[lastAddSecondStones] = new secondGroup();
                            arrayStonesSecond[lastAddSecondStones].setNewPreciousStones(arrayStonesSecond[lastAddSecondStones]);
                            arrayStonesSecond[lastAddSecondStones].transparency = TransparencyInputPerson;
                            lastAddSecondStones += 1;
                        } else {
                            if ((TransparencyInputPerson > 60) && (TransparencyInputPerson < 100)) {
                                arrayStonersFirst[lastAddFirstStones] = new FirstGroup();
                                arrayStonersFirst[lastAddFirstStones].setNewPreciousStones(arrayStonersFirst[lastAddFirstStones]);
                                arrayStonersFirst[lastAddFirstStones].transparency = TransparencyInputPerson;
                                lastAddFirstStones += 1;
                            } else {
                                System.out.println("Не существует такого камня");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите количество камней входящих в ожерелье ");
                    countStonesForDecoration = in.nextInt();
                    for (int i = 0; i < countStonesForDecoration; i++) {
                        System.out.println("Введите группу " + (i + 1) + " камня");
                        StonesDecoration = in.nextInt();
                        int indexStones;
                        switch (StonesDecoration) {
                            case 1:
                                inputDecorationStones(decoration, arrayStonersFirst, i);
                                break;
                            case 2:
                                inputDecorationStones(decoration, arrayStonesSecond, i);
                                break;
                            case 3:
                                inputDecorationStones(decoration, arrayStonesThird, i);
                                break;
                        }
                    }
                    System.out.println("Ожирелье состоит:");
                    for (int i = 0; i < countStonesForDecoration; i++) {
                        System.out.println((i + 1) + " Камень " + decoration[i].name);
                    }
                    break;
                case 3:
                    int weightDecoration = 0;
                    int costDecoration = 0;
                    for (int i = 0; i < countStonesForDecoration; i++) {
                        weightDecoration += decoration[i].carat;
                    }
                    System.out.println("Вес ожерелья = " + weightDecoration);
                    for (int i = 0; i < countStonesForDecoration; i++) {
                        costDecoration += decoration[i].carat * decoration[i].pricePerCarat;
                    }
                    System.out.println("Стоимость ожерелья = " + costDecoration);
                    break;
                case 4:
                    System.out.println("Введите прозрачность ");
                    int inputTransparencyPerson = in.nextInt();
                    for (int i = 0; i < countStonesForDecoration; i++) {
                        if (decoration[i].transparency >= inputTransparencyPerson) {
                            System.out.print(decoration[i].name + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    int indexSortArrayDecoration = 0;
                    sortArrayDecoration = sortStonesDecoration(decoration, sortArrayDecoration, arrayStonersFirst, countStonesForDecoration, indexSortArrayDecoration);
                    indexSortArrayDecoration = findIndexSortArrayDecoration(sortArrayDecoration);

                    sortArrayDecoration = sortStonesDecoration(decoration, sortArrayDecoration, arrayStonesSecond, countStonesForDecoration, indexSortArrayDecoration);
                    indexSortArrayDecoration = findIndexSortArrayDecoration(sortArrayDecoration);

                    sortArrayDecoration = sortStonesDecoration(decoration, sortArrayDecoration, arrayStonesThird, countStonesForDecoration, indexSortArrayDecoration);
                    indexSortArrayDecoration = findIndexSortArrayDecoration(sortArrayDecoration);
                    for (int i = 0; i < sortArrayDecoration.length; i++) {
                        if (sortArrayDecoration[i] == null) {
                            break;
                        } else {
                            System.out.print(sortArrayDecoration[i].name + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    t = 1;
                    break;
            }
        }
    }

    public static PreciousStones[] inputDecorationStones(PreciousStones[] decoration, PreciousStones[] arrayStones, int i) {
        Scanner in = new Scanner(System.in);
        int indexStones;
        for (int j = 0; j < arrayStones.length; j++) {
            if (arrayStones[j] == null) {
                break;
            } else {
                System.out.print(j + 1 + " ");
                arrayStones[j].toString(arrayStones[j]);
            }
        }
        System.out.println("Введите индекс камня");
        indexStones = in.nextInt();
        decoration[i] = arrayStones[indexStones - 1];
        System.out.println("Введите вес камня:");
        decoration[i].carat = in.nextInt();
        return decoration;
    }

    public static PreciousStones[] sortStonesDecoration(PreciousStones[] decoration, PreciousStones[] sortArrayDecoration, PreciousStones[] arrayStones, int countStonesForDecoration, int index) {
        for (int j = 0; j < countStonesForDecoration; j++) {
            for (int i = 0; i < arrayStones.length; i++) {
                if (arrayStones[i] == null) {
                    break;
                } else {
                    if (decoration[j].name.equals(arrayStones[i].name)) {
                        sortArrayDecoration[index] = decoration[j];
                        index += 1;
                    }
                }
            }
        }
        return sortArrayDecoration;
    }

    public static int findIndexSortArrayDecoration(PreciousStones[] sortArrayDecoration) {
        int index = 0;
        for (int i = 0; i < sortArrayDecoration.length; i++) {
            if (sortArrayDecoration[i] == null) {
                break;
            } else {
                index += 1;
            }
        }
        return index;
    }
}