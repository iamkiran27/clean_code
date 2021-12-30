package CLeanCode;

public class CardPayment implements PaymentInterface{
    @Override
    public void payment() {
        System.out.println("PAying through card.");
    }
}
