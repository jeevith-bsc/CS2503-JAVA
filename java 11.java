import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - $" + price;
    }
}

public class Labprog11 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Keyboard", 45.50));
        products.add(new Product(102, "Mouse", 20.00));
        products.add(new Product(103, "Monitor", 150.00));
        products.add(new Product(104, "Laptop", 750.00));

        System.out.println("Original List:");
        products.forEach(System.out::println);

        // Sort by price using lambda
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by Price:");
        products.forEach(System.out::println);

        // Sort by name using lambda
        products.sort((p1, p2) -> p1.name.compareToIgnoreCase(p2.name));
        System.out.println("\nSorted by Name:");
        products.forEach(System.out::println);
    }
}
