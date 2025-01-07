import java.util.ArrayList;

public class carlist {
    void thecarlist() {
        ArrayList<Integer> price = Menu.price;
        ArrayList<String> brand = Menu.brand; 
        ArrayList<Integer> ppn = Menu.ppn;

        PPN obj1 = new PPN();
        obj1.PPNmobil();

        System.out.println("##############################");
        System.out.println("Car price list");
        System.out.println("##############################");
        for (int i = 0; i < price.size(); i++) {
                System.out.print(" Car brand : " + brand.get(i)+" || ");
                System.out.println(" car price : " + price.get(i));
                System.out.println(" car price with ppn : "+ ppn.get(i) ); 
        }
    }
}