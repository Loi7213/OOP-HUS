package lab11.iterator;

public class ProductCatalog implements Iterable {
    private String[] productCatalog;

    public ProductCatalog(String[] productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(productCatalog);
    }
}

