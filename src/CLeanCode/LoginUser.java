package CLeanCode;

public class LoginUser  implements LoginUserInterface{
    private DataBase db;
    LoginUser(DataBase db)
    {
        this.db = db;
    }
    @Override
    public void loginUser(String email, String password) {
        db.authenticateUser(email, password);
    }
}
