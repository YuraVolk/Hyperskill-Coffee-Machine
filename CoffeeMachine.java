package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachineController controller = new CoffeeMachineController();

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();

            System.out.println();


            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                String choice = scanner.next();

                if (choice.equals("back")) {
                    continue;
                } else {
                    int numericChoice = Integer.parseInt(choice, 10);
                    controller.getCupOfCoffee(numericChoice);
                }



            } else if (action.equals("fill")) {
                System.out.println("Write how many ml of water do you want to add: ");
                int water = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add: ");
                int milk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                int beans = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                int cupsOfCoffee = scanner.nextInt();

                controller.fill(water, milk, beans, cupsOfCoffee);
            } else if (action.equals("take")) {
                controller.takeMoney();
            } else if (action.equals("remaining")) {
                controller.printStats();
            } else if (action.equals("exit")) {
                break;
            }

            System.out.println();
        }



    }
}
