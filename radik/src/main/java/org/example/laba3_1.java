package org.example;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
class Abiturient {
    int id;
    String surName;
    String name;
    String middleName;
    String address;
    String telephon;
    String evaluations;
    {
        id = 0;
        surName = "Не указано";
        name = "Не указано";
        middleName= "Не указано";
        address = "Не указан";
        telephon = "0-000-000-00-00";
        evaluations="";
    }
    Abiturient(){}
    Abiturient(String surName){
        this.surName=surName;
    }
    Abiturient(String surName,String name){
        this.surName = surName;
        this.name = name;
    }
    Abiturient(String surName,String name,String middleName){
        this.surName=surName;
        this.name = name;
        this.middleName = middleName;
    }
    Abiturient(String surName,String name,String middleName,String address){
        this.surName=surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
    }
    Abiturient(int id,String surName,String name,String middleName,String address,String telephon){
        this.id=id;
        this.surName=surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.telephon = telephon;
    }
    Abiturient(int id,String surName,String name,String middleName,String address,String telephon,String evaluations){
        this.id = id;
        this.surName=surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.telephon = telephon;
        this.evaluations = evaluations;
    }
    public void getAbiturient(Abiturient[] mass){
        for (int i=0; i<mass.length;i++){
            if (mass[i] == null){
                break;
            }
            mass[i].displayInfo();
        }
    }

    public Abiturient[]  getmassObject(Abiturient[] massObject,Abiturient Object){
        massObject[Object.id-1] = Object;
        return massObject;
    }
    public int[] findingUnstatifactoriEvalutions(Abiturient[] massObjects){
        int [] massUnsatifactoriEvalutions = new int[10];
        int j = 0;
        while (massObjects[j]!=null){
            String[] massEvalutions= massObjects[j].evaluations.split("");
            for(int i = 0; i<massObjects[j].evaluations.length();i++){
                if (massEvalutions[i].equals("2")){
                    massUnsatifactoriEvalutions[j] = 1;
                }
            }
            j = j +1 ;
        }
        return massUnsatifactoriEvalutions;
    }

    public int[] calculationSumScoresAbiturients(Abiturient[] massObjects) {
        int[] sumsScoresAb = new int[10];
        int j = 0;
        int accumulationSum = 0;
        while (massObjects[j] != null) {
            String[] massEvalutions = massObjects[j].evaluations.split("");
            for (int i = 0; i < massObjects[j].evaluations.length(); i++) {
                accumulationSum = accumulationSum + Integer.parseInt(massEvalutions[i]);
            }
            sumsScoresAb[j] = accumulationSum;
            accumulationSum = 0;
            j = j + 1;
        }
        return sumsScoresAb;
    }
    public Abiturient[] listAbiturients(int[] massObjects,Abiturient[] massiv){
        Abiturient newMassObjects[] = new Abiturient[10];
        int [] massIndex = new int[10];
        for (int i =0;i<10;i++){
            massIndex[i] = i;
        }
        int permutationMass = 0;
        for (int i = 0;i<9;i++){
            for (int j=i+1;j<10;j++){
                if(massObjects[i]<massObjects[j]){
                    permutationMass = massObjects[i];
                    massObjects[i] = massObjects[j];
                    massObjects[j] = permutationMass;
                    permutationMass = massIndex[i];
                    massIndex[i] = massIndex[j];
                    massIndex[j] = permutationMass;
                }
            }
        }
        int j=0;
        while(j<massiv.length) {
            for (int i = 0; i <massiv.length; i++) {
                if (massiv[i]==null){
                    break;
                }
                if (massIndex[j] == massiv[i].id-1) {
                    newMassObjects[j] = massiv[i];
                }
            }
            j =j +1;
        }
        return newMassObjects;
    }


    void displayInfo(){
        System.out.println("ID = "+ id+"; Фамилия "+surName+" Имя "+name+" Отчество "+middleName+" Адрес "+address+" Телефон "+telephon+" Оценки "+evaluations);
    }
}
public class laba3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countAbiturients;
        System.out.println("Введите количество Абитуриентров");
        countAbiturients = in.nextInt();
        Abiturient massObjects[] = new Abiturient[10];
        Abiturient Serge = new Abiturient(1,"Cенькин", "Сергей", "Сергеевич", "Бирюзова", "8-920-636-30-02","54532");
        Abiturient Laz = new Abiturient(2,"Лазарев", "Илья", "Сергеевич", "Дзержинского", "8-930-618-34-20", "54334");
        massObjects = Serge.getmassObject(massObjects,Serge);
        massObjects = Laz.getmassObject(massObjects,Laz);
        for (int i = 0; i<countAbiturients;i++){
            Abiturient Ab = new Abiturient();
            Ab.id = i+3;
            System.out.println("Введите Имя");
            Ab.name = in.next();
            System.out.println("Введите Фамилию");
            Ab.surName = in.next();
            System.out.println("Введите Отчество");
            Ab.middleName = in.next();
            System.out.println("Введите Адрес ");
            Ab.address = in.next();
            System.out.println("Введите телефон ");
            Ab.telephon = in.next();
            System.out.println("Введите оценки");
            Ab.evaluations = in.next();
            massObjects = Ab.getmassObject(massObjects,Ab);
        }
        Serge.getAbiturient(massObjects);
        System.out.println("Список Абитуриентов с неуд оценками:");
        int[] massUnstatifactoriEvalutions = new int[10];
        massUnstatifactoriEvalutions = Serge.findingUnstatifactoriEvalutions(massObjects);
        for (int i =0; i<10;i++){
            if(massUnstatifactoriEvalutions[i] == 1){
                System.out.println(massObjects[i].name);
            }
        }
        System.out.println("Введите сумму баллов");
        int sumScores;
        sumScores = in.nextInt();
        int [] massSumScores = new int [10];
        massSumScores = Serge.calculationSumScoresAbiturients(massObjects);
        for (int i =0; i<10;i++){
            if (massSumScores[i]>sumScores){
                System.out.println(massObjects[i].name);
            }
        }
        System.out.println("Введите количестов выводимых абитуриентов:");
        int countOutputAbiturients;
        countOutputAbiturients = in.nextInt();
        massObjects = Serge.listAbiturients(massSumScores,massObjects);
        for (int i =0; i<countOutputAbiturients;i++){
            System.out.println(massObjects[i].name);
        }
    }
}