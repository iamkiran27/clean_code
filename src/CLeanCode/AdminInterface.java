package CLeanCode;

public interface AdminInterface {
    void deleteProduct(Products p);
    void addProduct(String productName, int productPrice, String productCartegory, String manufacturedBy);
    void updateProductDetails(Products p);
}
