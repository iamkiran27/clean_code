package CLeanCode;

import java.util.List;

public class Application implements ApplicationInterface{
    private List<Products> products;
    private DataBase db;
    Application(DataBase db)
    {
        this.db = db;

        this.products = db.getProducts();

    }
    @Override
    public void showProducts() {
        //make conection to database and get all the relavent products objects and store them in the products list obj
        for(int i = 0 ; i < this.products.size(); i++)
        {

            System.out.println(this.products.get(i).getProductDetails(products.get(i)));

        }
    }

    @Override
    public PaymentInterface selectPaymetOption()
    {
        return  new CardPayment();
    }


    public static void main(String[] args) {
        DataBase db = new ApplicationDatabase();
        AdminOperations admin = new AdminOperations(db);

        admin.addProduct("Sneakers", 1000, "Shoes","ADidas" );
        admin.addProduct("Apple Smart watch", 3000, "Smart Watch","Apple" );
        admin.addProduct("Torn Jeans", 2000, "Jeans","Levis" );
        admin.addProduct("Bag", 700, "Luggage","Paragon" );

        Application amazon = new Application(db);
        amazon.showProducts();
        Customer c = new Customer(db);
        c.loginUser("abc.gmail.com", "1234");

        c.addToCart();
        c.orderItem();
        c.addAddress("House no 1234, Street no 5");
        PaymentInterface p = amazon.selectPaymetOption();
        c.payment(p);



    }


}
