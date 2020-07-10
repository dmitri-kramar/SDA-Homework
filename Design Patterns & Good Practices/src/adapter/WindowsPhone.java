package adapter;

public class WindowsPhone {

    private int chargeLevel;

    public WindowsPhone(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public void chargeWindowsPhone() throws InterruptedException {
        System.out.println("Charging an WindowsPhone phone:");
        System.out.print(chargeLevel + "% ");

        for (int i = 0; i <= 10; i++) {
            Thread.sleep(300);
            System.out.print("|");
        }

        chargeLevel = 100;
        System.out.println(" " + chargeLevel + "%" + "\n");
    }
}
