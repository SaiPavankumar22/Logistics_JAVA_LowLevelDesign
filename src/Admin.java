public class Admin {
    private String adminId;
    private String adminPassword;

    public Admin(String adminId, String adminPassword) {
        this.adminId = adminId;
        this.adminPassword = adminPassword;
    }

    public boolean validateAdmin(String adminId, String adminPassword) {
        return this.adminId.equals(adminId) && this.adminPassword.equals(adminPassword);
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }


}