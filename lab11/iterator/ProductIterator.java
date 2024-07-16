package lab11.iterator;

public class ProductIterator implements Iterator {
    private String[] productCatalog;
    private int position = 0;

    public ProductIterator(String[] productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public boolean hasNext() {
        return position < productCatalog.length;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        return productCatalog[position++];
    }
}
