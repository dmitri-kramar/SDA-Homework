package adapter;

public class AndroidChargerAdapter implements AndroidCharger {

    @Override
    public void charge(Object obj) throws InterruptedException {
        if (obj instanceof IOS) {
            ((IOS) obj).chargeIOS();
        } else if (obj instanceof WindowsPhone) {
            ((WindowsPhone) obj).chargeWindowsPhone();
        } else if (obj instanceof Android) {
            System.out.println("No need for adapter.");
        }
    }
}
