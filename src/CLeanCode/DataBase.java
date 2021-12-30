package CLeanCode;

import java.util.List;

public interface DataBase {
    void makeConnection();
    void closeConnection();
    List<Products> getProducts();
    void addProduct(Products product);
    void deleteProduct(Products product);
    void authenticateUser(String email, String password);
}
