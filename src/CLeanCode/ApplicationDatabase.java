package CLeanCode;

import java.util.ArrayList;
import java.util.List;

public class ApplicationDatabase implements DataBase{

    private final List<Products> products;
    ApplicationDatabase()
    {
        products = new ArrayList<>();
    }

    @Override
    public void makeConnection() {
        System.out.println("Connecting to database");
    }

    @Override
    public void closeConnection() {
        System.out.println("Closing connection with database");

    }

    @Override
    public List<Products> getProducts() {
        return products;

    }

    @Override
    public void addProduct(Products product) {
        products.add(product);

    }

    @Override
    public void deleteProduct(Products product) {
        products.remove(product);
    }

    @Override
    public void authenticateUser(String email, String password) {
       // System.out.println("Authenticate user by checking the user in data base exists or not");
    }
}
