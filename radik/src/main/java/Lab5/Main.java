/*package Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Lab5.MedicinalPreparations.setAllMedicinalsPreparationOnNumbers;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberPreparation;
        List<Opportunities> arrayMedicinalPreparations = new ArrayList<>();
        arrayMedicinalPreparations.add(new Medicine("Нормакс",6,Status.ALLOWED));
        arrayMedicinalPreparations.add(new Tablet("Ацц",5,Status.FORBIDDEN));
        arrayMedicinalPreparations.add(new Ointment("Ренацен",4,Status.BY_PRESCRIPTION));
        arrayMedicinalPreparations.add(new Solution("Зеленка",2,Status.ALLOWED));
        int endOfCycle = 0;
        while (endOfCycle == 0) {
            System.out.println("Меню");
            System.out.println("1:Добавить преперат");
            System.out.println("2:Расчитать дозу препарата");
            System.out.println("3:Изменить статус");
            System.out.println("4:Получить или изменить информацию о веществе");
            System.out.println(("5:Дополнительные действия с определнными лекарствами"));
            System.out.println("6:Выход");
            Opportunities element = arrayMedicinalPreparations.get(1);
            int mainChoice = in.nextInt();
            int choice = 0;
            switch (mainChoice) {
                case 1:
                    System.out.println("Выберете препарат который хотите добавить");
                    System.out.println("1:Таблетка ");
                    System.out.println("2:Лекартсво ");
                    System.out.println("3:Мазь ");
                    System.out.println("4:Раствор ");
                    choice= in.nextInt();
                    String name;
                    int concentration;
                    int statusSubstance;
                    Opportunities lastElement;
                    switch (choice){
                        case 1:
                            printMenuAddMP();
                            Tablet tablet = new Tablet();
                            addToArrayMedicinalPreparations(in, arrayMedicinalPreparations, tablet);
                            break;
                        case 2:
                            printMenuAddMP();
                            Medicine medicine = new Medicine();
                            addToArrayMedicinalPreparations(in, arrayMedicinalPreparations, medicine);
                            break;
                        case 3:
                            printMenuAddMP();
                            Ointment ointment = new Ointment();
                            addToArrayMedicinalPreparations(in, arrayMedicinalPreparations, ointment);
                            break;
                        case 4:
                            printMenuAddMP();
                            Solution solution = new Solution();
                            addToArrayMedicinalPreparations(in, arrayMedicinalPreparations, solution);
                            break;
                        default:
                            System.out.println("Введено некорректное число");
                            break;
                    }
                    break;
                case 2:
                    int Dosage = 0;
                    System.out.println("Введите массу тело ");
                    int weightBody = in.nextInt();
                    numberPreparation = choiceMP(arrayMedicinalPreparations);
                    Dosage = element.calculateDosage(element.choiseMedicinalPreparations(arrayMedicinalPreparations,numberPreparation),weightBody);
                    System.out.println("Дозировка: " + Dosage + "г");
                    break;
                case 3:
                    numberPreparation = choiceMP(arrayMedicinalPreparations);
                    choice = choiceStatus(element.choiseMedicinalPreparations(arrayMedicinalPreparations,numberPreparation),choice);
                    element.changeStatus(element.choiseMedicinalPreparations(arrayMedicinalPreparations,numberPreparation),choice);
                    break;
                case 4:
                    numberPreparation = choiceMP(arrayMedicinalPreparations);
                    System.out.println("Выберете действие");
                    System.out.println("1:Получить информацию о преперате");
                    System.out.println("2:Изменить информацию о преперате");
                    choice = in.nextInt();
                    switch (choice) {
                        case 1:
                            element.toString(element.choiseMedicinalPreparations(arrayMedicinalPreparations,numberPreparation));
                            break;
                        case 2:
                            printMenuAddMP();
                            name = in.next();
                            concentration = in.nextInt();
                            statusSubstance = in.nextInt();
                            element.changeInformation(element.choiseMedicinalPreparations(arrayMedicinalPreparations,numberPreparation),name,concentration,statusSubstance);
                    }
                    break;
                case 5:
                    numberPreparation = choiceMP(arrayMedicinalPreparations);
                    additionalActions(element.choiseMedicinalPreparations(arrayMedicinalPreparations,numberPreparation));
                    break;
                case 6:
                    endOfCycle = 1;
                    break;
                default:
                    System.out.println("Введено некорректное значение");
                    break;
            }
        }
    }

    private static void addToArrayMedicinalPreparations(Scanner in, List<Opportunities> arrayMedicinalPreparations, MedicinalPreparations medicinalPreparation) {
        int concentration;
        String name;
        int statusSubstance;
        Opportunities lastElement;
        name = in.next();
        concentration = in.nextInt();
        statusSubstance = in.nextInt();
        arrayMedicinalPreparations.add(medicinalPreparation);
        lastElement = arrayMedicinalPreparations.get(arrayMedicinalPreparations.size() - 1);
        lastElement.addMedicinalPreparations(((MedicinalPreparations) lastElement),name,concentration,statusSubstance);
    }

    public static void printMenuAddMP(){
        System.out.println("Введите название вещества ");
        System.out.println("Введите концентрацию вещества ");
        System.out.println("Выберете статус вещества ");
        System.out.println("1:"+Status.FORBIDDEN);
        System.out.println("2:"+Status.BY_PRESCRIPTION);
        System.out.println("3:"+Status.ALLOWED);
    }
    public static int choiceMP(List<Opportunities> arrayMedicinalPreparations){
        Scanner in = new Scanner(System.in);
        setAllMedicinalsPreparationOnNumbers(arrayMedicinalPreparations);
        System.out.println("Выберете нужный препарат");
        int numberPreparation = in.nextInt();
        return numberPreparation;
    }
    public static int choiceStatus(MedicinalPreparations substance,int choice) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете новый статус");
        if ((substance.statusSubstance.equals(Status.FORBIDDEN))) {
            System.out.println("1:"+Status.BY_PRESCRIPTION);
            System.out.println("2:"+Status.ALLOWED);
        }
        if ((substance.statusSubstance.equals(Status.ALLOWED))) {
            System.out.println("1:"+Status.BY_PRESCRIPTION);
            System.out.println("3:"+Status.FORBIDDEN);
        }
        if ((substance.statusSubstance.equals(Status.BY_PRESCRIPTION))) {
            System.out.println("2:"+Status.ALLOWED);
            System.out.println("3:"+Status.FORBIDDEN);
        }
        choice = in.nextInt();
        return choice;
    }
    public static void additionalActions(MedicinalPreparations substance){
        if (substance instanceof Tablet){
            ((Tablet)substance).drinkTablet(((Tablet) substance));
        }
        if (substance instanceof Medicine){
            ((Medicine)substance).drinkMedicine(((Medicine) substance));
        }
        if (substance instanceof Ointment){
            ((Ointment)substance).spreadOintment(((Ointment) substance));
        }
        if (substance instanceof Solution){
            ((Solution)substance).drinkSolution(((Solution) substance));
        }
    }
}*/