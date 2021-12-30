package CLeanCode;

public class PrimeCustomer extends Customer{
    PrimeCustomer(LoginServicesInterface ls) {
        super(ls);
    }

    @Override
    void isPRimeCustomer() {
        System.out.println("Is a prime customer");
    }

    @Override
    void freeDeliveryCharges() {
        System.out.println("Free delivery charges..");
    }

    @Override
    void makePrimeCustomer() {
        System.out.println("Already a prime customer.");
    }

}
