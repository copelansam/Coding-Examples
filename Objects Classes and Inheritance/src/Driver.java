import java.util.Scanner;
import java.util.ArrayList;
public class Driver {
    public static void main(String[] args){
        ArrayList<Item> user = new ArrayList<Item>();
        System.out.println("[Grocery Store Simulator]");
        int selection = -1;
        Scanner scan = new Scanner(System.in);
        while (selection != 0) {
            System.out.println();
            System.out.println("Choose an option:");
            System.out.println("0) Quit");
            System.out.println("1) Add a new item");
            System.out.println("2) Pass time");
            System.out.println("3) Increase quantity of an item");
            System.out.println("4) Decrease quantity of an item");
            System.out.println("5) View items");
            selection = scan.nextInt();

            if (selection == 1){
                System.out.println("What item do you want to add?");
                System.out.println("0) Bread");
                System.out.println("1) Milk");
                System.out.println("2) Paper Towels");
                int itemSelect = scan.nextInt();
                scan.nextLine();
                switch (itemSelect){
                    case 0:
                        System.out.print("What is the name of the bread? ");
                        String name = scan.nextLine();
                        System.out.print("What will the price be? $");
                        double price = scan.nextDouble();
                        System.out.print("How many are being added? ");
                        int quantity = scan.nextInt();
                        System.out.print("How many days until it expires? ");
                        int expirationTime = scan.nextInt();
                        scan.nextLine();
                        System.out.print("What flavor is the bread? ");
                        String flavor = scan.nextLine();
                        System.out.print("Is the bread pre cut? (true/false) ");
                        String cut = scan.nextLine();
                        boolean preCut = false;
                        if (cut.equals("true")) {
                            preCut = true;
                        }
                        Item newItem = new Bread(name, price, quantity, expirationTime, flavor, preCut);
                        user.add(newItem);
                        System.out.println("New bread added to the store!");
                        break;
                    case 1:
                        System.out.print("What is the name of the milk? ");
                        name = scan.nextLine();
                        System.out.print("What will the price be? $");
                        price = scan.nextDouble();
                        System.out.print("How many are being added? ");
                        quantity = scan.nextInt();
                        System.out.print("How many days until it expires? ");
                        expirationTime = scan.nextInt();
                        scan.nextLine();
                        System.out.print("What flavor is the milk? ");
                        flavor = scan.nextLine();
                        newItem = new Milk(name, quantity, price, expirationTime, flavor);
                        user.add(newItem);
                        System.out.println("New milk has been added to the store!");
                        break;
                    case 2:
                        System.out.print("What is the name of the paper towels? ");
                        name = scan.nextLine();
                        System.out.print("How many are being added? ");
                        quantity = scan.nextInt();
                        System.out.print("How much does it cost? $");
                        price = scan.nextDouble();
                        System.out.print("How many sheets do they come with? ");
                        int sheets = scan.nextInt();
                        scan.nextLine();
                        System.out.print("What type of paper towels are they? ");
                        String type = scan.nextLine();
                        newItem = new PaperTowels(name, quantity, price, sheets, type);
                        System.out.println("New paper towels added to the store!");
                        user.add(newItem);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
            else if (selection == 2){
                System.out.print("How many days would you like to pass? ");
                int days = scan.nextInt();
                for (Item item: user){
                    if (item instanceof Bread){
                        ((Bread)item).TimePassing(days);
                        System.out.println(item.getName() +"'s current days until expiration: " + ((Bread) item).getExpirationTime());
                    }
                    else if (item instanceof Milk){
                        ((Milk)item).TimePassing(days);
                        System.out.println(item.getName() +"'s current days until expiration: " + ((Milk) item).getExpirationTime());
                    }
                }
            }

            else if (selection == 3){
                System.out.println("Which item would you like to increase the quantity of?");
                int counter = 1;
                for (Item item: user){

                    System.out.println(counter++ + ") " + item.toString());
                    System.out.println();
                }
                int addingSelect = scan.nextInt();
                System.out.print("By how much would you like to increase the quantity? ");
                int adding = scan.nextInt();
                user.get((addingSelect - 1)).addAmount(adding);
                System.out.println(adding + " was added to the quantity. " +
                        "\nCurrent quantity: " + user.get(addingSelect - 1).getQuantity());
            }
            else if (selection == 4){
                System.out.println("Which item would you like to decrease the quantity of?");
                int counter = 1;
                for (Item item: user){
                    System.out.println(counter++ + ") " +item.toString());
                    System.out.println();
                }
                int subtractSelect = scan.nextInt();
                System.out.print("By how much would you like to decrease the quantity? ");
                int subtracting = scan.nextInt();
                user.get((subtractSelect - 1)).subtractAmount(subtracting);
                System.out.println(subtracting + " was subtracted from the quantity. " +
                        "\nCurrent quantity: " + user.get(subtractSelect - 1).getQuantity());
            }
            else if (selection == 5){
                System.out.println("Current Inventory:");
                System.out.println();
                for (Item item: user){
                    System.out.println(item.toString());
                    System.out.println();
                }
            }
        }
        System.out.println("Store now closing");
    }
}
