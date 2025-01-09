import java.util.ArrayList;

public class PPN {
    void PPNmobil(){
        
        ArrayList<Integer> price = Menu.price;
        ArrayList<Integer> ppn = Menu.ppn;

        for (int i = 0; i < price.size(); i++){
            ppn.add((price.get(i) * 12 / 100) + price.get(i)); 
        }
    }
}
