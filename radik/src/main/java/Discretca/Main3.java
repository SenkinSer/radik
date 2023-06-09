package Discretca;

public class Main3 {
    static double intensity = 5; //интенсивность
    static double laboriousness = 18000; //трудоёмкость
    static int countChannel = 3;
    static double time = 0.12;
    static double probability = 0.5;

    //нахождение факториала
    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        double bmin = intensity * laboriousness + 1;
        double bmax = 5 * bmin;
        double h = (bmax - bmin) / 10;

        //l
        while (bmin < bmax) {
            System.out.printf("%.1f ", bmin);
            System.out.print(" ");
            for (int i = 1; i <= countChannel; i++) {
                double l = (Math.pow(i, i - 1) * Math.pow(((intensity * laboriousness) / (i * bmin)), i + 1) * probability) / (getFactorial(i - 1) * Math.pow((1 - (intensity * laboriousness) / (i * bmin)), 2));
                System.out.printf("%.4f ", l);
            }
            System.out.println();
            bmin += h;
        }
        System.out.println();
        bmin = intensity * laboriousness + 1;
        bmax = 5 * bmin;

        //w
        while (bmin < bmax) {
            System.out.printf("%.1f ", bmin);
            System.out.print(" ");
            for (int i = 1; i <= countChannel; i++) {
                double w = ((laboriousness / bmin) * Math.pow(i, i - 1) * Math.pow(((intensity * laboriousness) / (bmin * i)), i) * probability) / (getFactorial(i) * Math.pow(((1 - ((intensity * laboriousness) / (bmin * i)))), 2));
                System.out.printf("%.4f ", w);
            }
            System.out.println();
            bmin += h;
        }
        System.out.println();
        bmin = intensity * laboriousness + 1;
        bmax = 5 * bmin;

        //u
        while (bmin < bmax) {
            System.out.printf("%.1f ", bmin);
            System.out.print(" ");
            for (int i = 1; i <= countChannel; i++) {
                double u = (((laboriousness / bmin) * Math.pow(i, i - 1) * Math.pow(((intensity * laboriousness) / (bmin * i)), i) * probability) / (getFactorial(i) * Math.pow(((1 - ((intensity * laboriousness) / (bmin * i)))), 2))) + (laboriousness / bmin);
                System.out.printf("%.4f ", u);
            }
            System.out.println();
            bmin += h;
        }
    }
}

