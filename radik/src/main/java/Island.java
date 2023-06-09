import java.util.Objects;
import java.util.Scanner;

public class Island {

    private int pidr;
    String name;
    int square;

    Island() {
    }








    /// rjyc\
    Island(String name) {
        this.name = name;
    }
















    Island(String name, int square) {
        this.name = name;
        this.square = square;
    }

    public Island setMainland(Island isle) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название острова");
        isle.name = in.next();
        System.out.println("Введите площадь острова(км^2)");
        isle.square = in.nextInt();
        return isle;
    }

    public void toString(Island isle) {
        System.out.println("Остров " + isle.name + " с площадью " + isle.square + "(км^2)");
    }
}
