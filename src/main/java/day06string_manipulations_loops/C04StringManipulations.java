package day06string_manipulations_loops;
public class C04StringManipulations {
    public static void main(String[] args) {

//Example 5:  String shirtPrice = "$12.99";
//            String bookPrice = "$35.99";
//            Type code to find the sum of the shirt and book prices.
       String shirtPrice = "$12.99";
       String bookPrice = "$35.99";
       System.out.println(shirtPrice + bookPrice);//$12.99$35.99

        String shirtPrice1 = "$12.99";
        String newShirtPrice = shirtPrice1.replaceAll("[^0-9.]","");
        System.out.println(newShirtPrice);//12.99

        String bookPrice1 = "$35.99";
        String newBookPrice = bookPrice1.replaceAll("[^0-9.]","");
        System.out.println(newBookPrice);//35.99

        double doubleShirtPrice = Double.valueOf(newShirtPrice);//12.99
        double doubleBookPrice = Double.valueOf(newBookPrice);

        System.out.println("Total Price: " + (doubleShirtPrice + doubleBookPrice));//48.980000000000004
    }
}
