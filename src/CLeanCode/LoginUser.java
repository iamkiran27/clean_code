package CLeanCode;

public abstract class LoginUser  implements LoginUserInterface{
    private LoginServicesInterface ls;
    LoginUser(LoginServicesInterface ls)
    {
        this.ls = ls;
    }
    @Override
    public void loginUser(String email, String password) {
        ls.authenticateUser(email, password);
    }
}
