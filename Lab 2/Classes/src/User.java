/**
 * User
 */
public class User {

    int userId;
    String password;
    String email;
    String usertype;

    public User(int userId, String password, String email, String usertype) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.usertype = usertype;
    }

    public void resetPassword(String newPass) {
        this.password = newPass;
    }
}