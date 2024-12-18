import java.util.HashMap;

public class UsersDetails {
    private final HashMap<String, Users> usersMap;

    public UsersDetails() {
        usersMap = new HashMap<>();
    }

    public void registerUser(String accountId, String name, String mobileNo, String email, String password, String address) {
        Users user = new Users(accountId, name, mobileNo, email, password, address);
        usersMap.put(accountId, user);
    }

    public Users loginUser(String accountId, String password) {
        Users user = usersMap.get(accountId);
        if (user != null && user.validatePassword(password)) {
            return user;
        }
        return null;
    }

    public Users getUser(String userId) {
        return usersMap.get(userId);
    }

    public HashMap<String,Users> getUsersMap() {
        return usersMap;
    }
}
