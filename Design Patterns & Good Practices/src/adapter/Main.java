package adapter;

// Write an adapter, which will connect not two,
// but three disparate interfaces. For example:
// You have IOS, Android and WindowsPhone classes;
// You also have one AndroidCharger. Aim is to charge
// all the other phone instances with Android Charger.

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Created three different phone objects.
        // Current charge level — in the brackets.

        Android samsung = new Android(67);
        IOS iphone = new IOS(56);
        WindowsPhone nokia = new WindowsPhone(34);

        // Created the all-in-one adapter object.

        AndroidChargerAdapter adapter = new AndroidChargerAdapter();

        // Charging the phones.

        samsung.charge(samsung);
        adapter.charge(iphone);
        adapter.charge(nokia);
        adapter.charge(samsung);
    }
}
