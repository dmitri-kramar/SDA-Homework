package encapsulation.exercise2;

// Create class Pocket.

public class Pocket {

    // Add field "money", create constructor, getter and setter.

    private Integer money;

    public Pocket(Integer money) {
        this.money = money;
    }

    // Add verification for both getter and setter. Getter should
    // result in returning as much money, as the user asked for.
    // It should return 0 if money <= 10

    public Integer getMoney(Integer money) {
        if (this.money <= 10) {
            return 0;
        } else {
            return money;
        }
    }

    // Setter should not accept values below 0 and greater than 3000.It may print
    // a message like "I don’t have enough space in my pocket for as much money!".

    public void setMoney(Integer money) {
        if (money <= 0) {
            System.out.println("Nothing to put in the pocket.");
        } else if (money > 3000) {
            System.out.println("Not enough space in the pocket.");
        } else {
            this.money = money;
        }
    }
}