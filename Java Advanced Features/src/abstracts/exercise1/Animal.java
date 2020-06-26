package abstracts.exercise1;

// Change Animal class to be abstract.

public abstract class Animal {

    private final String voice;
    private String name;
    private int age;

    public Animal(String voice, String name, int age) {
        this.voice = voice;
        this.name = name;
        this.age = age;
    }

    public String getVoice() {
        return voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Which methods should/may be abstract?

    public abstract void yieldVoice();
}