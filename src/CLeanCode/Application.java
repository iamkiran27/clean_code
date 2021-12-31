package CLeanCode;


import java.util.ArrayList;

public  class Application implements ApplicationInterface{
    private ArrayList<ProductsInterface> products;
    private DataBase db;
    private ProductServicesInterface pd;
    Application(DataBase db,ProductServicesInterface pd)
    {
        this.pd = pd;
        this.db = db;
        this.products = pd.getProducts();

    }


    @Override
    public void showProducts() {

        db.makeConnection();
        System.out.println("Fetching Products......");




        //make conection to database and get all the relavent products objects and store them in the products list obj
        for(int i = 0 ; i < this.products.size(); i++)
        {


         System.out.println(this.products.get(i).getProductDetails((Products) products.get(i)));


        }
    }

    @Override
    public PaymentInterface selectPaymetOption()
    {
        return  new CardPayment();
    }

    @Override
    public void showOrderStatus() {
        System.out.println("Order placed successfully !!!");
    }

    @Override
    public void trackOrder() {
        System.out.println();
    }


    public static void main(String[] args) {

        DataBase db = new ApplicationDatabase();
        ProductServicesInterface ps = new ProductServices();
        AdminOperations admin = new AdminOperations(ps);

        admin.addProduct("Sneakers", 1000, "Shoes","ADidas" );
        admin.addProduct("Apple Smart watch", 3000, "Smart Watch","Apple" );
        admin.addProduct("Torn Jeans", 2000, "Jeans","Levis" );
        admin.addProduct("Bag", 700, "Luggage","Paragon" );

        Application amazon = new Application(db, ps);
        amazon.showProducts();

        Customer c = new NonPrimeCustomer(new LognServices());
        c.loginUser("abc.gmail.com", "1234");


        c.isPRimeCustomer();
        c.makePrimeCustomer();

        c.isPRimeCustomer();
        c = new PrimeCustomer(new LognServices());

        c.makePrimeCustomer();
        c.addToCart();

        c.orderItem();
        c.addAddress("House no 1234, Street no 5");

        PaymentInterface p = amazon.selectPaymetOption();
        c.payment(p);

    }


}
