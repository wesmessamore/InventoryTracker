import java.util.ArrayList;
import java.util.Scanner;

/**
 * created Feb 6, 2017 by Wes Messamore for Day 6 Homework Iron Yard Nashville
 * Inventory tracking system. Allows users to 1) create a new item by entering its
 * name, 2) remove the item by entering its number, 3) and update the quantity of
 * the item in stock.
 */

public class Main {

    public static void main(String[] args) {
        ArrayList<InventoryItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Inventory Tracker!");
        System.out.println("What is your username?");
        String userName = scanner.nextLine();

        System.out.println("What is your password?");

        while (true) {

            System.out.println("\n" + "==INVENTORY CONTROL PANEL==");
            System.out.println("PRESS 1 to see inventory list");
            System.out.println("PRESS 2 to add an item");
            System.out.println("PRESS 3 to remove an item");
            System.out.println("PRESS 4 to update the quantity in stock" + "\n");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                int i = 1;
                for (InventoryItem item : items) {
                    System.out.println(i + ". " + item.text + "(" + item.quantity + " in stock)");
                    i++;

                }

            }

            else if (option.equals("2")) {
                System.out.println("Enter new item name.");
                String itemName = scanner.nextLine();

                System.out.println("Enter new item quantity currently in stock.");
                int itemQuantity = Integer.parseInt(scanner.nextLine());

                InventoryItem item = new InventoryItem(itemName , itemQuantity);
                items.add(item);

            }

          else if (option.equals("3")){
                System.out.println("Enter item number to remove item.");

                int itemNum = Integer.parseInt(scanner.nextLine());
                items.remove(itemNum - 1);

                System.out.println("Item removed.");

            }

            else if (option.equals("4")){
                System.out.println("Enter item number to update quantity.");
                int itemNum = Integer.parseInt(scanner.nextLine());
                InventoryItem item = items.get(itemNum - 1);


                System.out.println("Enter the new quantity for the item you selected");
                int newQuantity = Integer.parseInt(scanner.nextLine());
                item.quantity = newQuantity;


            }


        }
    }

}
