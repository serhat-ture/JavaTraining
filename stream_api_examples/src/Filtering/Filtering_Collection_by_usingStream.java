package Filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * filtering Collection by using Stream
 *
 */
public class Filtering_Collection_by_usingStream {
    private static List < Product > productsList = new ArrayList < Product > ();

    public static void main(String[] args) {

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));


        List < Float > productPriceList = productsList.stream()
                .filter(p -> p.getPrice() > 30000) // filtering data
                .map(Product::getPrice) // fetching price by referring getPrice method
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList);
        System.out.println("*********************");


        // max() method to get max Product price
        Product productA = productsList.stream()
                .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

        System.out.println(productA.getPrice());
        // min() method to get min Product price
        Product productB = productsList.stream()
                .max((product1, product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1).get();
        System.out.println(productB.getPrice());
        System.out.println("*********************");

        // Using Collectors's method to sum the prices.
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product -> product.getPrice()));
        System.out.println(totalPrice3);

        System.out.println("*********************");

        // This is more compact approach for filtering data
        productsList.stream().filter(product -> product.getPrice() == 30000)
                .forEach(product -> System.out.println(product.getPrice()));

        System.out.println("*********************");

        // With Java 8 Stream API'S
        withStreamAPI();
    }

    private static void withStreamAPI() {
        // filtering data of list
        List < Float > productPriceList = productsList.stream().filter((product) -> product.getPrice() > 25000)
                .map((product) -> product.getPrice()).collect(Collectors.toList());
        // displaying data
        productPriceList.forEach((price) -> System.out.println(price));
    }
}