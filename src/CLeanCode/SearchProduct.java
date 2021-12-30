package CLeanCode;

public class SearchProduct  implements SearchProductInterface{
    private String productName;
    private DataBase db;
    SearchProduct(DataBase db)
    {
        this.db = db;
    }
    @Override
    public void searchProducts(String productName) {
        db.makeConnection();
        System.out.println("Searching for "+productName);
        //connect to data base and search for the product in database , show all the relavent product available.
    }

}
