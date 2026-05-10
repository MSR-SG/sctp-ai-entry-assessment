// Question 2 - Arrays and Loops
// Topic: Inventory Tracker
//
// Task 1:
// An ArrayList called inventory has been declared for you below.
//
// Task 2:
// Write a method called addItem(itemName) that adds the given item to the
// inventory list. If the item already exists, print a message instead of adding it.
// Example message: "Mouse is already in inventory."
//
// Task 3:
// Write a method called listInventory() that prints all items in the inventory.
// If the inventory is empty, print: "Inventory is empty."

/**
 * Author: Mohammed Shafique Ur Razzaque
 * Date: 10 May 2026
 * Description: Adds items to the inventory and lists them.
 */

import java.util.ArrayList;

public class Q2_java {

    static ArrayList<String> inventory = new ArrayList<>();     // Conains inventory items.

    public static void addItem(String itemName) {

        // Validate input. If itemName is null or empty string, reject addition to inventory.
        if (itemName == null || itemName.trim().isEmpty()) {
            System.out.println("Null or Empty item name cannot be inserted to inventory.");
            return;
        }

        itemName = itemName.trim();  // Trim leading and trailing spaces.
        if (inventory.contains(itemName) ) {  // Check if item is in inventory. 
            System.out.println(itemName + " is already in inventory.");
        } else {
            inventory.add(itemName);
        }
    }

    public static void listInventory() {

       if (inventory.isEmpty()) {          
            // If inventory is empty, print "Inventory is empty.".
            System.out.println("Inventory is empty.");
        } 
        else {                            
            // Print the items in inventory.
            System.out.println("Items in inventory: " + inventory);
            
            // In addition, print itemized list of inventory items.
            System.out.println("\nAdditional Details:");
            System.out.println("\nTotal items in inventory: " + inventory.size());
            System.out.println("Itemized list of inventory items:");

            for (int i = 0; i < inventory.size(); i++) {
                System.out.println("  Item # " + (i + 1) + ": " + inventory.get(i));
            }
        }
    }

    public static void main(String[] args) {
        addItem("Laptop");
        addItem("Mouse");
        addItem("Keyboard");
        addItem("Mouse");   // Will print the item is already in inventory.
        
        listInventory();

    }
}
