import java.util.Scanner;

public class Mainland {
    String name;
    int square;
    Mainland(){}
    Mainland(String name){
        this.name = name;
    }
    Mainland(String name, int square){
        this.name = name;
        this.square = square;
    }
    public Mainland setMainland(Mainland continent){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название материка");
        continent.name = in.next();
        System.out.println("Введите площадь материка(км^2)");
        continent.square = in.nextInt();
        return continent;
    }
    public void toString(Mainland continent){
        System.out.println("Материк "+continent.name+" с площадью "+continent.square+"(км^2)");
    }
}
