import java.util.HashMap;

public class Users {
    private String accountId;
    private String name;
    private String mobileNo;
    private String email;
    private String password;
    private String address;

    public Users(String accountId, String name, String mobileNo, String email, String password, String address) {
        this.accountId = accountId;
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
