package IC124.LE.InventorySystem.SubMenus;

import IC124.LE.InventorySystem.AdStInfo.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuProduct {

    private ArrayList<Product> foodList;
    private ArrayList<Product> beveragesList;
    private ArrayList<Product> medicineList;
    private ArrayList<ArrayList<Product>> productList;


    public SubMenuProduct(){
        this.foodList = new ArrayList<>();
        this.beveragesList = new ArrayList<>();
        this.medicineList = new ArrayList<>();
        this.productList = new ArrayList<ArrayList<Product>>();
    }

    //ADMIN ADD PRODUCT
    public void AdminAddProduct(){

        boolean loopAddProduct = true;

        while (loopAddProduct){

            System.out.println("\nADD PRODUCT");
            System.out.print("Enter Product Name  : ");
            String addProdN = scanStr.nextLine();
            System.out.print("Enter Product Price : ");
            double addProdP = scanDouble.nextDouble();

            System.out.println("\nADD PRODUCT TO:");
            System.out.println("[1] Food");
            System.out.println("[2] Beverages");
            System.out.println("[3] Medicine");
            enterChoice();

                if(choice.equals("1")){
                    foodList.add(new Product(addProdN, addProdP));
                    System.out.println("\nProduct added successfully!");

                }else if(choice.equals("2")){
                    beveragesList.add(new Product(addProdN, addProdP));
                    System.out.println("\nProduct added successfully!");

                }else if(choice.equals("3")){
                    medicineList.add(new Product(addProdN, addProdP));
                    System.out.println("\nProduct added successfully!");

                }else{
                    invalidChoice();
                }

            System.out.println("\nDo you want to continue?");
            System.out.println("[1] Add Product");
            System.out.println("[0] Stop");
            enterChoice();

            if(choice.equals("1")){
                loopAddProduct = true;

            }else if (choice.equals("0")){
                loopAddProduct = false;

            }else{
                invalidChoice();
            }
        }
    }


    //ADMIN VIEW PRODUCT
    public void AdminViewProduct(){

        boolean loopViewProduct = true;

        while (loopViewProduct){

            System.out.println("\nVIEW PRODUCT CATEGORY");
            System.out.println("[1] Food");
            System.out.println("[2] Beverages");
            System.out.println("[3] Medicine");
            System.out.println("[4] View All");
            System.out.println("[0] Back");
            enterChoice();

                if (choice.equals("1")){
                    System.out.println("\nFOOD PRODUCT");
                    if(foodList.isEmpty()){
                        System.out.println("\nNo food product registered yet...");
                    }else{
                        for (int i = 0; i < foodList.size(); i++){
                            foodList.get(i).viewProdInfo(i);
                        }
                    }

                }else if (choice.equals("2")){
                    System.out.println("\nBEVERAGES PRODUCT");
                    if(beveragesList.isEmpty()){
                        System.out.println("\nNo beverages product registered yet...");
                    }else{
                        for (int i = 0; i < beveragesList.size(); i++){
                            beveragesList.get(i).viewProdInfo(i);
                        }
                    }

                }else if (choice.equals("3")){
                    System.out.println("\nMEDICINE PRODUCT");
                    if(medicineList.isEmpty()){
                        System.out.println("\nNo medicine product registered yet...");
                    }else{
                        for (int i = 0; i < medicineList.size(); i++){
                            medicineList.get(i).viewProdInfo(i);
                        }
                    }

                }else if(choice.equals("4")) {
                    System.out.println("\nVIEW ALL PRODUCT");

                    System.out.println("\nFOOD PRODUCT");
                    if (foodList.isEmpty()) {
                        System.out.println("\nNo product registered yet...");
                    } else {
                        for (int i = 0; i < foodList.size(); i++) {
                            foodList.get(i).viewProdInfo(i);
                        }
                    }

                    System.out.println("\nBEVERAGES PRODUCT");
                    if (foodList.isEmpty()) {
                        System.out.println("\nNo product registered yet...");
                    } else {
                        for (int i = 0; i < beveragesList.size(); i++) {
                            beveragesList.get(i).viewProdInfo(i);
                        }
                    }

                    System.out.println("\nMEDICINE PRODUCT");
                    if (medicineList.isEmpty()) {
                        System.out.println("\nNo product registered yet...");
                    } else {
                        for (int i = 0; i < medicineList.size(); i++) {
                            medicineList.get(i).viewProdInfo(i);
                        }
                    }

                }else if(choice.equals("0")){
                    loopViewProduct = false;

                }else{
                    invalidChoice();
                }
        }
    }


    //ADMIN EDIT PRODUCT
    public void AdminEditProduct(){

        boolean loopEditProduct = true;

        while (loopEditProduct) {

            System.out.println("\nEDIT PRODUCTS");
            System.out.println("[1] Food");
            System.out.println("[2] Beverages");
            System.out.println("[3] Medicine");
            System.out.println("[0] Back");
            enterChoice();

                if (choice.equals("1")){

                    boolean loopEditFood = true;

                    while (loopEditFood){

                        System.out.println("\nFOOD PRODUCT");
                        if(foodList.isEmpty()){
                            System.out.println("\nNo food product registered yet...");
                            loopEditFood = false;
                            break;
                        }else{
                            System.out.println("\nRegistered Product");
                            for (int i = 0; i < foodList.size(); i++){
                                foodList.get(i).viewProdInfo(i);
                            }
                        }

                        System.out.println("\nEDIT PRODUCT");
                        System.out.print("Enter Product Number : ");
                        int prodNum = scanInt.nextInt();
                        prodNum = prodNum - 1;

                        if(prodNum >= 0 && prodNum < foodList.size()){

                            System.out.print("Enter Product Name   : ");
                            String newProdN = scanStr.nextLine();
                            System.out.print("Enter Product Price  : ");
                            double newProdP = scanDouble.nextDouble();

                            foodList.set(prodNum, new Product(newProdN, newProdP));
                            System.out.println("\nProduct edited successfully!");

                        }else{
                            System.out.println("Invalid Product Number.");
                        }

                        System.out.println("\nDo you want to continue?");
                        System.out.println("[1] Edit Food Product");
                        System.out.println("[0] Stop");
                        enterChoice();

                        if(choice.equals("1")){
                            loopEditProduct = true;

                        }else if (choice.equals("0")){
                            loopEditFood = false;

                        }else {
                            invalidChoice();
                        }
                    }

                }else if(choice.equals("2")){

                    boolean  loopEditBeverages = true;

                    while (loopEditBeverages){

                        System.out.println("\nBEVERAGES PRODUCT");
                        if(beveragesList.isEmpty()){
                            System.out.println("\nNo beverages product registered yet...");
                            loopEditBeverages = false;
                            break;
                        }else{
                            System.out.println("\nRegistered Product");
                            for (int i = 0; i < beveragesList.size(); i++){
                                beveragesList.get(i).viewProdInfo(i);
                            }
                        }

                        System.out.println("\nEDIT PRODUCT");
                        System.out.print("Enter Product Number : ");
                        int prodNum = scanInt.nextInt();
                        prodNum = prodNum - 1;

                        if(prodNum >= 0 && prodNum < beveragesList.size()){

                            System.out.print("Enter Product Name   : ");
                            String newProdN = scanStr.nextLine();
                            System.out.print("Enter Product Price  : ");
                            double newProdP = scanDouble.nextDouble();

                            beveragesList.set(prodNum, new Product(newProdN, newProdP));
                            System.out.println("\nProduct edited successfully!");

                        }else{
                            System.out.println("Invalid Product Number.");
                        }

                        System.out.println("\nDo you want to continue?");
                        System.out.println("[1] Edit Beverages Product");
                        System.out.println("[0] Stop");
                        enterChoice();

                        if(choice.equals("1")){
                            loopEditProduct = true;

                        }else if (choice.equals("0")){
                            loopEditBeverages = false;

                        }else {
                            invalidChoice();
                        }
                    }

                }else if(choice.equals("3")){

                    boolean loopEditMedicine = true;

                    while (loopEditMedicine){

                        System.out.println("\nMEDICINE PRODUCT");
                        if(beveragesList.isEmpty()){
                            System.out.println("\nNo medicine product registered yet...");
                            loopEditMedicine = false;
                            break;
                        }else{
                            System.out.println("\nRegistered Product");
                            for (int i = 0; i < medicineList.size(); i++){
                                medicineList.get(i).viewProdInfo(i);
                            }
                        }

                        System.out.println("\nEDIT PRODUCT");
                        System.out.print("Enter Product Number : ");
                        int prodNum = scanInt.nextInt();
                        prodNum = prodNum - 1;

                        if(prodNum >= 0 && prodNum < medicineList.size()){

                            System.out.print("Enter Product Name   : ");
                            String newProdN = scanStr.nextLine();
                            System.out.print("Enter Product Price  : ");
                            double newProdP = scanDouble.nextDouble();

                            foodList.set(prodNum, new Product(newProdN, newProdP));
                            System.out.println("\nProduct edited successfully!");

                        }else{
                            System.out.println("Invalid Product Number.");
                        }

                        System.out.println("\nDo you want to continue?");
                        System.out.println("[1] Edit Medicine Product");
                        System.out.println("[0] Stop");
                        enterChoice();

                        if(choice.equals("1")){
                            loopEditProduct = true;

                        }else if (choice.equals("0")){
                            loopEditMedicine = false;

                        }else {
                            invalidChoice();
                        }
                    }

                }else if (choice.equals("0")){
                    loopEditProduct = false;

                }else{
                    invalidChoice();
                }
        }
    }


    //ADMIN DELETE PRODUCT
    public void AdminDeleteProduct(){

        boolean loopDeleteProduct = true;

        while (loopDeleteProduct) {

            System.out.println("\nDELETE PRODUCTS");
            System.out.println("[1] Food");
            System.out.println("[2] Beverages");
            System.out.println("[3] Medicine");
            System.out.println("[4] View All");
            System.out.println("[0] Back");
            enterChoice();

            if (choice.equals("1")) {
                System.out.println("\nFOOD PRODUCT");
                if (foodList.isEmpty()) {
                    System.out.println("\nNo food product registered yet...\n");
                    break;
                } else {
                    System.out.println("\nRegistered Product");
                    for (int i = 0; i < foodList.size(); i++) {
                        foodList.get(i).viewProdInfo(i);
                    }
                }

                System.out.println("\nDELETE PRODUCT");
                System.out.print("Enter Product Number : ");
                int prodNum = scanInt.nextInt();
                prodNum = prodNum - 1;

                if(prodNum >= 0 && prodNum < foodList.size()){

                    foodList.remove(prodNum);
                    System.out.println("\nProduct deleted successfully!");

                }else{
                    System.out.println("Invalid Staff Number.");
                }

            }else if (choice.equals("2")){
                System.out.println("\nBEVERAGES PRODUCT");
                if (beveragesList.isEmpty()) {
                    System.out.println("\nNo food product registered yet...\n");
                    break;
                } else {
                    System.out.println("\nRegistered Product");
                    for (int i = 0; i < beveragesList.size(); i++) {
                        beveragesList.get(i).viewProdInfo(i);
                    }
                }

                System.out.println("\nDELETE PRODUCT");
                System.out.print("Enter Product Number : ");
                int prodNum = scanInt.nextInt();
                prodNum = prodNum - 1;

                if(prodNum >= 0 && prodNum < beveragesList.size()){

                    beveragesList.remove(prodNum);
                    System.out.println("\nProduct deleted successfully!");

                }else{
                    System.out.println("Invalid Staff Number.");
                }

            }else if(choice.equals("3")){
                System.out.println("\nMEDICINE PRODUCT");
                if (foodList.isEmpty()) {
                    System.out.println("\nNo food product registered yet...\n");
                    break;
                } else {
                    System.out.println("\nRegistered Product");
                    for (int i = 0; i < medicineList.size(); i++) {
                        medicineList.get(i).viewProdInfo(i);
                    }
                }

                System.out.println("\nDELETE PRODUCT");
                System.out.print("Enter Product Number : ");
                int prodNum = scanInt.nextInt();
                prodNum = prodNum - 1;

                if(prodNum >= 0 && prodNum < medicineList.size()){

                    medicineList.remove(prodNum);
                    System.out.println("\nProduct deleted successfully!");

                }else{
                    System.out.println("Invalid Staff Number.");
                }

            }else if(choice.equals("0")){
                loopDeleteProduct = false;

            }else{
                invalidChoice();
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
    static Scanner scanDouble = new Scanner(System.in);


    //-----------------------------------------------
}
