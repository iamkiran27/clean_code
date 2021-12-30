package CLeanCode;

public class CardPayment implements PaymentInterface{
    @Override
    public void payment() {
        System.out.println("Paying through card.");
    }
    public void showInvoice()
    {
        System.out.println("Processing invoice of the order place.");
    }
}
