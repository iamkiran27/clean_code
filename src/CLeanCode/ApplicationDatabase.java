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
        System.out.println("Connecting to database.......");
    }

    @Override
    public void closeConnection() {
        System.out.println("Closing connection with database......");

    }

}
