import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static ArrayList<Integer>price = new ArrayList<>();
    public static ArrayList<String>brand = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("########### RIDEVIBE DEALER ##########");
            System.out.println("1. Input car brand");
            System.out.println("2. Car list");
            System.out.println("3. Car list edit");
            System.out.println("4. Car filter");
            System.out.println("5. Done");
            System.out.println("######################################");
            int value = input.nextInt();
            switch (value) {
                case 1:
                Inputcarlist thing = new Inputcarlist();
                thing.inputingcarlist();
                break;

                case 2:
                carlist things1 = new carlist();
                things1.thecarlist();
                break;

                case 3:
                carlistedit things2 = new carlistedit();
                things2.editthecarlist();
                break;

                case 4:
                carfilter things3 = new carfilter();
                things3.docarfilter();
                break;

                case 5:
                input.close();
                System.exit(0);
                break;

            
          
            }
        }
    }
}
