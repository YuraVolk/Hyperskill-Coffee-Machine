package machine;

public class CoffeeMachineController {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;
    private int neededWater;
    private int neededMilk;
    private int neededBeans;
    private int neededMoney;

    public CoffeeMachineController() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.cups = 9;
        this.money = 550;
    }

    private void setNeededResources(int type) {
        if (type == 1) {
            neededWater = 250;
            neededBeans = 16;
            neededMoney = 4;
        } else if (type == 2) {
            neededWater = 350;
            neededMilk = 75;
            neededBeans = 20;
            neededMoney = 7;
        } else {
            neededWater = 200;
            neededMilk = 100;
            neededBeans = 12;
            neededMoney = 6;
        }
    }

    public void getCupOfCoffee(int type) {
        setNeededResources(type);

        if (neededWater > water) {
            System.out.println("Sorry, not enough water!");
        } else if (neededMilk > milk) {
            System.out.println("Sorry, not enough milk!");
        } else if (neededBeans > coffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            water -= neededWater;
            milk -= neededMilk;
            coffeeBeans -= neededBeans;
            money += neededMoney;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public void printStats() {
        if (money == 0) {
            System.out.printf("The coffee machine has:\n" +
                            "%d of water\n" +
                            "%d of milk\n" +
                            "%d of coffee beans\n" +
                            "%d of disposable cups\n" +
                            "$%d of money\n", water, milk,
                    coffeeBeans, cups, money);
        } else {
            System.out.printf("The coffee machine has:\n" +
                            "%d of water\n" +
                            "%d of milk\n" +
                            "%d of coffee beans\n" +
                            "%d of disposable cups\n" +
                            "%d of money\n", water, milk,
                    coffeeBeans, cups, money);
        }

    }

    public void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += beans;
        this.cups += cups;
    }

    public void takeMoney() {
        System.out.printf("I gave you $%d\n", money);
        money = 0;
    }
}
