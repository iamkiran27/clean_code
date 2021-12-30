package CLeanCode;

public class OrderProduct implements OrderInterface{
   private String address;
    @Override
    public void orderItem() {
        System.out.println("Order placed successfully !");
    }

    @Override
    public void addAddress(String address) {
        this.address = address;

    }
}
