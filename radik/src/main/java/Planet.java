import java.util.Scanner;

class Planet{
    int quantityMainlands;
    int quantityOceans;
    int quantityIsland;
    Mainland[] continent;
    Ocean[] bidWater;
    Island[] isle;
    public Planet setPlanet(Planet globe){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во материков ");
        globe.quantityMainlands = in.nextInt();
        globe.continent = new Mainland[quantityMainlands];
        for (int i = 0; i< globe.quantityMainlands;i++){
            globe.continent[i] = new Mainland();
            globe.continent[i].setMainland(globe.continent[i]);
        }
        System.out.println("Введите кол-во океанов ");
        globe.quantityOceans = in.nextInt();
        globe.bidWater = new Ocean[quantityOceans];
        for (int i = 0; i<globe.quantityOceans;i++){
            globe.bidWater[i] = new Ocean();
            globe.bidWater[i].setOcean(globe.bidWater[i]);
        }
        System.out.println("Введите кол-во островов ");
        globe.quantityIsland = in.nextInt();
        globe.isle = new Island[quantityIsland];
        for (int i = 0; i< globe.quantityIsland;i++){
            globe.isle[i] = new Island();
            globe.isle[i].setMainland(globe.isle[i]);
        }
        return globe;
    }
    public void toString(Planet globe){
        System.out.println(" Информация о планете: ");
        for(int i = 0;i<quantityMainlands;i++){
            System.out.print((i+1)+")");
            globe.continent[i].toString(globe.continent[i]);
        }
        System.out.println();
        for(int i = 0;i<quantityOceans;i++){
            System.out.print((i+1)+")");
            globe.bidWater[i].toString(globe.bidWater[i]);
        }
        System.out.println();
        for(int i = 0;i<quantityIsland;i++){
            System.out.print((i+1)+")");
            globe.isle[i].toString(globe.isle[i]);
        }
    }
}