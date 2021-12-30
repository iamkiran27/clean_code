package CLeanCode;

public class Customer extends LoginUser implements CartInterface, OrderInterface, PaymentSelection{

    private String email;
    private String password;
    private OrderInterface orderProduct;
    private  PaymentInterface payment;

    Customer(DataBase db) {
        super(db);
        orderProduct = new OrderProduct();


    }


    @Override
    public void addToCart() {
        System.out.println("Product added to cart");
    }

    @Override
    public void removeFromCart() {

        System.out.println("Product removed from the cart.");
    }

    @Override
    public void orderItem() {
        orderProduct.orderItem();

    }
    @Override
    public void addAddress(String address) {

        orderProduct.addAddress(address);

    }

    @Override
    public void payment(PaymentInterface p) {
        this.payment = p;
        this.payment.payment();
    }
}
