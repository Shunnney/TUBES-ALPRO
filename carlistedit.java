import java.util.Scanner;
import java.util.ArrayList;

public class carlistedit {
    void editthecarlist() {
        ArrayList<Integer> price = Menu.price;
        ArrayList<String> brand = Menu.brand;
        Scanner input = new Scanner(System.in);
        int number = 1;
        System.out.println("##################################");
        System.out.println(" input to Edit Car List"); 
        System.out.println("##################################");

        for (int i = 0; i < price.size(); i++) {
         
                System.out.print(number +"  Car Brand : " + brand.get(i)+" ||");
                System.out.println("  Car Price : " + price.get(i));
                number++;
            
        }
        System.out.println("##################################");
        int sellect = input.nextInt(); 
        
        
            if (sellect > 0 &&sellect <= price.size()) {
                sellect --;
                System.out.println("Car Brand : "+ brand.get(sellect)+" || Car Price : "+ price.get(sellect));
                System.out.println("##################################");
                System.out.println("Enter the car brand : ");
                brand.set(sellect, input.next());
                System.out.println("Enter the car price : ");
                price.set(sellect, input.nextInt());  
}
        }
    }
