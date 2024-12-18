import java.util.HashMap;

class AdminDetails {
    private HashMap<String, Admin> adminMap;

    public AdminDetails() {
        adminMap = new HashMap<>();
        // Add default admins
        registerAdmin("admin1", "password1");
        registerAdmin("admin2", "password2");
    }

    public void registerAdmin(String adminId, String adminPassword) {
        Admin admin = new Admin(adminId, adminPassword);
        adminMap.put(adminId, admin);
    }

    public Admin loginAdmin(String adminId, String password) {
        Admin admin = adminMap.get(adminId);
        if (admin != null && admin.validateAdmin(adminId, password)) {
            return admin;
        }
        return null;
    }

    public HashMap<String,Admin> getAdminMap() {
        return adminMap;
    }

    public void setAdminMap(HashMap<String,Admin> adminMap) {
        this.adminMap = adminMap;
    }
}