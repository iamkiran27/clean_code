package CLeanCode;

public class SearchProduct  implements SearchProductInterface{
    private String productName;

    @Override
    public void searchProducts(String productName) {
        System.out.println("Searching for "+productName);
        //connect to data base and search for the product in database , show all the relavent product available.
    }

}
