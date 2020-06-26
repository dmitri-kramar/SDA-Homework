package abstracts.exercise1;

public class Cat extends Animal {

    private static final String voice = "meow";

    public Cat(String name, int age) {
        super(voice, name, age);
    }

    @Override
    public void yieldVoice() {
        System.out.println(voice);
    }
}