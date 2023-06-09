import java.util.Scanner;

public class PreciousStones {
        String name;
        int pricePerCarat;
        int carat;
        int transparency;

        public PreciousStones(String name, int pricePerCarat, int transparency) {
                this.name = name;
                this.pricePerCarat = pricePerCarat;
                this.transparency = transparency;
        }
        public PreciousStones() {}
        public PreciousStones setNewPreciousStones(PreciousStones stones){
                Scanner in = new Scanner(System.in);
                System.out.println("Введите название камня");
                stones.name = in.next();
                System.out.println("Введите цену камня за карат ");
                stones.pricePerCarat = in.nextInt();
                return stones;
        }
        public void toString(PreciousStones stones){
                System.out.println("Камень: "+stones.name+"; с ценой за карат = "+stones.pricePerCarat+ " и прозрачностью: " +stones.transparency);
        }
}