package CLeanCode;

public class NonPrimeCustomer extends Customer implements PrimeInterface{

    NonPrimeCustomer(LoginServicesInterface db) {
        super(db);
    }

    @Override
    void isPRimeCustomer() {
        if(!super.isPrime)
            System.out.println("Not a prime customer");
        else
            System.out.println("Prime customer");
    }

    @Override
    void freeDeliveryCharges() {
        System.out.println("No free delivery charges , upgrade to prime cusrtomer to get free delivery charges");
    }

    @Override
    void makePrimeCustomer() {

        this.addPrimeMembership();
    }

    @Override
    public void addPrimeMembership() {
        System.out.println("Added prime membership");
        super.isPrime = true;
    }
}
