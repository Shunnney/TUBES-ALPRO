public class carlist {
    void thecarlist() {
        int []price = base.price;
        String []brand = base.brand;
        PPN carpricewppn = new PPN();
        carpricewppn.PPN(); 

        System.out.println("##############################");
        System.out.println("Car price list");
        System.out.println("##############################");
        for (int i = 1; i < price.length; i++) {
            if (price[i] != 0) {
                System.out.print("Car brand : " + brand[i]+" || ");
                System.out.println("car price : " + price[i]);
                System.out.println("car price with ppn : "+ );
            }
        }
    }
}