package adapter;

public class Android implements AndroidCharger {

    private int chargeLevel;

    public Android(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    @Override
    public void charge(Object obj) throws InterruptedException {
        System.out.println("Charging an Android phone:");
        System.out.print(chargeLevel + "% ");

        for (int i = 0; i <= 10; i++) {
            Thread.sleep(300);
            System.out.print("|");
        }

        chargeLevel = 100;
        System.out.println(" " + chargeLevel + "%" + "\n");
    }
}
