// Welcome to campus canteen
// Ask user for item in the menu and quantity of it
// if item not available in menu it will be invalid
// program will run in a loop until 0 is pressed
// when user press 0 it will output the receipt of the order and exits the program
// if order is 300 peso and above it will have 10 precent discount

import java.util.Scanner;

public class sabioCampusCanteen {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        String [] menu = {"Adobo rice", "Pancit canton", "Siopao", "Iced tea", "Bottled water"};
        int [] price = {75, 60, 35, 25, 20};
        int [] count = new int [menu.length];

        displayMenu(menu, price); // calls method

        while (true) {
            System.out.print("Enter item number (0 to finish): ");
            int item = scanner.nextInt();

            if (item == 0) { // if user press 0 finish the program
                printReceipt(menu, price, count);
                break;
            }

            if (item < 1 || item > menu.length) { // check if item is less than or greater than
                System.out.println("Invalid item"); // if both yes output invalid
                continue; // to continue loop if item is invalid
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            System.out.println("===============================================");

            if (quantity < 1) { // if less than 1 for quantity automatically invalid
                System.out.println("Invalid quantity.");
                continue; // to continue loop if quantity is invalid
            }

            int index = item - 1;
            updateCount(count, index, quantity); // calls method

            int total = computeTotal(price[index], quantity);
            System.out.println("Added: "+ quantity + "x " + menu[index] + " = " + "P" + total);
            System.out.println("===============================================");
        }
        scanner.close();
    }

    public static void displayMenu(String[] items, int[] prices) { // Display menu
        System.out.println("============== NU LAGUNA CANTEEN ==============");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - " + "P" + prices[i]);
        }
        System.out.println("===============================================");
    }

    public static void updateCount(int[] count, int index, int quantity) { // serve as a storage base on order of the user
        count[index] += quantity;
    }

    public static int computeTotal(int price, int quantity) { // compute total amount
        return price * quantity;
    }

    public static double computeDiscount(int total) { // compute discount
        if (total >= 300) {
            return total * 0.10;
        }
        return 0.0;
    }

    public static void printReceipt(String[] items, int[] price, int[] count) { // print receipt
        System.out.println("\n================== RECEIPT ====================");
        int total = 0;

        for (int i = 0; i < items.length; i++) {
            if (count[i] > 0) {
                int receiptTotal = computeTotal(price[i], count[i]);
                System.out.println(count[i] + "x " + items[i] + " = P" + receiptTotal);
                total += receiptTotal;
            }
        }

        double discount = computeDiscount(total); // check if it has discount
        double amount = total - discount; // 300 and above total gets the 10 percent discount

        System.out.println("Total: P" + total);
        System.out.println("Amount due: P" + amount);
        System.out.println("===============================================");
    }
}