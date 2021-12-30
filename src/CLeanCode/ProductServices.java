package CLeanCode;

import java.util.ArrayList;

public class ProductServices  extends  Products implements ProductServicesInterface{
    private ArrayList<ProductsInterface> products;
    ProductServices()
    {
        super();
        products = new ArrayList<>();
    }
    @Override
    public ArrayList<ProductsInterface> getProducts() {

        return products;

    }

    @Override
    public void addProduct(ProductsInterface product) {

        products.add(product);

    }

    @Override
    public void deleteProduct(Products product) {
        products.remove(product);
    }

}
