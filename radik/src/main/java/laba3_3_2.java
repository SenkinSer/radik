import java.util.Scanner;
/*class Complex {
    int a;
    int b;
    Complex(){}
    Complex(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Complex setComplexNumbers(Complex number) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите комплексное число");
        number.a = in.nextInt();
        number.b = in.nextInt();
        return number;
    }

    public Complex addComlexnumbers(Complex number1, Complex number2) {
        Complex sum = new Complex();
        sum.a = number1.a + number2.a;
        sum.b = number1.b + number2.b;
        return sum;
    }

    void toStringComplexnumber(Complex number) {
        System.out.print("("+number.a + "+" + number.b + "i)");
    }
}*/
class Polinom {
    Komplex[] coefficients;

    public Polinom setCoefficients(Polinom coefficients) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядок полинома");
        int n = scanner.nextInt();
        coefficients.coefficients = new Komplex[n];
        for (int i = 0; i < n; i++) {
            coefficients.coefficients[i] = new Komplex();
            coefficients.coefficients[i] = coefficients.coefficients[i].setKomplexNumbers(coefficients.coefficients[i]);
        }
        return coefficients;
    }

    public Polinom addPolinom(Polinom polinom1, Polinom polinom2) {
        int maxLenght;
        int minLenght;
        Polinom polinom3 = new Polinom();
        Polinom minpolinom = new Polinom();
        Polinom maxpolinom = new Polinom();
        if (polinom1.coefficients.length < polinom2.coefficients.length) {
            maxLenght = polinom2.coefficients.length;
            minLenght = polinom1.coefficients.length;
            minpolinom = polinom1;
            maxpolinom = polinom2;
        } else {
            maxLenght = polinom1.coefficients.length;
            minLenght = polinom2.coefficients.length;
            minpolinom = polinom2;
            maxpolinom = polinom1;
        }
        polinom3.coefficients = new Komplex[maxLenght];
        for (int i = 0; i < maxLenght - minLenght; i++) {
            polinom3.coefficients[i] = new Komplex(0,0);
        }
        int j = 0;
        for (int i = maxLenght-minLenght; i < maxLenght; i++) {
            polinom3.coefficients[i] = minpolinom.coefficients[j];
            j +=1;
        }
        for (int i = 0; i<polinom3.coefficients.length; i++){
            polinom3.coefficients[i] = polinom3.coefficients[i].addKomlexnumbers(polinom3.coefficients[i],maxpolinom.coefficients[i]);
        }
        return polinom3;
    }


    void toStringPolinom(Polinom polinom) {
        int j = polinom.coefficients.length;
        for (int i = 0; i < polinom.coefficients.length; i++) {
            polinom.coefficients[i].toStringKomplexnumber(polinom.coefficients[i]);
            if ((j - 1) == 0) {
                System.out.print("*x^" + (j - 1));
            } else {
                System.out.print("*x^" + (j - 1) + "+");
            }
            j -= 1;
        }
    }
}
    public class laba3_3_2 {
        public static void main(String[] args) {
            Komplex komplex = new Komplex();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество полиномов");
            int m = scanner.nextInt();
            Polinom[] arrPolinom = new Polinom[m];
            for (int i = 0; i < arrPolinom.length; i++) {
                arrPolinom[i] = new Polinom();
                arrPolinom[i] = arrPolinom[i].setCoefficients(arrPolinom[i]);
            }
            for (int i = 1; i < arrPolinom.length; i++) {
                arrPolinom[i] = arrPolinom[i].addPolinom(arrPolinom[i], arrPolinom[i - 1]);
            }
            arrPolinom[arrPolinom.length-1].toStringPolinom(arrPolinom[arrPolinom.length-1]);
        }
    }

