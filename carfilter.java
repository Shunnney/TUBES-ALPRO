import java.util.ArrayList;

public class carfilter {
    void docarfilter() {
        ArrayList<Integer> price = Menu.price;
        ArrayList<String> brand = Menu.brand;
        ArrayList<Integer> ppn = Menu.ppn;

        int max = price.get(0);
        String maxbrand = brand.get(0);
        int maxppn = ppn.get(0);
        for (int i = 0; i < price.size(); i++) {
            if (price.get(i) > max) {
                max = price.get(i);
                maxbrand = brand.get(i);
                maxppn = ppn.get(i);
            }
        }
        System.out.println("brand Mobil "+maxbrand + " || price Mobil : " + max +" || price PPN : " + maxppn);
    } 

    void nilaiterendah() {
        ArrayList<Integer> price = Menu.price;
        ArrayList<String> brand = Menu.brand;
        ArrayList<Integer> ppn = Menu.ppn;

        int min = price.get(0);
        String minbrand = brand.get(0);
        int minppn = ppn.get(0);
        for (int i = 0; i < price.size(); i++) {
            if (price.get(i) < min) {
                min = price.get(i);
                minbrand = brand.get(i);
                minppn = ppn.get(i);
            }
        }
        System.out.println("brand Mobil "+minbrand + " || price Mobil : " + min +" || price PPN : " + minppn);

    }
}