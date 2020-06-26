package abstracts.exercise1;

public class Dog extends Animal {

    private static final String voice = "woof";

    public Dog(String name, int age) {
        super(voice, name, age);
    }

    @Override
    public void yieldVoice() {
        System.out.println(voice);
    }
}