import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GardenShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        GardenShop gardenShop = new GardenShop();
        int option;
        String name;
        double price;

        do {
            System.out.println("----- Garden Shop App -----");
            System.out.println("1 - add flower");
            System.out.println("2 - add fertilizer");
            System.out.println("3 - add cloth");
            System.out.println("4 - display all products");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Type: ");
                    String type = scanner.nextLine();

                    Flower flower = new Flower (name,price,type);
                    gardenShop.addFlower(flower);

                    break;
                case 2:
                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Purpose: ");
                    String purpose = scanner.nextLine();

                    Fertilizer fertilizer = new Fertilizer(name,price,purpose);
                    gardenShop.addFertilizer(fertilizer);

                    break;
                case 3:
                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Size: ");
                    String size = scanner.nextLine();

                    Cloth cloth = new Cloth(name,price,size);
                    gardenShop.addCloth(cloth);

                    break;
                case 4:
                    gardenShop.displayAll();
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}
