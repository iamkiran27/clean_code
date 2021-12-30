package CLeanCode;

public class UpiPayment implements  PaymentInterface {

    @Override
    public void payment() {
        System.out.println("PAying through upi.");
    }
}
