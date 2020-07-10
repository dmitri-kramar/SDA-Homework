package adapter;

public class IOS {

    private int chargeLevel;

    public IOS(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public void chargeIOS() throws InterruptedException {
        System.out.println("Charging an IOS phone:");
        System.out.print(chargeLevel + "% ");

        for (int i = 0; i <= 10; i++) {
            Thread.sleep(300);
            System.out.print("|");
        }

        chargeLevel = 100;
        System.out.println(" " + chargeLevel + "%" + "\n");
    }
}
