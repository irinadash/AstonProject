import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Product {
    String ProductName;
    String date;
    String fabricator;
    String countryOfOrigin;
    int price;
    Boolean status;


    public Product(String ProductName, String date, String fabricator, String countryOfOrigin, int price, Boolean status) {
        this.ProductName = ProductName;
        this.date = date;
        this.fabricator = fabricator;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.status = status;
    }

    public static void main(String[] args) {
        Product[] productArray = new Product[5];
        productArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productArray[1] = new Product("Apple iPhone 16", "21.09.2024", "Apple", "USA", 6000, true);
        productArray[2] = new Product("Apple iPhone 15", "17.09.2023", "Apple", "USA", 5000, true);
        productArray[3] = new Product("Samsung Galaxy S25", "30.12.2024", "Samsung", "Korea", 7214, true);
        productArray[4] = new Product("Samsung Galaxy A35", "29.01.2025", "Samsung Corp.", "Korea", 5415, false);
        for (int i = 0; i < productArray.length; i++) {
            System.out.println(productArray[i].ProductName);
            System.out.println(productArray[i].date);
            System.out.println(productArray[i].fabricator);
            System.out.println(productArray[i].countryOfOrigin);
            System.out.println(productArray[i].price);
            System.out.println(productArray[i].status);
        }
        System.out.println(Arrays.toString(productArray));
    }

}
