package CLeanCode;

public class LognServices implements LoginServicesInterface{

    @Override
    public void authenticateUser(String email, String password) {
        // System.out.println("Authenticate user by checking the user in data base exists or not");
        System.out.println("USer Logged in successfully ..!!");
    }
}
