import java.util.ArrayList;
import java.util.List;

public class UsersDetails {
    private final List<Users> usersList;

    public UsersDetails() {
        usersList = new ArrayList<>();
    }

    public void registerUser(String accountId, String name, String mobileNo, String email, String password, String address) {
        Users user = new Users(accountId, name, mobileNo, email, password, address);
        usersList.add(user);
    }

    public Users loginUser(String accountId, String password) {
        for (Users user : usersList) {
            if (user.getAccountId().equals(accountId) && user.validatePassword(password)) {
                return user;
            }
        }
        return null;
    }

    public Users getUser(String userId) {
        for (Users user : usersList) {
            if (user.getAccountId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public List<Users> getUsersList() {
        return usersList;
    }
}
