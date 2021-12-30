package CLeanCode;

import java.util.ArrayList;

public interface ProductServicesInterface {
    ArrayList<ProductsInterface> getProducts();
    void addProduct(ProductsInterface product);
    void deleteProduct(Products product);
}
