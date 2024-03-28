package IC124.LE.InventorySystem.TestSystem;

import IC124.LE.InventorySystem.SubMenus.SubMenuProduct;
import IC124.LE.InventorySystem.SubMenus.SubMenuStaff;

import java.util.*;

public class MainSystem {
    public static void main(String[] args){

    System.out.println("\nWELCOME TO HARVEST EASE INVENTORY SYSTEM");

    //================================================SIGN IN===========================================================
        while (loopSignIn){

            System.out.println("\nSIGN IN");
            System.out.print("Enter Username : ");
            String logUN = scanStr.nextLine();
            System.out.print("Enter Password : ");
            String logPW = scanStr.nextLine();

                if (logUN.equals("Admin") && logPW.equals("admin123")){
                    System.out.println("Welcome Admin.....");
                    loopAdminMenu = true;

                }else if(loginSystem.login(logUN, logPW)){
                    loopStaffMenu = true;
                    System.out.println("Login successful!");

                }else{
                    System.out.println("Wrong Credentials Please try Again...");
                }
        //==============================================================================================================

        //==============================================ADMIN MENU======================================================
            while (loopAdminMenu){

                System.out.println("\nADMIN MENU");
                System.out.println("[1] Staff");
                System.out.println("[2] Products");
                System.out.println("[3] Inventory");
                System.out.println("[4] Reports");
                System.out.println("[0] Log-Out");

                switch (SubMenuStaff.enterChoice()){

                    //STAFF
                    case "1":
                        loopAdminStaff = true;

                        while (loopAdminStaff){
                            System.out.println("\nADMIN STAFF");
                            System.out.println("[1] Add Staff");
                            System.out.println("[2] View Staff");
                            System.out.println("[3] Edit Staff");
                            System.out.println("[4] Delete Staff");
                            System.out.println("[5] Search Staff");
                            System.out.println("[6] Sort Staff");
                            System.out.println("[0] Back");

                            switch (SubMenuStaff.enterChoice()){

                                //ADD STAFF
                                case "1":
                                    menuStaff.AdminAddStaff();
                                    break;

                                //VIEW STAFF
                                case "2":
                                    menuStaff.AdminViewStaff();
                                    break;

                                //EDIT STAFF
                                case "3":
                                    menuStaff.AdminEditStaff();
                                    break;

                                //DELETE STAFF
                                case "4":
                                    menuStaff.AdminDeleteStaff();
                                    break;

                                //SEARCH STAFF
                                case "5":
                                    menuStaff.AdminSearchStaff();
                                    break;

                                //SORT STAFF
                                case "6":
                                    menuStaff.AdminSortStaff();
                                    break;

                                //BACK
                                case "0":
                                    loopAdminStaff = false;
                                    break;

                                //DEFAULT
                                default:
                                    SubMenuStaff.invalidChoice();
                            }
                        }
                        break;

                    //PRODUCTS
                    case "2":
                        loopAdminProduct = true;

                        while (loopAdminProduct){

                            System.out.println("\nADMIN PRODUCTS");
                            System.out.println("[1] Add Products");
                            System.out.println("[2] View Products");
                            System.out.println("[3] Edit Products");
                            System.out.println("[4] Delete Products");
                            System.out.println("[0] Back");

                            switch (SubMenuProduct.enterChoice()){

                                //ADD PRODUCT
                                case "1":
                                    menuProduct.AdminAddProduct();
                                    break;

                                //VIEW PRODUCT
                                case "2":
                                    menuProduct.AdminViewProduct();
                                    break;

                                //EDIT PRODUCT
                                case "3":
                                    menuProduct.AdminEditProduct();
                                    break;

                                //DELETE PRODUCT
                                case "4":
                                    menuProduct.AdminDeleteProduct();
                                    break;

                                //BACK
                                case "0":
                                    loopAdminProduct = false;
                                    break;

                                //DEFAULT
                                default:
                                    SubMenuProduct.invalidChoice();
                            }
                        }
                        break;

                    //INVENTORY
                    case "3":
                        loopAdminInventory = true;
                        break;

                    //REPORTS
                    case "4":
                        loopAdminReports = true;
                        break;

                    //LOG-OUT
                    case "0":
                        loopAdminMenu = false;
                        break;

                    //DEFAULT
                    default:
                        SubMenuProduct.invalidChoice();
                }
            }

        //==============================================================================================================

        //==============================================STAFF MENU======================================================
            while (loopStaffMenu){

                System.out.println("\nSTAFF MENU");
                System.out.println("[1] Cashier");
                System.out.println("[2] View Inventory");
                System.out.println("[3] View Orders");
                System.out.println("[0] Log-Out");

                switch (SubMenuStaff.enterChoice()){

                    //CASHIER
                    case "1":
                        break;

                    //VIEW INVENTORY
                    case "2":
                        break;

                    //VIEW ORDERS
                    case "3":
                        break;
                    //LOG_OUT
                    case "0":
                        loopStaffMenu = false;
                        break;
                }
            }
        //==============================================================================================================
        }//loopSignIn
    }//MainSystem

    //-----------------------Object----------------------------
    static  LoginSystem loginSystem = new LoginSystem();
    static SubMenuStaff menuStaff = new SubMenuStaff(loginSystem.staffAcc);
    static SubMenuProduct menuProduct = new SubMenuProduct();
    //---------------------------------------------------------

    //--------------------Loops---------------------
    static boolean loopSignIn = true;
    static boolean loopAdminMenu = false;
    static boolean loopAdminStaff = false;
    static boolean loopAdminProduct = false;
    static boolean loopAdminInventory = false;
    static boolean loopAdminReports = false;
    static boolean loopStaffMenu = false;

    //-----------------------------------------------

    //--------------------Scanners-------------------
    static Scanner scanStr = new Scanner(System.in);
    //-----------------------------------------------

}
