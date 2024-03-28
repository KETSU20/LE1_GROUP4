package IC124.LE.InventorySystem.TestSystem;

import IC124.LE.InventorySystem.AdStInfo.Staff;

import java.util.ArrayList;

public class LoginSystem {

    ArrayList<Staff> staffAcc;

    public LoginSystem() {
        staffAcc = new ArrayList<>();
    }

    public boolean login(String username, String password) {
        for (Staff user : staffAcc) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
