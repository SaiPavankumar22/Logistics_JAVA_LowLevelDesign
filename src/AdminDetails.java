import java.util.ArrayList;
import java.util.List;

class AdminDetails {
    private List<Admin> adminList;

    public AdminDetails() {
        adminList = new ArrayList<>();
        registerAdmin("admin1", "password1");
        registerAdmin("admin2", "password2");
    }

    public void registerAdmin(String adminId, String adminPassword) {
        Admin admin = new Admin(adminId, adminPassword);
        adminList.add(admin);
    }

    public Admin loginAdmin(String adminId, String password) {
        for (Admin admin : adminList) {
            if (admin.getAdminId().equals(adminId) && admin.validateAdmin(adminId, password)) {
                return admin;
            }
        }
        return null;
    }

    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> adminList) {
        this.adminList = adminList;
    }
}
