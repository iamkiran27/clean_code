package CLeanCode;

public abstract class Customer extends LoginUser implements CartInterface, PaymentSelection, SearchProductInterface, OrderInterface{

    private String email;
    private String password;
    protected boolean isPrime;
    private final OrderInterface orderProduct;
    private PaymentInterface payment;
    private  SearchProductInterface searchProduct;

    Customer(LoginServicesInterface db) {
        super(db);
        orderProduct = new OrderProduct();
    }



    abstract void isPRimeCustomer();
    abstract void freeDeliveryCharges();
    abstract void makePrimeCustomer();
//
    @Override
    public void addToCart() {
        System.out.println("Product added to cart");
    }

    @Override
    public void removeFromCart() {

        System.out.println("Product removed from the cart.");
    }


    public void orderItem() {
        orderProduct.orderItem();

    }

    public void addAddress(String address) {

        orderProduct.addAddress(address);

    }

    @Override
    public void payment(PaymentInterface p) {
        this.payment = p;
        this.payment.payment();
    }

    @Override
    public void searchProducts(String productName) {
searchProduct.searchProducts(productName);
    }
}
