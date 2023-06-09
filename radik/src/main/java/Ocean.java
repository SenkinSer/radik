import java.util.Scanner;

public class Ocean {
    String name;
    int square;
    int averageDepth;
    Ocean(){}
    Ocean(String name){
        this.name = name;
    }
    Ocean(String name, int square){
        this.name = name;
        this.square = square;
    }
    Ocean(String name, int square,int averageDepth){
        this.name = name;
        this.square = square;
        this.averageDepth = averageDepth;
    }
    public Ocean setOcean(Ocean bigWater){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название океана");
        bigWater.name = in.next();
        System.out.println("Введите площадь океана(км^2) ");
        bigWater.square = in.nextInt();
        System.out.println("Введите среднюю глубину(м)");
        bigWater.averageDepth = in.nextInt();
        return bigWater;
    }
    public void toString(Ocean bigWater){
        System.out.println("Океан "+bigWater.name+" с площадью "+bigWater.square+"(км^2)"+" и средней глубиной "+bigWater.averageDepth+"(м)");
    }
}
