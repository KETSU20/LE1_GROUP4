package IC124.LE.InventorySystem.AdStInfo;

import java.util.ArrayList;

public class Staff {

    private String name, username, password;

    public Staff(){}

    public Staff(String name, String username, String password) {

        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void viewStaffInfo(int i){

        System.out.println("\nStaff : " + (i+1));
        System.out.println("Name     : " + name);
        System.out.println("Username : " + username);
    }

    public void viewStaffInfo(){

        System.out.println("\nName     : " + name);
        System.out.println("Username : " + username);
    }

    public String toString() {
        return "Name     : " + name + "\nUsername : " + username;
    }
}
