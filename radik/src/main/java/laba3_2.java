import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
class Komplex {
    int a;
    int b;
    Komplex(){}
    Komplex(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Komplex setKomplexNumbers(Komplex number) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите комплексное число");
        number.a = in.nextInt();
        number.b = in.nextInt();
        return number;
    }

    public Komplex addKomlexnumbers(Komplex number1, Komplex number2) {
        Komplex sum = new Komplex();
        sum.a = number1.a + number2.a;
        sum.b = number1.b + number2.b;
        return sum;
    }
    public static Komplex addArrayKomplexnumbers (Komplex[] arrKomplex){
        Komplex sum;
        sum = arrKomplex[0];
        for(int i = 1; i<arrKomplex.length;i++){
            sum = sum.addKomlexnumbers(sum,arrKomplex[i]);
        }
        return sum;
    }
    void toStringKomplexnumber(Komplex number){System.out.print("("+number.a + "+" + number.b + "i)");}
}
public class laba3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n;
        n = in.nextInt();
        Komplex[] arrKomplex = new Komplex[n];
        for (int i = 0; i<arrKomplex.length; i++){
            arrKomplex[i] = new Komplex();
            arrKomplex[i] = arrKomplex[i].setKomplexNumbers(arrKomplex[i]);
        }
        Komplex sum;
        sum = arrKomplex[0].addArrayKomplexnumbers(arrKomplex);
        sum.toStringKomplexnumber(sum);
    }
}
