package IC124.LE.InventorySystem.SubMenus;

import IC124.LE.InventorySystem.AdStInfo.Staff;

import java.util.*;


public class SubMenuStaff {

    private ArrayList<Staff> staffAcc;

    public SubMenuStaff(ArrayList<Staff> staffAcc){
        this.staffAcc = staffAcc;
    }

    //ADD STAFF
    public void AdminAddStaff() {

        boolean loopAddStaff = true;

        while (loopAddStaff) {

            System.out.println("\nADD STAFF");
            System.out.print("Enter Name     : ");
            String addN = scanStr.nextLine();
            System.out.print("Enter Username : ");
            String addUN = scanStr.nextLine();
            System.out.print("Enter Password : ");
            String addPW = scanStr.nextLine();

            staffAcc.add(new Staff(addN, addUN, addPW));
            System.out.println("\nStaff added successfully!");

            System.out.println("\nDo you want to continue?");
            System.out.println("[1] Add Staff");
            System.out.println("[0] Stop");
            enterChoice();

            if(choice.equals("1")){
                loopAddStaff = true;

            }else if (choice.equals("0")){
                loopAddStaff = false;

            }else{
                invalidChoice();
            }

      }
    }


    //ADMIN VIEW STAFF
    public void AdminViewStaff(){

        System.out.println("\nVIEW STAFF");

        if (staffAcc.isEmpty()) {
            System.out.println("\nNo Staff registered yet.");
        } else {
            System.out.println("\nRegistered Users:\n");
                for (int i = 0; i < staffAcc.size(); i++){
                    staffAcc.get(i).viewStaffInfo(i);
                }
        }
    }


    //ADMIN EDIT STAFF
    public void AdminEditStaff(){

        boolean loopEditStaff = true;

        while (loopEditStaff){

            System.out.println("\nVIEW STAFF");

            if (staffAcc.isEmpty()) {
                System.out.println("\nNo Staff registered yet.");
                break;
            } else {
                System.out.println("\nRegistered Users:");
                for (int i = 0; i < staffAcc.size(); i++){
                    staffAcc.get(i).viewStaffInfo(i);
                }
            }

            System.out.println("\nEDIT STAFF");
            System.out.print("Enter Staff Number : ");
            int staffNum = scanInt.nextInt();
            staffNum = staffNum - 1;

            if(staffNum >= 0 && staffNum < staffAcc.size()){

                System.out.print("Enter New Name   : ");
                String newN = scanStr.nextLine();
                System.out.print("Enter New Username : ");
                String newUN = scanStr.nextLine();
                System.out.print("Enter New Password : ");
                String newPW = scanStr.nextLine();

                staffAcc.set(staffNum, new Staff(newN, newUN, newPW));
                System.out.println("\nStaff edited successfully!");

            }else{
                System.out.println("Invalid Staff Number.");
            }

            System.out.println("\nDo you want to continue?");
            System.out.println("[1] Edit Staff");
            System.out.println("[0] Stop");
            enterChoice();

            if(choice.equals("1")){
                loopEditStaff = true;

            }else if (choice.equals("0")){
                loopEditStaff = false;

            }else{
                invalidChoice();
            }

        }
    }


    //ADMIN DELETE STAFF
    public void AdminDeleteStaff(){

        boolean loopDeleteStaff = true;

        while (loopDeleteStaff){

            System.out.println("\nVIEW STAFF");

            if (staffAcc.isEmpty()) {
                System.out.println("\nNo Staff registered yet.");
                break;
            } else {
                System.out.println("\nRegistered Users:");
                for (int i = 0; i < staffAcc.size(); i++){
                    staffAcc.get(i).viewStaffInfo(i);
                }
            }

            System.out.println("\nDELETE STAFF");
            System.out.print("Enter Staff Number : ");
            int staffNum = scanInt.nextInt();
            staffNum = staffNum - 1 ;

            if(staffNum >= 0 && staffNum < staffAcc.size()){

                staffAcc.remove(staffNum);
                System.out.println("\nStaff deleted successfully!");

            }else{
                System.out.println("Invalid Staff Number.");
            }


            System.out.println("\nDo you want to continue?");
            System.out.println("[1] Delete Staff");
            System.out.println("[0] Stop");
            enterChoice();

            if(choice.equals("1")){
                loopDeleteStaff = true;

            }else if (choice.equals("0")){
                loopDeleteStaff = false;

            }else{
                invalidChoice();
            }
        }
    }


    //ADMIN SEARCH STAFF
    public void AdminSearchStaff(){

        boolean loopSearchStaff = true;
        boolean found = false;

        while (loopSearchStaff){

            System.out.println("\nSEARCH STAFF");
            System.out.print("Enter Name to Search : ");
            String searchStaff = scanStr.nextLine();

            for (Staff staff : staffAcc) {
                if (staff.getName().equalsIgnoreCase(searchStaff)) {
                    found = true;
                    System.out.println("\nStaff found:");
                    System.out.println("Name: " + staff.getName());
                    System.out.println("Username: " + staff.getUsername());
                    break;

                }else if(!staff.getName().isEmpty()){
                    System.out.println("\nNo Staff registered yet.");
                }
            }

            System.out.println("\nDo you want to continue?");
            System.out.println("[1] Search Staff");
            System.out.println("[0] Stop");
            enterChoice();

            if(choice.equals("1")){
                loopSearchStaff = true;

            }else if (choice.equals("0")){
                loopSearchStaff = false;

            }else{
                invalidChoice();
            }
        }
    }


    //SORT STAFF
    public void AdminSortStaff(){

        System.out.println("\nVIEW SORTED STAFF");

        Collections.sort(staffAcc, new Comparator<Staff>() {

            public int compare(Staff u1, Staff u2) {
                return u1.getName().compareTo(u2.getName());
            }
        });

        if (staffAcc.isEmpty()) {
            System.out.println("\nNo Staff registered yet.");

        } else {
            System.out.println("\nRegistered Users:");
            for (Staff staff : staffAcc){
                staff.viewStaffInfo();
            }
        }

    }


    //------------------User choice------------------
    public static String choice;
    public static String enterChoice(){

        System.out.print("Enter Choice : ");
        choice = scanStr.nextLine();
        return choice;
    }

    public static void invalidChoice(){

        System.out.println("Invalid Choice. Please try Again......");
    }
    //-----------------------------------------------

    //--------------------Scanners-------------------
    static Scanner scanStr = new Scanner(System.in);
    static Scanner scanInt = new Scanner(System.in);
    //-----------------------------------------------

    public static class View_Order {
    }
}
