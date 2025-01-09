import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    void doDelete() {
        ArrayList<Integer> price = Menu.price;
        ArrayList<String> brand = Menu.brand;
        ArrayList<Integer> PPN = Menu.ppn;

        Scanner input = new Scanner(System.in);
        PPN obj1 = new PPN();
        obj1.PPNmobil();

        for (int i = 0; i < price.size(); i++) {
            System.out.print((i+1) +" brand Mobil : " + brand.get(i)+" ||");
            System.out.println("price Mobil : " + price.get(i));
    }
    System.out.println("################################");
        int sellect = input.nextInt();
        
            if (sellect > 0 &&sellect <= price.size()) {
                sellect--;
                price.remove(sellect);
                brand.remove(sellect);
                PPN.remove(sellect);
            }
            else{
                doDelete();
            }

    }
}