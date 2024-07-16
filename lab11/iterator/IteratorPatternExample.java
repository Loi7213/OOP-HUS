package lab11.iterator;

public class IteratorPatternExample {
    public static void main(String[] args) {
        String[] products = {"Product A", "Product B", "Product C", "Product D"};
        ProductCatalog catalog = new ProductCatalog(products);
        Iterator iterator = catalog.getIterator();

        System.out.println("Product Catalog:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
