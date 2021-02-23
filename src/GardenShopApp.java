import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GardenShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        int option;

        do {
            System.out.println("----- Garden Shop App -----");
            System.out.println("1 - add flower");
            System.out.println("2 - add fertilizer");
            System.out.println("3 - display all products");
            System.out.println("0 - quit");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}
