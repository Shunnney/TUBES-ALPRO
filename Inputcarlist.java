import java.util.Scanner;
import java.util.ArrayList;

public class Inputcarlist {
    void inputingcarlist() {
        ArrayList<Integer> price = Menu.price;
        ArrayList<String> brand = Menu.brand;
        Scanner input = new Scanner(System.in);

        System.out.println("############ Input Car Brand ##########");
        brand.add(input.next());

        System.out.println("############ Input Car Price ##########");
        price.add(input.nextInt());
    }
}