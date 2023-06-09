package Laba6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int term = 0;
        int durationSession=1;
        String[] nameCredit = new String[4];
        int[] statusCredit = new int[4];
        String[] nameExam = new String[4];
        int[] mark= new int[4];
        int quantitySession = in.nextInt();
        CreditBook creditBook = new CreditBook(211,new CreditBook.Student("Сенькин","Сергей","Сергеевич",20));
        for (int i =0;i<quantitySession;i++){
            System.out.println("Введите номер семестра");
            term = in.nextInt();
            for (int j = 0; j < nameCredit.length; j++) {
                nameCredit[i] = in.next();
            }
            for (int j = 0; j < statusCredit.length; j++) {
                statusCredit[i] = in.nextInt();
            }
            for (int j = 0; j < nameExam.length; j++) {
                nameExam[i] = in.next();
            }
            for (int j = 0; j < mark.length; j++) {
                mark[i] = in.nextInt();
            }
        }
        CreditBook.Session pox = new CreditBook.Session(term,durationSession,nameCredit,statusCredit,nameExam,mark);
        creditBook.addSession(term,durationSession,nameCredit,statusCredit,nameExam,mark);
        creditBook.session.add(pox);
        creditBook.displayInfo(creditBook);
    }
}