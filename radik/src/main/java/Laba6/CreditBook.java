package Laba6;
import java.util.ArrayList;
import java.util.List;

public class CreditBook {
    int id;
    ArrayList<Session> session;
    Student student;

    CreditBook() {
    }

    CreditBook(int id, Student student) {
        session = new ArrayList<>();
        this.id = id;
        this.student = student;
    }

    public void setSession(ArrayList<Session> session) {
        this.session = session;
    }

    public void displayInfo(CreditBook creditBook) {
        System.out.println("Номер зачетной книжки студента:" + creditBook.id);
        for (int i = 0; i < creditBook.session.size(); i++) {
            creditBook.session.get(0).displayInfo1(creditBook.session.get(i));
        }
        creditBook.student.displayInfo1(creditBook.student);
        System.out.println();
    }

    public void addSession(int term,int durationSession,String[] nameCredit,int[] statusCredit,String[] nameExam,int[] mark) {
        session.add(new Session(term,durationSession,nameCredit,statusCredit,nameExam,mark));
    }

    public static class Session{
        int term;
        int durationSession;
        String[] nameCredit;
        int[] statusCredit;
        String[] nameExam;
        int[] mark;
        Session(){}
        Session(int term,int durationSession,String[] nameCredit,int[] statusCredit,String[] nameExam,int[] mark){
            this.term=term;
            this.durationSession=durationSession;
            this.nameCredit = nameCredit;
            this.statusCredit=statusCredit;
            this.nameExam = nameExam;
            this.mark = mark;
        }

        public void setTerm(int term) {
            this.term = term;
        }

        public void setDurationSession(int durationSession) {
            this.durationSession = durationSession;
        }

        public void setNameCredit(String[] nameCredit) {
            this.nameCredit = nameCredit;
        }

        public void setStatusCredit(int[] statusCredit) {
            this.statusCredit = statusCredit;
        }

        public void setNameExam(String[] nameExam) {
            this.nameExam = nameExam;
        }

        public void setMark(int[] mark) {
            this.mark = mark;
        }

        public void displayInfo1(Session session){
            System.out.println("Информация о сессии");
            System.out.print("Семестр: "+session.term+"; ");
            System.out.println(" Продолжительность сессии: "+session.durationSession+" дн. ; ");
            System.out.println("Экзамены:");
            for (int i=0;i<session.mark.length;i++){
                System.out.println("Экзамен : "+nameExam[i]+" оценка за экзамен "+ mark[i] );
            }
            System.out.println("Зачеты :");
            for (int i=0;i<session.statusCredit.length;i++){
                System.out.println("Экзамен : "+nameCredit[i]+" оценка за экзамен "+ statusCredit[i] );
            }
            System.out.println();
        }
    }
    public static class Student{
        String name;
        String surName;
        String middleName;
        int age;
        Student(){}
        Student(String name,String surName,String middleName,int age){
            this.name = name;
            this.surName = surName;
            this.middleName = middleName;
            this.age = age;
        }
        public void displayInfo1(Student student){
            System.out.println("Информация о студенте:");
            System.out.print("Имя: "+student.name+"; ");
            System.out.print(" Фамилия: "+student.surName+"; ");
            System.out.print(" Отчество: "+student.middleName+"; ");
            System.out.print(" Возраст: "+student.age+"; ");
            System.out.println();
        }
    }
}
